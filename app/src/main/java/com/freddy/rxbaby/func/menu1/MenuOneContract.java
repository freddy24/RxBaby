/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu1;

import com.freddy.rxbaby.base.BasePrestener;
import com.freddy.rxbaby.base.BaseView;

import java.util.List;

/**
 * Description:
 * Created by freddy on 16/6/6.
 */
public class MenuOneContract {

    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePrestener{

        List<Integer> getImageIds();
    }
}
