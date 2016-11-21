/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.func.menu2;

import com.freddy.rxbaby.base.BasePrestener;
import com.freddy.rxbaby.base.BaseView;
import com.freddy.rxbaby.data.bean.Animal;

import java.util.List;

/**
 * Description:
 * Created by freddy on 16/6/14.
 */
public class MenuTwoContract {

    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePrestener{
        List<Animal> getAnimals();
    }
}
