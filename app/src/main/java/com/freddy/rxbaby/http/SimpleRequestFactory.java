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
        requestHeader.setProductId("PAYMENT");
        requestHeader.setInterfaceVersion("2.0.0");
        requestHeader.setSoftTerminalId("P-ANDROID");
        requestHeader.setSoftTerminalVersion("1.7.1");
        babyRequest.setRequestHeader(requestHeader);
        babyRequest.setRequestBody(params);
        bRequest.setRequest(babyRequest);
        return bRequest;
    }
}
