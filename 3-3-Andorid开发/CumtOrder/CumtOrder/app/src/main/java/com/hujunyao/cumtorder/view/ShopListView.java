package com.hujunyao.cumtorder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class ShopListView extends ListView {
    public ShopListView(Context context) {
        super(context);
    }
    public ShopListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public ShopListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int heightSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        //view 30位数，取Int最大值32位减少两位，模式是所有子控件高度
        super.onMeasure(widthMeasureSpec, heightSpec);
    }
}
