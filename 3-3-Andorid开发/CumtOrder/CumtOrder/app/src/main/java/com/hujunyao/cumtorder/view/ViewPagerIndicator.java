package com.hujunyao.cumtorder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.hujunyao.cumtorder.R;

public class ViewPagerIndicator extends LinearLayout {

    private int mCount; //小圆点的个数
    private int mIndex;     //当前小圆点的位置
    private Context context;

    public ViewPagerIndicator(Context context) {
        this(context,null);
    }

    public ViewPagerIndicator(Context context,AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        setGravity(Gravity.CENTER);  //设置小圆点布局居中
    }

    //设置滑动到当前小圆点时其他小圆点的位置
    public void setCurrentPosition(int currentIndex){
        mIndex = currentIndex;  //当前小圆点
        removeAllViews();   //移除界面上存在的view
        int pex = 5;
        for (int i=0;i<mCount;i++){
            ImageView imageView = new ImageView(context);
            if (mIndex == i){   //滑到当前界面
                //蓝色小圆点
                imageView.setImageResource(R.drawable.indicator_on);
            }else{
                //灰色小圆点
                imageView.setImageResource(R.drawable.indicator_off);
            }
            imageView.setPadding(pex,0,pex,0);
            addView(imageView);
        }
    }

    //设置小圆点的数目
    public void setCount(int count){
        this.mCount = count;
    }
}
