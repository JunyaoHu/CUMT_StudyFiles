package com.hujunyao.cumtorder.activity;


import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hujunyao.cumtorder.R;
import com.hujunyao.cumtorder.adapter.ImageAdapter;
import com.hujunyao.cumtorder.adapter.ShopAdapter;
import com.hujunyao.cumtorder.bean.DataBean;
import com.hujunyao.cumtorder.bean.ShopBean;
import com.hujunyao.cumtorder.utils.Constant;
import com.hujunyao.cumtorder.utils.JsonParse;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnPageChangeListener;
import com.youth.banner.transformer.ScaleInTransformer;


import java.io.IOException;
import java.util.List;
import java.util.Objects;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class ShopActivity extends AppCompatActivity implements OnPageChangeListener {
    private TextView tvTitle, tvBack;
    private ListView lvShopList;
    private ShopAdapter adapter;
    private Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        initView();
        initData();
    }

    private void initView() {
        tvBack = (TextView) findViewById(R.id.tv_back);
        tvTitle = findViewById(R.id.tv_title);
        lvShopList = findViewById(R.id.lv_shop_list);
        adapter = new ShopAdapter(this);
        lvShopList.setAdapter(adapter);
        tvTitle.setText("首页");
        tvBack.setVisibility(View.GONE);

        banner = (Banner) findViewById(R.id.banner);

        ImageAdapter bannerImageAdapter = new ImageAdapter(DataBean.getTestData());

        banner.setAdapter(bannerImageAdapter)//设置适配器
                .setCurrentItem(0,false)
                .addBannerLifecycleObserver(this)//添加生命周期观察者
                .addPageTransformer(new ScaleInTransformer())//添加切换效果
                .setIndicator(new CircleIndicator(this));//设置指示器

    }

    private void initData() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(Constant.WEB_SITE + Constant.REQUEST_SHOP_URL).build();
//        Request request = new Request.Builder().url("http://10.0.2.2:8080/order/shop_list_data.json").build();
        Call call = okHttpClient.newCall(request);
        // 异步线程访问网络
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String json = Objects.requireNonNull(response.body()).string(); //获取店铺数据
                Log.v("tag", "json: " + json);
                final List<ShopBean> list = JsonParse.getInstance().getShopList(json);
                runOnUiThread(() -> adapter.setData(list));
            }
            @Override
            public void onFailure(Call call, IOException e) {
                Log.v("tag", "你这网络不行啊" );
            }
        });
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) { }

    @Override
    public void onPageSelected(int position) { }

    @Override
    public void onPageScrollStateChanged(int state) { }

    protected long exitTime;//记录第一次点击时的时间
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                Toast.makeText(ShopActivity.this, "再按一次退出订餐应用",
                        Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                ShopActivity.this.finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}