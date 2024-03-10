package com.example.practicalno4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText, editTextPassword;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "Username: "+editText.getText().toString()+"\nPassword: "+editTextPassword.getText().toString();
                Toast msg = Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);
                msg.show();
            }
        });
    }
}