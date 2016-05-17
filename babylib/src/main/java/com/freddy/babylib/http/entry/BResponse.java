/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 *
 */

package com.freddy.babylib.http.entry;

/**
 * Description:
 * "response": {
 "  responseBody": {
    },
    "responseHeader": {
    "conversationId": "",
    "returnCode": "",
    "returnDesc": "",
    "returnStatus": "",
    "serviceCode": ""
    }
 }
 * Created by freddy on 16/5/17.
 */
public class BResponse {

    private BabyResponse response;

    public BabyResponse getResponse() {
        return response;
    }

    public void setResponse(BabyResponse response) {
        this.response = response;
    }
}
