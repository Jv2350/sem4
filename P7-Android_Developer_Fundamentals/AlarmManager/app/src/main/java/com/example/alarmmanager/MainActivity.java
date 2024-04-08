package com.example.alarmmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private AlarmManager alarmManager;
    private PendingIntent alarmIntent;
    private static final long time=5000;

    private BroadcastReceiver alarmReceiver = new AlarmReceiver(){
        @Override
        public void onReceive(Context context, Intent intent) {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
            String currentTime = sdf.format(new Date());
            textView.setText("Alarm Triggerd at: "+currentTime);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Button alarmButton = findViewById(R.id.alarmButton);

        alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent alarmReceiverIntent = new Intent(this,AlarmReceiver.class);
        alarmIntent = PendingIntent.getBroadcast(this,0,alarmReceiverIntent, PendingIntent.FLAG_IMMUTABLE);

        registerReceiver(alarmReceiver, new IntentFilter("ALARM_TRIGGERED"));

        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAlarm();
            }
        });
    }

    private void setAlarm(){
        long triggerTime = SystemClock.elapsedRealtime() + time;
        alarmManager.setExactAndAllowWhileIdle(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerTime, alarmIntent);
        textView.setText("Alarm set to trigger after 5 seconds ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(alarmReceiver);
    }
}