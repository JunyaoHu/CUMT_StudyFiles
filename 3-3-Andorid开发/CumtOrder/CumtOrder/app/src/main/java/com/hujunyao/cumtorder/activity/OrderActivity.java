package com.hujunyao.cumtorder.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hujunyao.cumtorder.R;
import com.hujunyao.cumtorder.adapter.OrderAdapter;
import com.hujunyao.cumtorder.bean.FoodBean;

import java.math.BigDecimal;
import java.util.List;

public class OrderActivity extends AppCompatActivity {
    private ListView lv_order;

    private OrderAdapter adapter;
    private List<FoodBean> carFoodList;
    private TextView tv_title,tv_back,tv_distribution_cost,tv_total_cost,
            tv_cost,tv_payment;
    private BigDecimal money, distributionCost;
    private EditText et_address;
    private ImageView iv_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        carFoodList = (List<FoodBean>) getIntent().getSerializableExtra("carFoodList");
        money = new BigDecimal(getIntent().getStringExtra("totalMoney"));
        distributionCost = new BigDecimal(getIntent().getStringExtra("distributionCost"));
        initView();
        setData();
    }

    private void initView(){
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_title.setText("订单");
        tv_back = (TextView) findViewById(R.id.tv_back);
        lv_order= (ListView) findViewById(R.id.lv_order);
        tv_distribution_cost = (TextView) findViewById(R.id.tv_distribution_cost);
        tv_total_cost = (TextView) findViewById(R.id.tv_total_cost);
        tv_cost = (TextView) findViewById(R.id.tv_cost);
        tv_payment = (TextView) findViewById(R.id.tv_payment);
        et_address = (EditText) findViewById(R.id.et_address);
        et_address.setHorizontallyScrolling(true);
        iv_address = (ImageView) findViewById(R.id.iv_address);

        //选择地址
        iv_address.setOnClickListener(V->{
            et_address.setText("矿大南湖计算机学院306");
        });

        // 返回键的点击事件
        tv_back.setOnClickListener(v -> finish());
        tv_payment.setOnClickListener(view -> { //“去支付”按钮的点击事件
//            Log.v("tag", et_address.getText().toString().trim());
            if (!(et_address.getText().toString().trim()).equals("")) {
                Dialog dialog = new Dialog(OrderActivity.this, R.style.Dialog_Style);
                dialog.setContentView(R.layout.qr_code);
                dialog.show();
            }
            else {
                Toast.makeText(this, "请输入您的地址", Toast.LENGTH_SHORT).show();
            }
        });
    }
    /**
     * 设置界面数据
     */
    private void setData() {
        adapter=new OrderAdapter(this);
        lv_order.setAdapter(adapter);
        adapter.setData(carFoodList);
        tv_cost.setText("￥"+money);
        tv_distribution_cost.setText("￥"+distributionCost);
        tv_total_cost.setText("￥"+(money.add(distributionCost)));
    }
}
