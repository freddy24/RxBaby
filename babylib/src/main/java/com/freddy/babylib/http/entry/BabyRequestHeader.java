/*
 * Copyright (c) 2016. freddy <freddywu24@gmail.com>
 *
 */

package com.freddy.babylib.http.entry;

/**
 * Description:
 * Created by freddy on 16/5/17.
 */
public class BabyRequestHeader {

    /**
     * accessToken : de76d20b5b02e6e22211424b93ed0f78
     * cid :
     * companyID :
     * deviceId : 351670063249028_F025B7B7B4E8
     * deviceOs : ANDROID
     * deviceOsVersion : 4.4.2
     * interfaceVersion : 1.0.0
     * productId : PAYMENT
     * serviceCode : USDeleteMember
     * softTerminalId : P-ANDROID
     * softTerminalVersion : 1.7.1
     * transCode : TC005008
     */

    private String accessToken;
    private String cid;
    private String companyID;
    private String deviceId;
    private String deviceOs;
    private String deviceOsVersion;
    private String interfaceVersion;
    private String productId;
    private String serviceCode;
    private String softTerminalId;
    private String softTerminalVersion;
    private String transCode;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceOs() {
        return deviceOs;
    }

    public void setDeviceOs(String deviceOs) {
        this.deviceOs = deviceOs;
    }

    public String getDeviceOsVersion() {
        return deviceOsVersion;
    }

    public void setDeviceOsVersion(String deviceOsVersion) {
        this.deviceOsVersion = deviceOsVersion;
    }

    public String getInterfaceVersion() {
        return interfaceVersion;
    }

    public void setInterfaceVersion(String interfaceVersion) {
        this.interfaceVersion = interfaceVersion;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getSoftTerminalId() {
        return softTerminalId;
    }

    public void setSoftTerminalId(String softTerminalId) {
        this.softTerminalId = softTerminalId;
    }

    public String getSoftTerminalVersion() {
        return softTerminalVersion;
    }

    public void setSoftTerminalVersion(String softTerminalVersion) {
        this.softTerminalVersion = softTerminalVersion;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }
}
