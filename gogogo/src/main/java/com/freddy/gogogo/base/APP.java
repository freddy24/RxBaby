/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.gogogo.base;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * Description://TODO
 * Created by freddy on 16/5/19.
 */
public class APP extends Application {

    private static Context context;

    public static final boolean ENCRYPTED = true;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        initLogger();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Logger.i("width = " + displayMetrics.widthPixels +"\n" + "height = " + displayMetrics.heightPixels);
    }

    public static Context getContext() {
        return context;
    }
    /**
     * 初始化日志
     */
    private void initLogger(){
        Logger.init(APP.class.getSimpleName()).methodCount(3)
                .hideThreadInfo()
                .logLevel(LogLevel.FULL)//打release版的时候 改为NONE
                .methodCount(2);
    }

    private void initDatabase(){

    }
}
