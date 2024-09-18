package com.example.penugasanpgpbacara4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.penugasanpgpbacara4.R;

public class RegisterActivity extends AppCompatActivity {

    EditText etUsername, etEmail, etPhone, etPassword;
    Button btnRegister;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUsername = findViewById(R.id.et_username);
        etEmail = findViewById(R.id.et_email);
        etPhone = findViewById(R.id.et_phone);
        etPassword = findViewById(R.id.et_password);
        btnRegister = findViewById(R.id.btn_register);
        tvLogin = findViewById(R.id.tv_login);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil data dan pindahkan ke HomePageActivity
                Intent intent = new Intent(RegisterActivity.this, com.example.penugasanpgpbacara4.HomePageActivity.class);
                intent.putExtra("username", etUsername.getText().toString());
                intent.putExtra("email", etEmail.getText().toString());
                intent.putExtra("phone", etPhone.getText().toString());
                startActivity(intent);
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Login
                Intent intent = new Intent(RegisterActivity.this, com.example.penugasanpgpbacara4.LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
