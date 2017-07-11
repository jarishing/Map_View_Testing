package com.example.map_view;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by user on 7/4/2017.
 */

public class MapApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
    }

    protected void attachBaseContext(Context base){
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
