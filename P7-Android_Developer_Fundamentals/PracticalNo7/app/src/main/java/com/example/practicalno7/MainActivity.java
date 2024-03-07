package com.example.practicalno7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText emailEditText, phoneEditText, passwordEditText;
    TextView textView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        phoneEditText = findViewById(R.id.editTextPhone);
        passwordEditText = findViewById(R.id.editTextTextPassword);
        btn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String phoneNo = phoneEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if(email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    Toast.makeText(MainActivity.this, getString(R.string.validEmail),Toast.LENGTH_LONG).show();
                } else if(phoneNo.isEmpty() || !Patterns.PHONE.matcher(phoneNo).matches()){
                    Toast.makeText(MainActivity.this, getString(R.string.validPhone), Toast.LENGTH_LONG).show();
                } else if(password.isEmpty() || password.length() < 6) {
                    Toast.makeText(MainActivity.this, getString(R.string.validPassword), Toast.LENGTH_LONG).show();
                } else{
                    Toast.makeText(MainActivity.this, "Email: "+email+"\nPhone Number: "+phoneNo+"\nPassword: "+password, Toast.LENGTH_LONG).show();
                    textView.setText("Email: "+email+"\nPhone Number: "+phoneNo+"\nPassword: "+password);
                }
            }
        });
    }
}