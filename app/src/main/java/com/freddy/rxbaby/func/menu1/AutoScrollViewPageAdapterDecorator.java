/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu1;

import android.view.View;
import android.view.ViewGroup;

import com.freddy.babylib.widget.autoscrollvp.RecyclingPagerAdapter;

/**
 * Description:
 * Created by freddy on 16/6/7.
 */
public class AutoScrollViewPageAdapterDecorator extends RecyclingPagerAdapter {

    private MenuOneFragment.AutoScrollViewPagerAdapter adapter;

    public AutoScrollViewPageAdapterDecorator(MenuOneFragment.AutoScrollViewPagerAdapter adapter){
        this.adapter = adapter;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup container) {
        return adapter.getView(position, convertView, container);
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }
}
