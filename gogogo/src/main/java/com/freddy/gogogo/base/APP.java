/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.gogogo.base;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;

import com.freddy.gogogo.gen.DaoMaster;
import com.freddy.gogogo.gen.DaoSession;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

import org.greenrobot.greendao.database.Database;

/**
 * Description://TODO
 * Created by freddy on 16/5/19.
 */
public class APP extends Application {

    private static Context context;

    public static final boolean ENCRYPTED = true;

    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        initLogger();
        initDatabase();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Logger.i("width = " + displayMetrics.widthPixels +"\n" + "height = " + displayMetrics.heightPixels);
    }
    public static Context getContext() {
        return context;
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
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
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, ENCRYPTED ? "gogogo-db-encrypted" : "gogogo-db");
        Database db = ENCRYPTED ? helper.getEncryptedWritableDb("super-secret") : helper.getWritableDb();
        mDaoSession = new DaoMaster(db).newSession();
    }


}
