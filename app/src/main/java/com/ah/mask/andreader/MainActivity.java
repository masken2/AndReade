package com.ah.mask.andreader;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.ah.mask.andreader.adapter.MainFragmentAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private MainFragmentAdapter adapter;
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

    }
}
