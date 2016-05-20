/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.babylib.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.freddy.babylib.R;

/**
 * Description: show toast
 * Created by freddy on 16/5/19.
 */
public class ToastUtil {

    private Toast mToast;
    private static Handler handler = new Handler(Looper.getMainLooper());

    private static class SingleHolder{
        private static final ToastUtil toastUtil = new ToastUtil();
    }

    public static ToastUtil getInstance(){
        return SingleHolder.toastUtil;
    }

    public void showToast(final Context context, final int resourceId){
        String message = context.getResources().getString(resourceId);
        showToast(context, message);
    }

    public void showToast(final Context context, final String message){
        if (TextUtils.isEmpty(message)){
            return;
        }
        if (mToast != null){
            mToast.cancel();
        }
        handler.post(new Runnable() {
            @Override
            public void run() {
                showToast(context, message, Toast.LENGTH_LONG);
            }
        });

    }

    private void showToast(Context context, String message, int time){
        mToast = new Toast(context);
        LayoutInflater inflate = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflate.inflate(R.layout.toast_layout, null);
        TextView textView = (TextView) v.findViewById(R.id.toast);
        textView.setText(message);
        mToast.setView(v);
        mToast.setGravity(Gravity.CENTER, 0 , 0);
        mToast.setDuration(time);
        mToast.show();
    }

    /**
     * close current toast
     */
    public void cancelCurrentToast(){
        if (mToast != null){
            mToast.cancel();
        }
    }
}
