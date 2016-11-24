/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.gogogo.func.menu2;

import com.freddy.gogogo.base.BasePrestener;
import com.freddy.gogogo.base.BaseView;
import com.freddy.gogogo.data.bean.Animal;

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
