package com.example.broadcastreceiver.BR3CustomIntent;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.broadcastreceiver.R;

//broadcast receiver are two types system generated and application generated
//when you neeed application generated broadcastreceiver then custom broadcast receiver will come into existence .
// in this addaction and setcategory() are passed both manifest and java
//but the problem is that if the setaction value will be the same both of the app then both broadcast receiver will triggered
// so for this we pass an attribute exported = false in manifest .






public class BroadCastReceiver3 extends AppCompatActivity {
    BroadcastReceiver broadcastReceiver;
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast_receiver3);
        broadcastReceiver = new MyBroadCastRecceiver3();
    }

    public void view_click(View view) {
        switch (view.getId()) {
            case R.id.custom_intent:
                intent = new Intent();
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setAction("my.custom.action.tag.fordemo");
                sendBroadcast(intent);
                break;
        }

    }
}
