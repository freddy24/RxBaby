/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.gogogo.func.main;

import android.support.v4.app.Fragment;

import com.freddy.gogogo.R;
import com.freddy.gogogo.func.menu1.MenuOneFragment;
import com.freddy.gogogo.func.menu2.MenuTwoFragment;
import com.freddy.gogogo.func.menu3.MenuThreeFragment;
import com.freddy.gogogo.func.menu4.MenuFourFragment;

import java.util.ArrayList;
import java.util.List;

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
    public void subscriber() {

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

    @Override
    public List<Fragment> initFragments() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(MenuOneFragment.newInstance());
        fragments.add(MenuTwoFragment.newInstance());
        fragments.add(MenuThreeFragment.newInstance());
        fragments.add(MenuFourFragment.newInstance());
        return fragments;
    }


}
