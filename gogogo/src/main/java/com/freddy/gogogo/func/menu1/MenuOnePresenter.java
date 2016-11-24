/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.gogogo.func.menu1;

import com.freddy.gogogo.data.Constant;
import com.freddy.gogogo.data.bean.HNumber;

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
