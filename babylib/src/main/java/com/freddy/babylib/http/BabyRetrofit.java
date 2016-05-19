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
public class BabyRetrofit {
    private static final int DEFAULT_TIMEOUT = 5;
    private static final String BASE_URL = "http://120.25.122.213:3703/BCC/";

    private Retrofit retrofit;

    private static final boolean isDebug = true;

    public BabyRetrofit(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(level(isDebug));
        builder.addInterceptor(interceptor);
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();


    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public BaseAPI getApi(Class<? extends BaseAPI> api){
        return retrofit.create(api);
    }

    private HttpLoggingInterceptor.Level level(boolean isDebug){
        return isDebug ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE;
    }
}
