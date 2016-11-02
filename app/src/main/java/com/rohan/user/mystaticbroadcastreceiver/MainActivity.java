package com.rohan.user.mystaticbroadcastreceiver;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String CUSTOM_INTENT = "com.rohan.user.show_toast";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("HI: ", "Sending Broadcast");
                sendBroadcast(new Intent(CUSTOM_INTENT), android.Manifest.permission.VIBRATE);

            }
        });
    }
}
