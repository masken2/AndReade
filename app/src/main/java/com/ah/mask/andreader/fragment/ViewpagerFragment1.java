package com.ah.mask.andreader.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.ah.mask.andreader.R;
import com.ah.mask.andreader.base.BaseFragment;

public class ViewpagerFragment1 extends BaseFragment{

    private View view;
    @Override
    protected View initView(LayoutInflater inflater) {
        view =inflater.inflate(R.layout.fragment_viewone,null);
        return view;
    }

    @Override
    protected void initDate(Bundle savedInstanceState) {

    }
}
