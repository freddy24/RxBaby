/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.gogogo.func.menu1;

import com.freddy.gogogo.base.BasePrestener;
import com.freddy.gogogo.base.BaseView;
import com.freddy.gogogo.data.bean.HNumber;

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
