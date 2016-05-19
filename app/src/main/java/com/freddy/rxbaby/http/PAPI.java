/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 *
 */

package com.freddy.rxbaby.http;

import com.freddy.babylib.http.entry.BRequest;
import com.freddy.babylib.http.entry.BResponse;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Description:
 * Created by freddy on 16/5/17.
 */
public interface PAPI{

    @POST("BSPayQueryHisAddList")
    Observable<BResponse> requestBSPayQueryHisAddList(@Body BRequest request);
}
