package com.example.assignment02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.widget.TextView;
import android.widget.Toast;

public class wifiStateReceiver extends BroadcastReceiver {

    TextView status;

    public wifiStateReceiver(TextView status) {
        this.status = status;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();

        if(action.equals(WifiManager.NETWORK_STATE_CHANGED_ACTION)){

            NetworkInfo info = intent.getParcelableExtra(WifiManager.EXTRA_NETWORK_INFO);

            boolean connected = info.isConnected();

            if(connected){
                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(context, "Not connected", Toast.LENGTH_SHORT).show();
            }
        }
    }
}