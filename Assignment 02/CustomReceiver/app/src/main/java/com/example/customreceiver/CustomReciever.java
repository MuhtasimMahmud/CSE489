package com.example.customreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getStringExtra("extra");

        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}