/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 *
 */

package com.freddy.babylib.http.entry;

import java.util.Map;

/**
 * Description:
 * Created by freddy on 16/5/17.
 */
public class BabyRequest {

    private BabyRequestHeader requestHeader;

    private Map<String, Object> requestBody;

    public BabyRequestHeader getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(BabyRequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }

    public Map<String, Object> getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(Map<String, Object> requestBody) {
        this.requestBody = requestBody;
    }
}
