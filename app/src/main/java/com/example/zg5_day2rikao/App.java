package com.example.zg5_day2rikao;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    public static Context context;

    public static Context getContext() {
        return context;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
}
