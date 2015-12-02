package com.ah.mask.andreader.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.ah.mask.andreader.R;
import com.ah.mask.andreader.base.BaseFragment;
public class ViewPagerFragment2 extends BaseFragment{

    private View view;
    @Override
    protected View initView(LayoutInflater inflater) {
        view =inflater.inflate(R.layout.fragment_viewone,null);
        TextView tv = (TextView) view.findViewById(R.id.tv);
        tv.setText("ViewPager2");
        return view;
    }

    @Override
    protected void initDate(Bundle savedInstanceState) {

    }
}
