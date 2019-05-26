package com.example.broadcastreceiver.BR1Manifest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadCastReceiver1 extends BroadcastReceiver {
    //    in this the broadcast receiver will be declared in manifest . but the problem is that this BR will call even the app is in background .
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Broadcast1 Receiver Triggered",Toast.LENGTH_SHORT).show();

    }



}
