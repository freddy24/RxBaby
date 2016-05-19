/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 */

package com.freddy.babylib.http.subcribers;

/**
 * Description:
 * Created by freddy on 16/5/18.
 */
public interface SubscriberOnNextListener<BResponse> {

    void onNext(BResponse t);
}
