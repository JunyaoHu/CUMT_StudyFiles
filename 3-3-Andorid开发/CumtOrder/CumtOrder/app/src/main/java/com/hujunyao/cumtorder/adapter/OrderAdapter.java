package com.hujunyao.cumtorder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.hujunyao.cumtorder.R;
import com.hujunyao.cumtorder.bean.FoodBean;
import com.hujunyao.cumtorder.utils.Constant;

import java.math.BigDecimal;
import java.util.List;


public class OrderAdapter extends BaseAdapter {
    private Context context;
    private List<FoodBean> fbl;
    public OrderAdapter(Context context) {
        this.context = context;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        //复用convertView
        if (convertView == null) {
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.order_item, null);
            vh.tv_food_name = (TextView) convertView.findViewById(R.id.tv_food_name);
            vh.tv_count = (TextView) convertView.findViewById(R.id.tv_count);
            vh.tv_money = (TextView) convertView.findViewById(R.id.tv_money);
            vh.iv_food_pic = (ImageView) convertView.findViewById(R.id.iv_food_pic);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        //获取position对应的Item的数据对象
        final FoodBean bean = getItem(position);
        if (bean != null) {
            vh.tv_food_name.setText(bean.getFoodName());
            vh.tv_count.setText("×"+bean.getCount());
            vh.tv_money.setText("￥"+ bean.getPrice().
                    multiply(BigDecimal.valueOf(bean.getCount())));
            Glide.with(context)
                    .load(Constant.WEB_SITE + bean.getFoodPic())
                    .error(R.mipmap.ic_launcher)
                    .into(vh.iv_food_pic);
        }
        return convertView;
    }
    class ViewHolder {
        public TextView tv_food_name, tv_count, tv_money;
        public ImageView iv_food_pic;
    }
}
