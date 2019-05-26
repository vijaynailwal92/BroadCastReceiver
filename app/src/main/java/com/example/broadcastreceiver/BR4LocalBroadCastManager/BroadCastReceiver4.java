package com.example.broadcastreceiver.BR4LocalBroadCastManager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.broadcastreceiver.R;


public class BroadCastReceiver4 extends AppCompatActivity {
    LocalBroadcastManager localBroadcastManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast_receiver4);
        localBroadcastManager = LocalBroadcastManager.getInstance(getApplicationContext());
    }

    Intent intent = new Intent();

    public void view_click(View view) {
        switch (view.getId()) {
            case R.id.localbroadcast:
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setAction("my.custom.action.tag.fordemo");
                localBroadcastManager.sendBroadcast(intent);
                break;
        }
    }

}
