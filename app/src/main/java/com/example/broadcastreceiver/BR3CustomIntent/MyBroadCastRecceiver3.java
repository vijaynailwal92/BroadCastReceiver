package com.example.broadcastreceiver.BR3CustomIntent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;



public class MyBroadCastRecceiver3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "BroadCastReceiver3", Toast.LENGTH_SHORT).show();
    }
}
