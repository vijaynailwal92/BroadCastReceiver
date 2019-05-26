package com.example.broadcastreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.broadcastreceiver.BR1Manifest.BroadcastReceiver1;
import com.example.broadcastreceiver.BR2Java.BroadCastReceiver2;
import com.example.broadcastreceiver.BR3CustomIntent.BroadCastReceiver3;
import com.example.broadcastreceiver.BR4LocalBroadCastManager.BroadCastReceiver4;
import com.example.broadcastreceiver.BR5OrderedBroadCastReceiver.BroadCastReceiver5;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void view_click(View view) {
        switch (view.getId()) {
            case R.id.button1:
                startActivity(new Intent(getApplicationContext(), BroadcastReceiver1.class));
                break;
            case R.id.button2:
                startActivity(new Intent(getApplicationContext(), BroadCastReceiver2.class));
                break;
            case R.id.button3:
                startActivity(new Intent(getApplicationContext(), BroadCastReceiver3.class));
                break;
            case R.id.button4:
                startActivity(new Intent(getApplicationContext(), BroadCastReceiver4.class));
                break;
            case R.id.button5:
                startActivity(new Intent(getApplicationContext(), BroadCastReceiver5.class));
                break;

        }
    }
}
