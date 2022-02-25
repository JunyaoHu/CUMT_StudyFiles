package com.hujunyao.cumtorder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hujunyao.cumtorder.R;
import com.hujunyao.cumtorder.bean.FoodBean;

import java.math.BigDecimal;
import java.util.List;


public class CarAdapter extends BaseAdapter {
    private Context context;
    private List<FoodBean> fbl;
    private OnSelectListener onSelectListener;
    public CarAdapter(Context context, OnSelectListener onSelectListener) {
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        //复用convertView
        if (convertView == null) {
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.car_item, null);
            vh.tv_food_name = (TextView) convertView.findViewById(R.id.tv_food_name);
            vh.tv_food_count = (TextView) convertView.findViewById(R.id.tv_food_count);
            vh.tv_food_price = (TextView) convertView.findViewById(R.id.tv_food_price);
            vh.iv_add = (ImageView) convertView.findViewById(R.id.iv_add);
            vh.iv_minus = (ImageView) convertView.findViewById(R.id.iv_minus);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        //获取position对应的Item的数据对象
        final FoodBean bean = getItem(position);
        if (bean != null) {
            vh.tv_food_name.setText(bean.getFoodName());
            vh.tv_food_count.setText(bean.getCount()+"");
            BigDecimal count=BigDecimal.valueOf(bean.getCount());
            vh.tv_food_price.setText("￥" + bean.getPrice().multiply(count));
        }
        vh.iv_add.setOnClickListener(view ->
                onSelectListener.onSelectAdd(position,vh.tv_food_count,vh.tv_food_price));
        vh.iv_minus.setOnClickListener(view
                -> onSelectListener.onSelectMis(position,vh.tv_food_count,vh.tv_food_price));
        return convertView;
    }
    class ViewHolder {
        public TextView tv_food_name, tv_food_count,tv_food_price;
        public ImageView iv_add,iv_minus;
    }
    public interface OnSelectListener {
        void onSelectAdd(int position,TextView tv_food_price,TextView tv_food_count);
        void onSelectMis(int position,TextView tv_food_price,TextView tv_food_count);
    }
}
