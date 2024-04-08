package com.example.database;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private EditText editTextName, editTextEmail, editTextUserId;
    private TextView textViewData;
    private DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextUserId = findViewById(R.id.editTextUserId);
        Button btnInsert = findViewById(R.id.btnInsert);
        Button btnRetrieveAll = findViewById(R.id.btnRetrieveAll);
        Button btnRetrieveById = findViewById(R.id.btnRetrieveById);
        textViewData = findViewById(R.id.textViewData);
        databaseHelper = new DatabaseHelper(this);
        btnInsert.setOnClickListener(v -> insertUserData());
        btnRetrieveAll.setOnClickListener(v -> retrieveAllUsers());
        btnRetrieveById.setOnClickListener(v -> retrieveUserById());
    }
    private void insertUserData() {
        String name = editTextName.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        long userId = databaseHelper.insertUser(name, email);
        Log.d("UserData", "User inserted with ID: " + userId);

        String str = "Inserted\nUsername: "+editTextName.getText().toString()+"\nEmail: "+editTextEmail.getText().toString();
        Toast msg = Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);
        msg.show();

        editTextName.setText("");
        editTextEmail.setText("");
        editTextUserId.setText("");
    }
    private void retrieveAllUsers() {
        List<User> allUsers = databaseHelper.getAllUsers();

        StringBuilder userData = new StringBuilder("All Users:\n");
        for (User user : allUsers) {
            userData.append("ID: ").append(user.getId()).append(", Name: ").append(user.getName()).append(", Email: ").append(user.getEmail()).append(".\n");
        }
        textViewData.setText(userData.toString());
        editTextName.setText("");
        editTextEmail.setText("");
        editTextUserId.setText("");
    }
    @SuppressLint("SetTextI18n")
    private void retrieveUserById() {
        String userIdString = editTextUserId.getText().toString().trim();
        if (!userIdString.isEmpty()) {
            long userId = Long.parseLong(userIdString);
            User user = databaseHelper.getUserById(userId);
            if (user != null) {
                textViewData.setText("User found by ID:\n" + "ID: " +
                        user.getId() + "\nName: " + user.getName() + "\nEmail: " +
                        user.getEmail());
            } else {
                textViewData.setText("User not found by ID: " + userId);
            }
        } else {
            textViewData.setText("Please enter a user ID.");
        }
        editTextName.setText("");
        editTextEmail.setText("");
        editTextUserId.setText("");
    }
}