package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private TextView timeDisplay;
    private Calendar calendar;
    private String format = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.timePicker1);
        timeDisplay = findViewById(R.id.textView);
        calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        showTime(hour, minute);
    }

    public void setTime(View view){
        int hour = timePicker.getCurrentHour();
        int minute = timePicker.getCurrentMinute();
        showTime(hour, minute);
    }

    public void showTime(int hour, int minute){
        if(hour ==  0){
            hour += 12;
            format = "AM";
        } else if(hour == 12){
            format = "PM";
        } else if(hour > 12){
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }

        timeDisplay.setText(hour + ":" + minute + " " + format);
    }
}
