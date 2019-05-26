package com.example.broadcastreceiver.BR2Java;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.broadcastreceiver.R;


public class BroadCastReceiver2 extends AppCompatActivity {
    //    dynamically set broadcast receiver .
//    onstart() will execute when the app is in foreground -->register receiver
//    onStop() will execute when the app is in background .-->unregister receiver
//    If you forget unregister receiver, the Android system reports a leaked broadcast receiver error.
//    if you registered a receive in onResume() methods of your activity, you should unregister it in the onPause() method.


    BroadcastReceiver broadcastReceiver;
    IntentFilter intentFilter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast_receiver2);
        broadcastReceiver = new MyBroadCastReceiver2();
    }

    @Override
    protected void onStart() {
        super.onStart();
        intentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);
    }


}
