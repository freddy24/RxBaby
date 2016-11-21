/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu1;

import com.freddy.rxbaby.base.BasePrestener;
import com.freddy.rxbaby.base.BaseView;
import com.freddy.rxbaby.data.bean.HNumber;

import java.util.List;

/**
 * Description:
 * Created by freddy on 16/6/6.
 */
public class MenuOneContract {

    interface View extends BaseView<Presenter>{
        void showInputDialog(HNumber hNumber);
    }

    interface Presenter extends BasePrestener{

        List<HNumber> getNumbers();

        void refreshNumber(int position);
    }
}
