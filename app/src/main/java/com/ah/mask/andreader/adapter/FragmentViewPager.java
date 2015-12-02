package com.ah.mask.andreader.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ah.mask.andreader.base.BaseFragment;

import java.util.List;

public class FragmentViewPager extends FragmentPagerAdapter {

    private List<BaseFragment> mBaseFragment;

    public FragmentViewPager(FragmentManager fm, List<BaseFragment> mBaseFragment) {
        super(fm);
        this.mBaseFragment = mBaseFragment;
    }

    @Override
    public Fragment getItem(int position) {
        return mBaseFragment.get(position);
    }

    @Override
    public int getCount() {
        return mBaseFragment.size();
    }
}
