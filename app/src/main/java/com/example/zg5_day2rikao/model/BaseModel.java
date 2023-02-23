package com.example.zg5_day2rikao.model;

import androidx.lifecycle.MutableLiveData;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public  class BaseModel {

    public ApiServer getApiServer(){
        return RetrofitMagage.getRetrofitMagage().getRetrofit().create(ApiServer.class);

    }

    public <T>MutableLiveData<T> getData(Observable observable,MutableLiveData<T> liveData){

        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer() {
                    @Override
                    public void accept(Object o) throws Exception {
                        liveData.postValue((T) o);
                    }
                });
        return liveData;
    }

}
