package com.example.assignment02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class BatteryReciever extends BroadcastReceiver {

    TextView actualBattery;
    BatteryReciever(TextView actualBattery)
    {
        this.actualBattery = actualBattery;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int percentage = intent.getIntExtra("level", 0);
        if(percentage != 0) {
            actualBattery.setText(percentage+"");
        }
    }
}