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
public class BabyResponse{

    private BabyResponseHeader responseHeader;

    private Map<String, Object> responseBody;

    public Map<String, Object> getResponseBody() {
        return responseBody;
    }

    public BabyResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(BabyResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public void setResponseBody(Map<String, Object> responseBody) {
        this.responseBody = responseBody;
    }

}
