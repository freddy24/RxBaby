package com.freddy.rxbaby.func.menu4;

/**
 *
 * Created by wujinpeng on 2016/11/24.
 */
public class MenuFourPresenter implements MenuFourContract.Presenter {
    private MenuFourContract.View mView;
    public MenuFourPresenter(MenuFourContract.View view){
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
