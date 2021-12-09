package com.yoav.networkreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class NetwrokBroadcastReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
            boolean noConnection = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY,false);

            if (noConnection)
                Toast.makeText(context, "No Connection", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
        }
    }
}
