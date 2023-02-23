package com.example.zg5_day2rikao.Rotract;

import androidx.lifecycle.MutableLiveData;

import com.example.zg5_day2rikao.model.BaseModel;
import com.example.zg5_day2rikao.model.TypesEntity;

public class Typesrptc extends BaseModel {

    public MutableLiveData<TypesEntity> getTypes(){
        MutableLiveData<TypesEntity> liveData = new MutableLiveData<>();

        return getData(getApiServer().types(),liveData);
    }
}
