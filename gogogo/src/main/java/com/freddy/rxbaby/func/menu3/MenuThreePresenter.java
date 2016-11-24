package com.freddy.rxbaby.func.menu3;

import com.freddy.rxbaby.base.BasePrestener;

/**
 *
 * Created by wujinpeng on 2016/11/24.
 */
public class MenuThreePresenter implements MenuThreeContract.Presenter {
    private MenuThreeContract.View mView;
    public MenuThreePresenter(MenuThreeContract.View view){
        this.mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void subscriber() {

    }

    @Override
    public void unSubscriber() {

    }
}
