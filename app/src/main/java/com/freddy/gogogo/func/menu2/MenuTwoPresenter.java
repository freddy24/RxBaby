/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu2;

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
    public void subsciber() {

    }

    @Override
    public void unSubscriber() {

    }

    @Override
    public String[] getSearchTexts() {
        String[] texts = new String[26];
        char a = 'a';
        for (int i=0; i< 26; i++){
            texts[i] = String.valueOf(a+i);
        }
        return texts;
    }
}
