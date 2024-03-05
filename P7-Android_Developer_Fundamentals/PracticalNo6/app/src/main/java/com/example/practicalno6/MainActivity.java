package com.example.practicalno6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String msg = "jayesh";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(msg,"The onCreate() event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg,"The onStart() event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg,"The onResume() event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg,"The onPause() event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg,"The onStop() event");
    }


}