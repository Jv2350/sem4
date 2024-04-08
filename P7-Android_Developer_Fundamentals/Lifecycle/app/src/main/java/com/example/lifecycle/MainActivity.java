package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String msg = "";
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView); // Initialize TextView here
        msg = "onCreate() event called";
        Log.d(msg, msg);
        tv.setText(msg);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        msg = "onStart() event called";
        Log.d(msg, msg);
        tv.setText(msg);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        msg = "onResume() event called";
        Log.d(msg, msg);
        tv.setText(msg);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        msg = "onStop() event called";
        Log.d(msg, msg);
        tv.setText(msg);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        msg = "onDestroy() event called";
        Log.d(msg, msg);
        tv.setText(msg);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        msg = "onPause() event called";
        Log.d(msg, msg);
        tv.setText(msg);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        msg = "onRestart() event called";
        tv.setText(msg);
        Log.d(msg, msg);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
