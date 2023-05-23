package com.example.car_repair_realese;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    ConstraintLayout root;
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        root = findViewById(R.id.root);

        dialog = new ProgressDialog(this);
        dialog.setMessage("Подождите...");
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText loginField = root.findViewById(R.id.loginField);
                final EditText passField = root.findViewById(R.id.passField);

                if (TextUtils.isEmpty(loginField.getText().toString())) {
                    Toast.makeText(LoginActivity.this, "Введите Логин!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (passField.getText().toString().length() < 6) {
                    Toast.makeText(LoginActivity.this, "Введите пароль!",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                dialog.show();
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
            }
        });
        TextView forgotPassword = findViewById(R.id.forgotPassword);
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
                startActivity(new Intent(LoginActivity.this, Forgot_password.class));
                finish();
            }
        });
    }
}