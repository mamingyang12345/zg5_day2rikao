package com.example.zg5_day2rikao.db;

import androidx.room.Room;

import com.example.zg5_day2rikao.App;

public class DBInstance {
    public static final String TAB_NAME="";
    public static AppDataBase appDataBase;
    public synchronized static AppDataBase getAppDataBase(){

        if (appDataBase==null){
            appDataBase= Room.databaseBuilder(App.getContext(),AppDataBase.class,TAB_NAME)
                    .allowMainThreadQueries()
                    .build();
        }

        return appDataBase;
    }
}
