/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.gogogo.func.main;

import android.support.v4.app.Fragment;

import com.freddy.gogogo.base.BasePrestener;
import com.freddy.gogogo.base.BaseView;

import java.util.List;

/**
 * Description://TODO
 * Created by freddy on 16/6/2.
 */
public class MainContract {

    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePrestener{
        /**
         * init icon data
         * @return icon array
         */
        int[] initMenuIcon();

        /**
         * init menu text
         * @return text array
         */
        String[] initMenuText();

        /**
         * init tabLayout fragments
         * @return fragment list
         */
        List<Fragment> initFragments();
    }
}
