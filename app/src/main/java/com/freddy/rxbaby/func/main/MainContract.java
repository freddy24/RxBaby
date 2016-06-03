/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.main;

import com.freddy.rxbaby.base.BasePrestener;
import com.freddy.rxbaby.base.BaseView;

/**
 * Description:
 * Created by freddy on 16/6/2.
 */
public class MainContract {

    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePrestener{

    }
}
