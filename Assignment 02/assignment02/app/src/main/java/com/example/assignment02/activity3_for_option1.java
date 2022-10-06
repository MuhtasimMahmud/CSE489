package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity3_for_option1 extends AppCompatActivity {
    TextView txt;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_for_option1);

        txt = findViewById(R.id.text);
        msg = getIntent().getStringExtra("given msg").toString();


        Intent myBroadcastIntent = new Intent();
        myBroadcastIntent.putExtra("extra", msg);
        myBroadcastIntent.setAction("com.example.assignment02");
        myBroadcastIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(myBroadcastIntent);
    }
}



