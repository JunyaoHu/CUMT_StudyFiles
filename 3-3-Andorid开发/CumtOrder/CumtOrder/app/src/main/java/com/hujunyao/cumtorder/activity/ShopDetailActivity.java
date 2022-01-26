package com.hujunyao.cumtorder.activity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.hujunyao.cumtorder.R;
import com.hujunyao.cumtorder.adapter.CarAdapter;
import com.hujunyao.cumtorder.adapter.MenuAdapter;
import com.hujunyao.cumtorder.bean.FoodBean;
import com.hujunyao.cumtorder.bean.ShopBean;
import com.hujunyao.cumtorder.utils.Constant;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShopDetailActivity extends AppCompatActivity implements View.OnClickListener{
    private ShopBean bean;
    private TextView tv_shop_name, tv_time, tv_notice, tv_title, tv_back,
            tv_settle_accounts, tv_count, tv_money, tv_distribution_cost,
            tv_not_enough, tv_clear;
    private ImageView iv_shop_pic, iv_shop_car;
    private ListView lv_list, lv_car;
    public static final int MSG_COUNT_OK = 1;// 获取购物车中商品的数量
    private int totalCount = 0;
    private BigDecimal totalMoney;            //购物车中菜品的总价格
    private List<FoodBean> carFoodList;      //购物车中的菜品数据
    private MenuAdapter adapter;
    private CarAdapter carAdapter;
    private RelativeLayout rl_car_list;
    private MHandler mHandler;
    private ImageView iv_clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_detail);
        bean = (ShopBean) getIntent().getSerializableExtra("shop");
        if (bean == null) { return; }
        mHandler = new MHandler();
        totalMoney = new BigDecimal("0.0");//初始化变量totalMoney
        carFoodList = new ArrayList<>(); //初始化集合carFoodList
        initView();     //初始化界面控件
        initAdapter(); //初始化adapter
        setData();      //设置界面数据
    }

    @SuppressLint("ClickableViewAccessibility")
    private void initView() {
        tv_back = (TextView) findViewById(R.id.tv_back);
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_title.setText("店铺详情");
        tv_shop_name = (TextView) findViewById(R.id.tv_shop_name);
        tv_time = (TextView) findViewById(R.id.tv_time);
        tv_notice = (TextView) findViewById(R.id.tv_notice);
        iv_shop_pic = (ImageView) findViewById(R.id.iv_shop_pic);
        lv_list = (ListView) findViewById(R.id.lv_list);
        tv_settle_accounts = (TextView) findViewById(R.id.tv_settle_accounts);
        tv_distribution_cost = (TextView) findViewById(R.id.tv_distribution_cost);
        tv_count = (TextView) findViewById(R.id.tv_count);
        iv_shop_car = (ImageView) findViewById(R.id.iv_shop_car);
        tv_money = (TextView) findViewById(R.id.tv_money);
        tv_not_enough = (TextView) findViewById(R.id.tv_not_enough);
        tv_clear = (TextView) findViewById(R.id.tv_clear);
        iv_clear = (ImageView) findViewById(R.id.iv_clear);
        lv_car = (ListView) findViewById(R.id.lv_car);
        rl_car_list = findViewById(R.id.rl_car_list);
        //点击购物车列表界面外的其他部分会隐藏购物车列表界面
        rl_car_list.setOnTouchListener((v, event) -> {
            if (rl_car_list.getVisibility() == View.VISIBLE) {
                rl_car_list.setVisibility(View.GONE);
            }
            return false;
        });
        //设置返回键、去结算按钮、购物车图片、清空购物车按钮的点击监听事件
        tv_back.setOnClickListener(this);
        tv_settle_accounts.setOnClickListener(this);
        iv_shop_car.setOnClickListener(this);
        tv_clear.setOnClickListener(this);
        iv_clear.setOnClickListener(this);
    }

    private void initAdapter(){
        carAdapter = new CarAdapter(this, new CarAdapter.OnSelectListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onSelectAdd(int position, TextView tv_food_count, TextView tv_food_price) {
                //添加菜品到购物车中
                FoodBean bean = carFoodList.get(position);        //获取当前菜品对象
                tv_food_count.setText(bean.getCount() + 1 + ""); //设置该菜品在购物车中的数量
                BigDecimal count = BigDecimal.valueOf(bean.getCount() + 1);
                tv_food_price.setText("￥" + bean.getPrice().multiply(count));//菜品总价格
                bean.setCount(bean.getCount() + 1);//将当前菜品在购物车中的数量设置给菜品对象
                Iterator<FoodBean> iterator = carFoodList.iterator();
                while (iterator.hasNext()) {//遍历购物车中的数据
                    FoodBean food = iterator.next();
                    if (food.getFoodId() == bean.getFoodId()) {//找到当前菜品
                        iterator.remove();   //删除购物车中当前菜品的旧数据
                    }
                }
                carFoodList.add(position, bean); //将当前菜品的最新数据添加到购物车数据集合中
                totalCount = totalCount + 1;      //购物车中菜品的总数量+1
                //购物车中菜品的总价格+当前菜品价格
                totalMoney = totalMoney.add(bean.getPrice());
                carDataMsg();//将购物车中菜品的总数量和总价格通过Handler传递到主线程中
            }
            @SuppressLint("SetTextI18n")
            @Override
            public void onSelectMis(int position, TextView tv_food_count, TextView tv_food_price) {
                FoodBean bean = carFoodList.get(position);       //获取当前菜品对象
                tv_food_count.setText(bean.getCount() - 1 + "");//设置当前菜品的数量
                BigDecimal count = BigDecimal.valueOf(bean.getCount() - 1);
                //设置当前菜品总价格，菜品价格=菜品单价*菜品数量
                tv_food_price.setText("￥" + bean.getPrice().multiply(count));
                minusCarData(bean, position);//删除购物车中的菜品
            }
        });
        adapter = new MenuAdapter(this, position -> {
            //点击加入购物车按钮将菜添加到购物车中
            FoodBean fb = bean.getFoodList().get(position);
            fb.setCount(fb.getCount() + 1);
            Iterator<FoodBean> iterator = carFoodList.iterator();
            while (iterator.hasNext()) {
                FoodBean food = iterator.next();
                if (food.getFoodId() == fb.getFoodId()) {
                    iterator.remove();
                }
            }
            carFoodList.add(fb);
            totalCount = totalCount + 1;
            totalMoney = totalMoney.add(fb.getPrice());
            carDataMsg();
        });
        lv_list.setAdapter(adapter);
    }

    private void minusCarData(FoodBean bean, int position) {
        int count = bean.getCount() - 1; //将该菜品的数量减1
        bean.setCount(count);              //将减后的数量设置到菜品对象中
        Iterator<FoodBean> iterator = carFoodList.iterator();
        while (iterator.hasNext()) {     //遍历购物车中的菜
            FoodBean food = iterator.next();
            if (food.getFoodId() == bean.getFoodId()) {//找到购物车中当前菜的Id
                iterator.remove();         //删除存放的菜
            }
        }
        //如果当前菜品的数量减1之后大于0，则将当前菜品添加到购物车集合中
        if (count > 0) carFoodList.add(position, bean);
        else carAdapter.notifyDataSetChanged();
        totalCount = totalCount - 1; //购物车中菜品的数量减1
        //购物车中的总价钱=总价钱-当前菜品的价格
        totalMoney = totalMoney.subtract(bean.getPrice());
        carDataMsg();                  //调用该方法更新购物车中的数据
    }

    @SuppressLint("SetTextI18n")
    private void setData() {
        if (bean == null) return;
        tv_shop_name.setText(bean.getShopName()); //设置店铺名称
        tv_time.setText("大约用时"+bean.getTime()+"分钟");            //设置配送时间
        tv_notice.setText(bean.getShopNotice());  //设置店铺公告
        tv_not_enough.setText("￥" + bean.getOfferPrice() + "起送"); //设置起送价格
        Glide.with(this)
                .load(Constant.WEB_SITE + bean.getShopPic())
                .error(R.mipmap.ic_launcher)
                .into(iv_shop_pic);             //设置店铺图片
        adapter.setData(bean.getFoodList());//将菜单列表数据传递到adapter中
    }

    private void dialogClear() {
        //创建一个对话框Dialog
        final Dialog dialog = new Dialog(ShopDetailActivity.this, R.style.Dialog_Style);
        dialog.setContentView(R.layout.dialog_clear); //将布局文件加载到对话框中
        dialog.show();                                     //显示对话框
        TextView tv_clear = dialog.findViewById(R.id.tv_clear);  //获取对话框清除按钮
        TextView tv_cancel = dialog.findViewById(R.id.tv_cancel);//获取对话框取消按钮
        tv_cancel.setOnClickListener(view -> {
            dialog.dismiss();//关闭对话框
        });
        tv_clear.setOnClickListener(view -> {
            if (carFoodList == null) return;
            for (FoodBean bean : carFoodList) {
                bean.setCount(0);//设置购物车中所有菜品的数量为0
            }
            carFoodList.clear();//清空购物车中的数据
            carAdapter.notifyDataSetChanged();    //更新界面
            totalCount = 0;      //购物车中菜品的数量设置为0
            totalMoney = BigDecimal.valueOf(0.0);//总价格设置为0
            carDataMsg();        //通过Handler更新购物车中菜品的数量和总价格
            dialog.dismiss();   //关闭对话框
        });
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_back:               //返回按钮的点击事件
                finish();
                break;
            case R.id.tv_settle_accounts: //去结算按钮的点击事件
                //跳转到订单界面
                if (totalCount > 0) {
                    Intent intent = new Intent(ShopDetailActivity.this, OrderActivity.class);
                    intent.putExtra("carFoodList", (Serializable) carFoodList);
                    intent.putExtra("totalMoney", totalMoney + "");
                    intent.putExtra("distributionCost", bean.getDistributionCost() + "");
                    startActivity(intent);
                }
                break;
            case R.id.iv_shop_car:          //购物车的点击事件
                if (totalCount <= 0) return;
                if (rl_car_list != null) {
                    if (rl_car_list.getVisibility() == View.VISIBLE) {
                        rl_car_list.setVisibility(View.GONE);
                    } else {
                        rl_car_list.setVisibility(View.VISIBLE);
                        //创建一个从底部滑出的动画
                        Animation animation = AnimationUtils.loadAnimation(
                                ShopDetailActivity.this, R.anim.slide_bottom_to_top);
                        rl_car_list.startAnimation(animation);//将动画加载到购物车列表界面
                    }
                }
                carAdapter.setData(carFoodList);
                lv_car.setAdapter(carAdapter);
                break;
            case R.id.tv_clear://清空按钮的点击事件
            case R.id.iv_clear:
                dialogClear(); //弹出确认清空购物车的对话框
                break;
        }
    }

    private void carDataMsg() {
        Message msg = Message.obtain();
        msg.what = MSG_COUNT_OK;
        Bundle bundle = new Bundle();//创建一个Bundler对象
        //将购物车中的菜品数量和价格放入Bundler对象中
        bundle.putString("totalCount", totalCount + "");
        bundle.putString("totalMoney", totalMoney + "");
        msg.setData(bundle);        //将Bundler对象放入Message对象
        mHandler.sendMessage(msg); //将Message对象传递到MHandler类
    }

    @SuppressLint("HandlerLeak")
    class MHandler extends Handler {
        @SuppressLint("SetTextI18n")
        @Override
        public void dispatchMessage(Message msg) {
            super.dispatchMessage(msg);
            if (msg.what == MSG_COUNT_OK) {
                Bundle bundle = msg.getData();
                String count = bundle.getString("totalCount", "");
                String money = bundle.getString("totalMoney", "");
                if (Integer.parseInt(count) > 0) {//如果购物车中有菜品
                    iv_shop_car.setImageResource(R.drawable.shop_car);
                    tv_count.setVisibility(View.VISIBLE);
                    tv_distribution_cost.setVisibility(View.VISIBLE);
                    tv_money.setTextColor(Color.parseColor("#ffffff"));
                    tv_money.getPaint().setFakeBoldText(true);//加粗字体
                    tv_money.setText("￥" + money);//设置购物车中菜品总价格
                    tv_count.setText(count);        //设置购物车中菜品总数量
                    tv_distribution_cost.setText("另需配送费￥" + bean.getDistributionCost());
                    //将变量money的类型转换为BigDecimal类型
                    BigDecimal bdm = new BigDecimal(money);
                    //总价格money与起送价格对比
                    int result = bdm.compareTo(bean.getOfferPrice());
                    if (result < 0) { //总价格<起送价格
                        tv_settle_accounts.setVisibility(View.GONE);//隐藏去结算按钮
                        tv_not_enough.setVisibility(View.VISIBLE);   //显示差价文本
                        //差价=起送价格-总价格
                        BigDecimal m = bean.getOfferPrice().subtract(bdm);
                        tv_not_enough.setText("还差￥" + m + "起送");
                    } else { //总价格>=起送价格
                        //显示去结算按钮
                        tv_settle_accounts.setVisibility(View.VISIBLE);
                        tv_not_enough.setVisibility(View.GONE); //隐藏差价文本
                    }
                } else { //如果购物车中没有菜品
                    if (rl_car_list.getVisibility() == View.VISIBLE) {
                        rl_car_list.setVisibility(View.GONE); //隐藏购物车列表
                    } else {
                        rl_car_list.setVisibility(View.VISIBLE);//显示购物车列表
                    }
                    iv_shop_car.setImageResource(R.drawable.shop_car_empty);
                    tv_settle_accounts.setVisibility(View.GONE);//隐藏去结算按钮
                    tv_not_enough.setVisibility(View.VISIBLE);   //显示差价文本
                    tv_not_enough.setText("￥" + bean.getOfferPrice() + "起送");
                    tv_count.setVisibility(View.GONE);//隐藏购物中的菜品数量控件
                    tv_distribution_cost.setVisibility(View.GONE);//隐藏配送费用
                    tv_money.setTextColor(getResources().getColor(R.color.light_gray, null));
                    tv_money.setText("未选购商品");
                }
            }
        }
    }

}
