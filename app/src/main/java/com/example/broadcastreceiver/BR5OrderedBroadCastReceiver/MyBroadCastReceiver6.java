package com.example.broadcastreceiver.BR5OrderedBroadCastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyBroadCastReceiver6 extends BroadcastReceiver {
    private static final String TAG=MyBroadCastReceiver6.class.getSimpleName();
    private static String BREAD_CRUMB = "Breadcrumb";
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle=getResultExtras(true);
        String trail=bundle.getString(BREAD_CRUMB);
        trail=(trail==null?"Start->"+TAG:trail+"->"+TAG);
        bundle.putString(BREAD_CRUMB,trail);
        Log.e(TAG, "MyBroadCastReceiver6 triggered: "+trail);
    }
}
