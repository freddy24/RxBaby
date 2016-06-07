/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.babylib.widget.autoscrollvp;

import android.view.View;
import android.view.ViewGroup;

/**
 * Description:
 * Created by freddy on 16/6/7.
 */
public class AutoScrollViewPageAdapterDecorator extends RecyclingPagerAdapter {

    private RecyclingPagerAdapter adapter;

    public AutoScrollViewPageAdapterDecorator(RecyclingPagerAdapter adapter){
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
