package com.ah.mask.andreader.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ah.mask.andreader.BaseFragment;

import java.util.List;

/**
 * Fragmetn的适配器
 * Created by Administrator on 2015/11/26.
 */
public class MainFragmentAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> mFragments;
    private Context mContext;
    public MainFragmentAdapter(FragmentManager fm, List<BaseFragment> mFragments) {
        super(fm);
        this.mFragments = mFragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
