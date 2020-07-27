package com.library.quickstart;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "Super_AWESOME_APP";

    public static void d (String message){
        Log.d(TAG,message);
    }
}
