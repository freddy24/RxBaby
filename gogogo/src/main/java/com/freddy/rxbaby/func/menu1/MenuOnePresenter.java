/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu1;

import com.freddy.rxbaby.R;
import com.freddy.rxbaby.data.Constant;
import com.freddy.rxbaby.data.bean.HNumber;
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
    public void subscriber() {

    }

    @Override
    public void unSubscriber() {

    }

    @Override
    public List<HNumber> getNumbers() {
        return Constant.hNumbers;
    }

    @Override
    public void refreshNumber(int position) {
        if (!getNumbers().get(position).isChoose()){
            getNumbers().get(position).setChoose(true);
            //弹出输入框dialog
            view.showInputDialog(getNumbers().get(position));
        }else{
            getNumbers().get(position).setChoose(false);
        }
    }
}
