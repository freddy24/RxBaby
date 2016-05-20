/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.babylib.http.subcribers;

/**
 * Description: no progress subscriber
 * Created by freddy on 16/5/18.
 */
public class NoProgressSubscriber<T> extends BaseSubscriber<T> {

    private SubscriberOnNextListener onNextListener;

    public NoProgressSubscriber(SubscriberOnNextListener onNextListener){
        this.onNextListener = onNextListener;
    }

    @Override
    public void onCompleted() {

    }

    @SuppressWarnings("unchecked")
    @Override
    public void onNext(T t) {
        if (onNextListener != null){
            onNextListener.onNext(t);
        }
    }

}
