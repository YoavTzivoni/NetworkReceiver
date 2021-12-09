package com.yoav.networkreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    protected NetwrokBroadcastReciever netwrokBroadcastReciever = new NetwrokBroadcastReciever();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        //filter.addAction();
        registerReceiver(netwrokBroadcastReciever, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(netwrokBroadcastReciever);
    }
}