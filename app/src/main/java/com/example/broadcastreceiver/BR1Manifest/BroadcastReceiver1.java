package com.example.broadcastreceiver.BR1Manifest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.broadcastreceiver.R;


public class BroadcastReceiver1 extends AppCompatActivity {

    //    in this the broadcast receiver will be declared in manifest . but the problem is that this BR will call even the app is in background .
    // and this way is not supported in oreo.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver1);
    }
}
