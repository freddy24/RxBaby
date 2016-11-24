package com.freddy.gogogo.func.menu3;

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
