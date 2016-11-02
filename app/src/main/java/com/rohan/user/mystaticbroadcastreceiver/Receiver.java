package com.rohan.user.mystaticbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by User on 11/1/2016.
 */

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Static broadcast: ", "Intent Received");
        Vibrator v =(Vibrator)context.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(5000);
        Toast.makeText(context,"Intent Received by Receiver",Toast.LENGTH_LONG).show();
    }
}
