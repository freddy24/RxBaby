/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.freddy.rxbaby.R;

import butterknife.ButterKnife;

/**
 * Description:
 * Created by freddy on 16/5/20.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        ButterKnife.bind(this);
    }
}
