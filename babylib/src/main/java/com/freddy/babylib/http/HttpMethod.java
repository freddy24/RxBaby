package com.freddy.babylib.http;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Description:
 * Created by freddy on 16/5/16.
 */
public class HttpMethod {
    private static final int DEFAULT_TIMEOUT = 5;
    private static final String BASE_URL = "http://120.25.122.213:3703/BCC/";

    private Retrofit retrofit;

    private HttpMethod(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.addInterceptor(interceptor);
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();

    }

    private static HttpMethod getInstance(){
        return SingleHolder.httpMethod;
    }

    private static class SingleHolder{
        private static final HttpMethod httpMethod = new HttpMethod();
    }


}
