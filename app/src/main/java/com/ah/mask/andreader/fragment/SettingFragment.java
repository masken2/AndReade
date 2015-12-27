package com.ah.mask.andreader.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ah.mask.andreader.FeackActivity;
import com.ah.mask.andreader.LoginActivity;
import com.ah.mask.andreader.NewsVersionActivity;
import com.ah.mask.andreader.SettingActivity;
import com.ah.mask.andreader.base.BaseFragment;
import com.ah.mask.andreader.R;

/**
 * 新闻界面
 * Created by zhuangAh on 2015/11/26.
 */
public class SettingFragment extends BaseFragment implements View.OnClickListener {

    private View view = null;
    /**
     * 用户按钮
     */
    private ImageView userImage = null;
    /**
     * 系统设置
     */
    private RelativeLayout layout_setting = null;
    /**
     * 发现新版本
     */
    private LinearLayout layout_new_app = null;
    /**
     * 意见反馈
     */
    private ImageButton btn_feack = null;

    @Override
    protected View initView(LayoutInflater inflater) {
        view = inflater.inflate(R.layout.fragment_person, null);
        userImage = (ImageView) view.findViewById(R.id.img_person);
        layout_setting = (RelativeLayout) view.findViewById(R.id.layout_setting);
        layout_new_app = (LinearLayout) view.findViewById(R.id.layout_new_app);
        btn_feack = (ImageButton) view.findViewById(R.id.btn_feack);
        return view;
    }


    @Override
    protected void initDate(Bundle savedInstanceState) {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 点击事件
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_person:
                //用户登录界面
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.tv_login:
                //用户登录界面
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.layout_setting:
                //设置界面
                startActivity(new Intent(getActivity(), SettingActivity.class));
                break;
            case R.id.layout_new_app:
                //新版本界面
                startActivity(new Intent(getActivity(), NewsVersionActivity.class));
                break;
            case R.id.btn_feack:
                //意见反馈界面
                startActivity(new Intent(getActivity(), FeackActivity.class));
                break;
        }

    }
}
