package com.example.keyboard;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText emailEditText, phoneEditText, passwordEditText, nameEditText;
    TextView textView;
    Button btn;
    Spinner spinner;

    String[] cources = {"Computer Science", "Information Technology", "Zoology", "Bio Technology"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText= findViewById(R.id.editTextText);
        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        phoneEditText = findViewById(R.id.editTextPhone);
        passwordEditText = findViewById(R.id.editTextTextPassword);
        btn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,cources);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();
                String phoneNo = phoneEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();
                String course = spinner.getSelectedItem().toString().trim();

                if(name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_LONG).show();
                }else if(email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    Toast.makeText(MainActivity.this, getString(R.string.validEmail),Toast.LENGTH_LONG).show();
                } else if(phoneNo.isEmpty() || !Patterns.PHONE.matcher(phoneNo).matches()){
                    Toast.makeText(MainActivity.this, getString(R.string.validPhone), Toast.LENGTH_LONG).show();
                } else if(password.isEmpty() || password.length() < 6) {
                    Toast.makeText(MainActivity.this, getString(R.string.validPassword), Toast.LENGTH_LONG).show();
                } else{
                    Toast.makeText(MainActivity.this, "Name: "+name+"\nEmail: "+email+"\nPhone Number: "+phoneNo+"\nPassword: "+password+"\nCourse: "+course, Toast.LENGTH_LONG).show();
                    textView.setText("Name: "+name+"\nEmail: "+email+"\nPhone Number: "+phoneNo+"\nPassword: "+password+"\nCourse: "+course);
                }
            }
        });
    }
}