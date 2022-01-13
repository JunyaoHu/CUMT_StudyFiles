package com.hujunyao.cumtorder.adapter;

import static com.hujunyao.cumtorder.utils.Constant.WEB_SITE;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.hujunyao.cumtorder.R;
import com.hujunyao.cumtorder.activity.ShopDetailActivity;
import com.hujunyao.cumtorder.bean.ShopBean;

import java.util.List;

public class ShopAdapter extends BaseAdapter {
    private final Context context;
    private List<ShopBean> sbl;

    public ShopAdapter(Context context) { this.context = context; }

    public void setData(List<ShopBean> sbl) {
        this.sbl = sbl;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() { return sbl == null ? 0 : sbl.size(); }

    @Override
    public ShopBean getItem(int position) { return sbl == null ? null : sbl.get(position);}

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        //复用convertView
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.shop_item,null);
            vh = new ViewHolder();
            vh.tv_shop_name = (TextView) convertView.findViewById(R.id.tv_shop_name);
            vh.tv_sale_num = (TextView) convertView.findViewById(R.id.tv_sale_num);
            vh.tv_cost = (TextView) convertView.findViewById(R.id.tv_cost);
            vh.tv_welfare = (TextView) convertView.findViewById(R.id.tv_welfare);
            vh.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
            vh.iv_shop_pic = (ImageView) convertView.findViewById(R.id.iv_shop_pic);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        //获取position对应的Item的数据对象
        ShopBean bean = getItem(position);
        if (bean != null) {
            vh.tv_shop_name.setText(bean.getShopName());
            vh.tv_sale_num.setText("月售" + bean.getSaleNum());
            vh.tv_cost.setText("起送￥" + bean.getOfferPrice() + "|配送￥" +
                    bean.getDistributionCost());
            vh.tv_time.setText("大约用时"+bean.getTime()+"分钟");
            vh.tv_welfare.setText(bean.getWelfare());
            Glide.with(context)
                    .load(WEB_SITE + bean.getShopPic())
                    .error(R.mipmap.ic_launcher)
                    .into(vh.iv_shop_pic);
        }
        //每个Item的点击事件
        convertView.setOnClickListener(v -> {
            //跳转到店铺详情界面
            if (bean == null) return;
            Intent intent = new Intent(context, ShopDetailActivity.class);
            //把店铺的详细信息传递到店铺详情界面
            intent.putExtra("shop", bean);
            context.startActivity(intent);

        });
        return convertView;
    }
    static class ViewHolder {
        TextView tv_shop_name, tv_sale_num, tv_cost, tv_welfare, tv_time;
        ImageView iv_shop_pic;
    }
}