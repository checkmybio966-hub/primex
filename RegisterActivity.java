package com.example.primex;

import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText newUser, newPass;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        newUser = findViewById(R.id.newUser);
        newPass = findViewById(R.id.newPass);
        registerBtn = findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Account Created", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
