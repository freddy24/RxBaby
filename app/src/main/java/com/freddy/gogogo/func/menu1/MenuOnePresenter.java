/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu1;

import com.freddy.rxbaby.R;
import com.freddy.rxbaby.func.menu1.MenuOneContract.Presenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Created by freddy on 16/6/6.
 */
public class MenuOnePresenter implements MenuOneContract.Presenter{

    private MenuOneFragment view;

    public MenuOnePresenter(MenuOneFragment view){
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void subsciber() {

    }

    @Override
    public void unSubscriber() {

    }

    @Override
    public List<Integer> getImageIds() {
        List<Integer> imageIds = new ArrayList<>();
        imageIds.add(R.mipmap.banner_dafault_one);
        imageIds.add(R.mipmap.banner_default_two);
        return imageIds;
    }
}
