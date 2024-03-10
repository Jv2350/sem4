package com.example.internet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class NetworkReceiver extends BroadcastReceiver {
    TextView textView;

    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();


        if (networkInfo != null && networkInfo.isConnected()) {
            Log.d("NetworkReceiver", "Connected to the internet");
            Toast.makeText(context, "Connected to the internet", Toast.LENGTH_LONG).show();
        } else {
            Log.d("NetworkReceiver", "Disconnected from the internet");
            Toast.makeText(context, "Disconnected from the internet", Toast.LENGTH_LONG).show();
        }
    }
}
