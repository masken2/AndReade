package com.ah.mask.andreader.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Administrator on 2015/12/2.
 * 可以控制滑动的ViewPager
 */
public class SlideViewpager extends ViewPager {

    /**
     * 判断是否可以滑动的标记
     */
    private static  boolean isSlide = true;

    public SlideViewpager(Context context) {
        super(context);
    }

    public SlideViewpager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
            return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onTouchEvent(MotionEvent ev) {
            return super.onTouchEvent(ev);
    }
}