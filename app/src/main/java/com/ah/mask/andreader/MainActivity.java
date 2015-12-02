package com.ah.mask.andreader;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.ah.mask.andreader.adapter.MainFragmentAdapter;
import com.ah.mask.andreader.base.BaseActivity;
import com.ah.mask.andreader.base.BaseFragment;
import com.ah.mask.andreader.fragment.FriendsFragment;
import com.ah.mask.andreader.fragment.MemoryFragment;
import com.ah.mask.andreader.fragment.NewsFragment;
import com.ah.mask.andreader.fragment.SettingFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private ViewPager mViewPager;
    private MainFragmentAdapter adapter;
    private List<BaseFragment> mFragments;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * 初始化界面数据
     */
    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mFragments=new ArrayList<>();
        mFragments.add(new NewsFragment());
        mFragments.add(new FriendsFragment());
        mFragments.add(new MemoryFragment(mContext));
        mFragments.add(new SettingFragment());
        adapter =new MainFragmentAdapter(getSupportFragmentManager(),mFragments);
        mViewPager.setOffscreenPageLimit(4);
        mViewPager.setAdapter(adapter);
    }
}
