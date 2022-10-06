package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class activity3_for_option3 extends AppCompatActivity {

    TextView givenPercentage,actualBattery;
    BatteryReciever batteryReciever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_for_option3);

        givenPercentage = findViewById(R.id.givenBatteryPercentage);
        actualBattery = findViewById(R.id.actualBattery);

        batteryReciever = new BatteryReciever(actualBattery);
        registerReceiver(batteryReciever,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

        givenPercentage.setText(getIntent().getStringExtra("given Text").toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(batteryReciever);
    }
}


