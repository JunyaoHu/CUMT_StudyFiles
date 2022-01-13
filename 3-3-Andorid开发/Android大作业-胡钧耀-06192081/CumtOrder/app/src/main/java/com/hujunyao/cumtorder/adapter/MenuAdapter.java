package com.hujunyao.cumtorder.adapter;

import static com.hujunyao.cumtorder.utils.Constant.WEB_SITE;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.hujunyao.cumtorder.R;
import com.hujunyao.cumtorder.activity.FoodActivity;
import com.hujunyao.cumtorder.bean.FoodBean;

import java.util.List;


public class MenuAdapter extends BaseAdapter {
    private final Context context;
    private List<FoodBean> fbl;                   //菜单列表数据
    private OnSelectListener onSelectListener; //加入购物车按钮的监听事件

    public MenuAdapter(Context context, OnSelectListener onSelectListener) {
        this.context = context;
        this.onSelectListener=onSelectListener;
    }

    public void setData(List<FoodBean> fbl) {
        this.fbl = fbl;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() { return fbl == null ? 0 : fbl.size(); }

    @Override
    public FoodBean getItem(int position) { return fbl == null ? null : fbl.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        //复用convertView
        if (convertView == null) {
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.menu_item, null);
            vh.tv_food_name = (TextView) convertView.findViewById(R.id.tv_food_name);
            vh.tv_taste = (TextView) convertView.findViewById(R.id.tv_taste);
            vh.tv_sale_num = (TextView) convertView.findViewById(R.id.tv_sale_num);
            vh.tv_price = (TextView) convertView.findViewById(R.id.tv_price);
            vh.btn_add_car = (Button) convertView.findViewById(R.id.btn_add_car);
            vh.iv_food_pic = (ImageView) convertView.findViewById(R.id.iv_food_pic);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        //获取position对应的Item的数据对象
        FoodBean bean = getItem(position);
        if (bean != null) {
            vh.tv_food_name.setText(bean.getFoodName());
            vh.tv_taste.setText(bean.getTaste());
            vh.tv_sale_num.setText("月售" + bean.getSaleNum());
            vh.tv_price.setText("￥"+bean.getPrice());
            Glide.with(context)
                    .load(WEB_SITE +bean.getFoodPic())
                    .error(R.mipmap.ic_launcher)
                    .into(vh.iv_food_pic);
        }
        //每个Item的点击事件
        convertView.setOnClickListener(v -> {
            //跳转到菜品详情界面
            if (bean == null)return;
            Intent intent = new Intent(context, FoodActivity.class);
            //把菜品的详细信息传递到菜品详情界面
            intent.putExtra("food", bean);
            context.startActivity(intent);
        });
        vh.btn_add_car.setOnClickListener(view -> { //加入购物车按钮的点击事件
            onSelectListener.onSelectAddCar(position);
        });
        return convertView;
    }

    static class ViewHolder {
        public TextView tv_food_name, tv_taste, tv_sale_num, tv_price;
        public Button btn_add_car;
        public ImageView iv_food_pic;
    }
    public interface OnSelectListener {
        void onSelectAddCar (int position); //处理加入购物车按钮的方法
    }
}
