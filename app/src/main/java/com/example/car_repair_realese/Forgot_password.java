package com.example.car_repair_realese;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Forgot_password extends AppCompatActivity {

    Button btnForgotPass;
    ConstraintLayout rootForgotPass;
    ProgressDialog dialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        btnForgotPass = findViewById(R.id.btnForgotPass);
        rootForgotPass = findViewById(R.id.rootForgotPass);

        dialog = new ProgressDialog(this);
        dialog.setMessage("Подождите...");
        btnForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText phone = findViewById(R.id.phoneField);
                if (TextUtils.isEmpty(phone.getText().toString())) {
                    Toast.makeText(Forgot_password.this, "Введите телефон!", Toast.LENGTH_SHORT).show();
                    return;
                }
                dialog.show();
                Toast.makeText(Forgot_password.this, "Код отправлен!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Forgot_password.this, LoginActivity.class));
                finish();
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
                startActivity(new Intent(Forgot_password.this, LoginActivity.class));
                finish();
            }
        });
    }
}