package com.freddy.rxbaby.http;

import com.freddy.babylib.http.entry.BRequest;
import com.freddy.babylib.http.entry.BabyRequest;
import com.freddy.babylib.http.entry.BabyRequestHeader;

import java.util.Map;

/**
 * Description:
 * Created by freddy on 16/5/18.
 */
public class SimpleRequestFactory {

    public static BRequest createBRequest(Map<String, Object> params){
        BRequest bRequest = new BRequest();
        BabyRequest babyRequest = new BabyRequest();
        BabyRequestHeader requestHeader = new BabyRequestHeader();
        requestHeader.setCompanyID("");
        requestHeader.setDeviceId("868191020269138_f48b32a42c34");
        requestHeader.setProductId("PAYMENT");
        requestHeader.setDeviceOsVersion("1.7.1");
        requestHeader.setInterfaceVersion("2.0.0");
        requestHeader.setServiceCode("BSPayQueryHisAddList");
        requestHeader.setSoftTerminalId("P-ANDROID");
        babyRequest.setRequestHeader(requestHeader);
        babyRequest.setRequestBody(params);
        bRequest.setRequest(babyRequest);
        return bRequest;
    }
}
