package com.freddy.gogogo.http;

import com.freddy.babylib.http.BabyRetrofit;

/**
 * Description: create api interface
 * Created by freddy on 16/5/17.
 */
public class APIFactory {
    private static final Object data = new Object();

    static PAPI papiSingleInstance;

    public static PAPI getPapiSingleInstance(){
        synchronized (data){
            if (null == papiSingleInstance){
                papiSingleInstance = new BabyRetrofit().getRetrofit().create(PAPI.class);
            }
            return papiSingleInstance;
        }
    }
}
