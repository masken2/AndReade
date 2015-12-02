package com.ah.mask.andreader.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.ah.mask.andreader.base.BaseFragment;
import com.ah.mask.andreader.R;

import in.srain.cube.image.CubeImageView;
import in.srain.cube.image.ImageLoader;
import in.srain.cube.image.ImageLoaderFactory;

/**
 * 新闻界面
 * Created by zhuangAh on 2015/11/26.
 */
public class MemoryFragment extends BaseFragment {

    private View view;
    private Context mContext;

    public MemoryFragment(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    protected View initView(LayoutInflater inflater) {
        view = inflater.inflate(R.layout.frgment_meomory, null);
        return view;
    }

    @Override
    protected void initDate(Bundle savedInstanceState) {

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
