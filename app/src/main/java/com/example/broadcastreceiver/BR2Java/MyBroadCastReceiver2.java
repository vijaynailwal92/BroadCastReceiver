package com.example.broadcastreceiver.BR2Java;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadCastReceiver2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"BroadcastReceiver2 Triggered",Toast.LENGTH_SHORT).show();
    }
}
