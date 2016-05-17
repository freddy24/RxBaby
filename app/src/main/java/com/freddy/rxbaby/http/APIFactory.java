package com.freddy.rxbaby.http;

import com.freddy.babylib.http.BabyRetrofit;

/**
 * Description:
 * Created by freddy on 16/5/17.
 */
public class APIFactory {
    private static final Object data = new Object();

    static PAPI papiSingleInstance = null;

    public static PAPI getPapiSingleInstance(){
        synchronized (data){
            if (null == papiSingleInstance){
                papiSingleInstance = (PAPI) new BabyRetrofit().getApi(papiSingleInstance);
            }
            return papiSingleInstance;
        }
    }
}
