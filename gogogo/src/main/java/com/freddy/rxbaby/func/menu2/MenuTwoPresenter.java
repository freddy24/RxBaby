/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu2;

import com.freddy.rxbaby.data.Constant;
import com.freddy.rxbaby.data.bean.Animal;

import java.util.List;

/**
 * Description:
 * Created by freddy on 16/6/14.
 */
public class MenuTwoPresenter implements MenuTwoContract.Presenter {

    private MenuTwoFragment view;

    public MenuTwoPresenter(MenuTwoFragment view){
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void subscriber() {

    }

    @Override
    public void unSubscriber() {

    }


    @Override
    public List<Animal> getAnimals() {
        return Constant.animals;
    }
}
