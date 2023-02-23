package com.example.zg5_day2rikao.model;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiServer {

    @GET("goods/category")
    Observable<TypesEntity> types();


}
