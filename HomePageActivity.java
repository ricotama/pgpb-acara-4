package com.example.penugasanpgpbacara4;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.penugasanpgpbacara4.R;

public class HomePageActivity extends AppCompatActivity {

    TextView tvWelcome, tvEmail, tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvWelcome = findViewById(R.id.tv_welcome);
        tvEmail = findViewById(R.id.tv_email);
        tvPhone = findViewById(R.id.tv_phone);

        // Ambil data dari Intent
        String username = getIntent().getStringExtra("username");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");

        // Set data di TextView
        tvWelcome.setText("Welcome " + username);
        tvEmail.setText("Your email " + email + " has been activated");
        tvPhone.setText("Your phone " + phone + " has been registered");
    }
}
