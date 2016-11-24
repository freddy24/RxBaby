/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.gogogo.func.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.freddy.babylib.utils.ActivityUtils;
import com.freddy.gogogo.R;
import com.freddy.gogogo.base.BaseActivity;
import com.freddy.gogogo.func.record.RecordFragment;
import com.freddy.gogogo.func.setting.SettingFragment;
import com.orhanobut.logger.Logger;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Description:
 * Created by freddy on 16/5/20.
 */
public class MainActivity extends BaseActivity {
    private static final int[] icons = new int[]{R.drawable.menu1_selector, R.drawable.menu2_selector, R.drawable.menu3_selector, R.drawable.menu4_selector};
    private static final String[] texts = new String[]{"主页","活动","消息","我"};

    @Bind(R.id.tl_tabs)
    TabLayout tlTabs;

    private int curTag = 0;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        ButterKnife.bind(this);
        MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.fl_content);
        if (mainFragment == null){
            //create fragment
            mainFragment = MainFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),mainFragment,R.id.fl_content,MainFragment.class.getSimpleName());
        }
        MainPresenter presenter = new MainPresenter(mainFragment);

        initTabLayout();
    }

    private void initTabLayout(){
        tlTabs.addTab(tlTabs.newTab().setCustomView(getTabView(0)),true);
        tlTabs.addTab(tlTabs.newTab().setCustomView(getTabView(1)));
        tlTabs.addTab(tlTabs.newTab().setCustomView(getTabView(2)));
        tlTabs.addTab(tlTabs.newTab().setCustomView(getTabView(3)));
        tlTabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Logger.i("tab position is %d", tab.getPosition());
                switchFragment(getCurrentFragmentClass(curTag),getCurrentFragmentClass(tab.getPosition()),new Bundle());
                curTag = tab.getPosition();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Logger.i("onTabUnselected");
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Logger.i("onTabReselected");
            }
        });
    }

    private View getTabView(int position){
        View view = LayoutInflater.from(this).inflate(R.layout.menu_item_layout, tlTabs, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_icon);
        TextView textView = (TextView) view.findViewById(R.id.tv_text);
        imageView.setImageResource(icons[position]);
        textView.setText(texts[position]);
        return view;
    }

    private Class<? extends Fragment> getCurrentFragmentClass(int curTag) {
        Class<? extends Fragment> clazz = null;
        switch (curTag) {
            case 0:
                clazz = MainFragment.class;
                break;
            case 1:
                clazz = MainFragment.class;
                break;
            case 2:
                clazz = RecordFragment.class;
                break;
            case 3:
                clazz = SettingFragment.class;
                break;
        }
        return clazz;
    }
}
