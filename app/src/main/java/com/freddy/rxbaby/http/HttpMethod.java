/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.rxbaby.http;

import com.freddy.babylib.http.entry.BRequest;
import com.freddy.babylib.http.entry.BResponse;
import com.freddy.babylib.http.entry.BabyResponseHeader;
import com.freddy.babylib.http.subcribers.BaseSubscriber;
import com.freddy.babylib.utils.ToastUtil;
import com.freddy.rxbaby.base.APP;

import java.util.HashMap;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Description: send request
 * Created by freddy on 16/5/18.
 */
public class HttpMethod {

    private static final String STATUS_ERROR = "0";
    private static final String STATUS_SUCCESS = "1";

    public static void requestBSPayQueryHisAddList(BaseSubscriber<BResponse> subscriber){
        final BRequest bRequest = SimpleRequestFactory.createBRequest(new HashMap<String, Object>());
        Observable<BResponse> observable = APIFactory.getPapiSingleInstance().requestBSPayQueryHisAddList(bRequest)
                .filter(new HttpResponseFunc1());
        toSubscribe(observable, subscriber);
    }

    public static void toSubscribe(Observable<BResponse> observable, Subscriber<BResponse> subscriber){
        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 做一个过滤，过滤掉 status 为 “0”，提示错误信息。
     */
    private static class HttpResponseFunc1 implements Func1<BResponse, Boolean>{

        @Override
        public Boolean call(BResponse bResponse) {
            BabyResponseHeader header = bResponse.getResponse().getResponseHeader();
            String message = header.getReturnDesc();
            String status = header.getReturnStatus();
            if (STATUS_ERROR.equals(status)){
                ToastUtil.getInstance().showToast(APP.getContext(),message);
                return false;
            }else{
                return true;
            }
        }
    }
}
