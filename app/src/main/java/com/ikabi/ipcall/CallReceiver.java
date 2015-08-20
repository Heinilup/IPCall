package com.ikabi.ipcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2015/8/20.
 */
public class CallReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
       String number = getResultData();
        SharedPreferences sp = context.getSharedPreferences("ip", context.MODE_PRIVATE);
        String ipNumber = sp.getString("ipNumber", "");
        number = ipNumber + number;
        setResultData(number);
        abortBroadcast();
    }
}
