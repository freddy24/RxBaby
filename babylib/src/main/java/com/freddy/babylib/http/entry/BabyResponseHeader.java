/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 *
 */

package com.freddy.babylib.http.entry;

import java.io.Serializable;

/**
 * Description:
 * Created by freddy on 16/5/17.
 */
public class BabyResponseHeader implements Serializable{

    /**
     * conversationId : ""
     * returnCode : ""
     * returnDesc : ""
     * returnStatus : ""
     * serviceCode : ""
     */

    private String conversationId;
    private String returnCode;
    private String returnDesc;
    private String returnStatus;
    private String serviceCode;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnDesc() {
        return returnDesc;
    }

    public void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
}
