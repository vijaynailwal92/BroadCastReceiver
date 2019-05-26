package com.example.broadcastreceiver.BR5OrderedBroadCastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.broadcastreceiver.MainActivity;
import com.example.broadcastreceiver.R;

public class BroadCastReceiver5 extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String BREAD_CRUMB = "Breadcrumb";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast_receiver5);
    }

    public void view_click(View view) {
        switch (view.getId())
        {
            case R.id.orderedbroadcast:
                Intent intent = new Intent();
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setAction("com.br1");
//                sendBroadcast(intent);


                sendOrderedBroadcast(intent, null, new BroadcastReceiver() {
                    @Override
                    public void onReceive(Context context, Intent intent) {
                        Bundle bundle = getResultExtras(true);
                        String breadcrumb = bundle.getString(BREAD_CRUMB);
                        breadcrumb = breadcrumb + "->" + TAG;
                        Log.e(TAG, "On Receive: " + breadcrumb);
                    }
                }, null, MainActivity.RESULT_OK, null, null);
                break;
        }
    }
}
