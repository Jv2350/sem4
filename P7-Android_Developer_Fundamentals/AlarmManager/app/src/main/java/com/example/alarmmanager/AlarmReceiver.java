package com.example.alarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent broadcastIntent = new Intent("ALARM_TRIGGERED");
        context.sendBroadcast(broadcastIntent);
    }
}
