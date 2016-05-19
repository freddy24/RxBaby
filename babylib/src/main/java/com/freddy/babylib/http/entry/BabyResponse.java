/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 *
 */

package com.freddy.babylib.http.entry;

import java.io.Serializable;
import java.util.Map;

/**
 * Description:
 * Created by freddy on 16/5/17.
 */
public class BabyResponse implements Serializable{

    private Map<String, Object> responseHeader;

    private Map<String, Object> responseBody;

    public Map<String, Object> getResponseBody() {
        return responseBody;
    }

    public Map<String, Object> getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(Map<String, Object> responseHeader) {
        this.responseHeader = responseHeader;
    }

    public void setResponseBody(Map<String, Object> responseBody) {
        this.responseBody = responseBody;
    }
}
