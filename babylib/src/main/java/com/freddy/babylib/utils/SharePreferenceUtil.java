/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 *
 */

package com.freddy.babylib.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Description:
 * Created by freddy on 16/5/17.
 */
public class SharePreferenceUtil {

    private static final String SHARE_PREFERENCE_FILE_NAME = "rxbaby_sp";

    /**
     * save value to SHARE_PREFERENCE_FILE_NAME file
     * @param context context
     * @param key key
     * @param value value
     */
    public static void saveValue(Context context, String key, String value){
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARE_PREFERENCE_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    /**
     * get value from SHARE_PREFERENCE_FILE_NAME file
     * @param context context
     * @param key key
     * @param defaultValue defaultValue
     * @return if key is not exist return default value
     */
    public static String getStringValue(Context context, String key, String defaultValue){
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARE_PREFERENCE_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, defaultValue);
    }
}
