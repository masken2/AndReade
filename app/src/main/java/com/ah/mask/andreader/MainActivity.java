package com.ah.mask.andreader;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.ah.mask.andreader.adapter.MainFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private MainFragmentAdapter adapter;
    private List<BaseFragment> mFragments;
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
        adapter =new MainFragmentAdapter(getSupportFragmentManager(),mFragments);
        mViewPager.setOffscreenPageLimit(4);
        mViewPager.setAdapter(adapter);
    }
}
