/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.gogogo.func.menu2;

import com.freddy.gogogo.data.Constant;
import com.freddy.gogogo.data.bean.Animal;

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
