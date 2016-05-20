/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.base;

import android.app.Application;
import android.content.Context;

/**
 * Description:
 * Created by freddy on 16/5/19.
 */
public class APP extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }

}
