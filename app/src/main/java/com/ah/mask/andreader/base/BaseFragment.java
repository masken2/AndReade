package com.ah.mask.andreader.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragmnet的基类，所有使用Fragment都继承
 * Created by zhuangAH on 2015/11/26.
 */
public abstract class BaseFragment extends Fragment {

    private  View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = initView(inflater);
        return view;
    }

    /**
     *init view
     */
    protected  abstract View initView(LayoutInflater inflater);

    /**
     * init Date
     */
    protected abstract void initDate(Bundle savedInstanceState);
}
