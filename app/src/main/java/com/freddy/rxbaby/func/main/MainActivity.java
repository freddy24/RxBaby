/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.main;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.freddy.babylib.utils.ActivityUtils;
import com.freddy.rxbaby.R;
import com.freddy.rxbaby.base.BaseActivity;
import com.freddy.rxbaby.func.main.MainFragment;
import com.freddy.rxbaby.func.main.MainPresenter;

import butterknife.ButterKnife;

/**
 * Description:
 * Created by freddy on 16/5/20.
 */
public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ActionBar actionBar = getSupportActionBar();
//        if (actionBar != null) {
//            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
//            actionBar.setDisplayHomeAsUpEnabled(true);
//        }
        MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.fl_content);
        if (mainFragment == null){
            //create fragment
            mainFragment = MainFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),mainFragment,R.id.fl_content);
        }

        MainPresenter presenter = new MainPresenter(mainFragment);
    }

}
