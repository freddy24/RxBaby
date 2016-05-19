/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.babylib.http.subcribers;

/**
 * Description: no progress subscriber
 * Created by freddy on 16/5/18.
 */
public class NoProgressSubscriber<BResponse> extends BaseSubscriber<BResponse> {

    private SubscriberOnNextListener onNextListener;

    public NoProgressSubscriber(SubscriberOnNextListener onNextListener){
        this.onNextListener = onNextListener;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onNext(BResponse t) {
        if (onNextListener != null){
            onNextListener.onNext(t);
        }
    }

}
