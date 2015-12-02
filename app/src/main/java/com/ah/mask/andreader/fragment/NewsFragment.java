package com.ah.mask.andreader.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;

import com.ah.mask.andreader.R;
import com.ah.mask.andreader.adapter.FragmentViewPager;
import com.ah.mask.andreader.base.BaseFragment;
import com.ah.mask.andreader.view.SlideViewpager;

import java.util.ArrayList;
import java.util.List;

/**
 * 新闻界面
 * Created by zhuangAh on 2015/11/26.
 */
public class NewsFragment extends BaseFragment {

    private View view;
    private SlideViewpager viewPager;

    @Override
    protected View initView(LayoutInflater inflater) {
        view = inflater.inflate(R.layout.fragment_news, null);
        viewPager = (SlideViewpager) view.findViewById(R.id.view_pager);
        return view;
    }

    @Override
    protected void initDate(Bundle savedInstanceState) {
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<BaseFragment> mBaseFragment = new ArrayList<>();
        mBaseFragment.add(new ViewpagerFragment1());
        mBaseFragment.add(new ViewPagerFragment2());
        FragmentPagerAdapter adapter = new FragmentViewPager(getChildFragmentManager(), mBaseFragment);
        viewPager.setAdapter(adapter);
    }
}
