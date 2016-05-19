/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.babylib.http.subcribers;

import android.util.Log;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

import rx.Subscriber;

/**
 * Description:
 * Created by freddy on 16/5/18.
 */
public class BaseSubscriber<BResponse> extends Subscriber<BResponse> {


    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        if (e instanceof SocketTimeoutException){

        }else if (e instanceof ConnectException){

        }else{

        }
        Log.i("onError", e.getMessage());
    }

    @Override
    public void onNext(BResponse t) {
        Log.i("BaseSubscriber", "onNext");
    }
}
