package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String msg = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(msg,"The onCreate() event");
        Toast.makeText(this, "The onCreate() event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg,"The onStart() event");
        Toast.makeText(this, "he onStart() event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg,"The onResume() event");
        Toast.makeText(this, "The onResume() event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg,"The onStop() event");
        Toast.makeText(this, "The onStop() event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg,"The onDestroy() event");
        Toast.makeText(this, "The onDestroy() event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg,"The onPause() event");
        Toast.makeText(this, "The onPause() event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msg,"The onRestart() event");
        Toast.makeText(this, "The onRestart() event", Toast.LENGTH_SHORT).show();
    }
}