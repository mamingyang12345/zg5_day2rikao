package com.example.zg5_day2rikao.model;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitMagage {
    private static RetrofitMagage retrofitMagage;
    private RetrofitMagage(){}
    public synchronized static RetrofitMagage getRetrofitMagage(){
        if (retrofitMagage==null){
            retrofitMagage=new RetrofitMagage();
        }
        return retrofitMagage;
    }


    public Retrofit retrofit;

    public Retrofit getRetrofit(){
        if (retrofit==null){
            OkHttpClient build = new OkHttpClient.Builder()
                    .connectTimeout(5, TimeUnit.SECONDS)
                    .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                    .build();

            retrofit=new Retrofit.Builder()
                    .client(build)
                    .baseUrl("http://43.143.146.165:7777")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
