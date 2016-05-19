/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.http;

import com.freddy.babylib.http.entry.BRequest;
import com.freddy.babylib.http.entry.BResponse;
import com.freddy.babylib.http.subcribers.NoProgressSubscriber;

import java.util.HashMap;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Description:
 * Created by freddy on 16/5/18.
 */
public class HttpMethod {

    public static void requestBSPayQueryHisAddList(NoProgressSubscriber<BResponse> subscriber){
        BRequest bRequest = SimpleRequestFactory.createBRequest(new HashMap<String, Object>());
        Observable<BResponse> observable = APIFactory.getPapiSingleInstance().requestBSPayQueryHisAddList(bRequest);
        toSubscribe(observable, subscriber);
    }

    public static void toSubscribe(Observable<BResponse> observable, Subscriber<BResponse> subscriber){
        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
