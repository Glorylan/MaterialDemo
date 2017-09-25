package com.example.materialtest;

import android.app.Application;
import android.content.Context;

/**
 * Created by Blues on 2017/9/6.
 */

public class MyApplicatioin extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
