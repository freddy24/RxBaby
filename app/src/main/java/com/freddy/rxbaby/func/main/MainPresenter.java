/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.main;

import com.freddy.rxbaby.R;

/**
 * Description://TODO
 * Created by freddy on 16/6/2.
 */
public class MainPresenter implements MainContract.Presenter{

    private static final int[] icons = new int[]{R.drawable.menu1_selector, R.drawable.menu2_selector, R.drawable.menu3_selector, R.drawable.menu4_selector};
    private static final String[] texts = new String[]{"主页","活动","消息","我"};

    private MainFragment mainView;

    public MainPresenter(MainFragment fragment){
        this.mainView = fragment;
        fragment.setPresenter(this);
    }

    @Override
    public void subsciber() {

    }

    @Override
    public void unSubscriber() {

    }

    @Override
    public int[] initMenuIcon() {
        return icons;
    }

    @Override
    public String[] initMenuText() {
        return texts;
    }
}
