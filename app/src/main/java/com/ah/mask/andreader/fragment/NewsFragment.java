package com.ah.mask.andreader.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.ah.mask.andreader.base.BaseFragment;
import com.ah.mask.andreader.R;

/**
 * 新闻界面
 * Created by zhuangAh on 2015/11/26.
 */
public class NewsFragment extends BaseFragment {

    private View view;
    @Override
    protected View initView(LayoutInflater inflater) {
        view =inflater.inflate(R.layout.fragment_news,null);
        return view;
    }

    @Override
    protected void initDate(Bundle savedInstanceState) {

    }
}
