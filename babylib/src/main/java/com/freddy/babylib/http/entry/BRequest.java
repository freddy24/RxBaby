/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 *
 */

package com.freddy.babylib.http.entry;

/**
 * Description: in order to match the request {request:{requestHeader:{},requestBody:{}}}
 *
 * Created by freddy on 16/5/17.
 */
public class BRequest {

    private BabyRequest request;

    public BabyRequest getRequest() {
        return request;
    }

    public void setRequest(BabyRequest request) {
        this.request = request;
    }
}
