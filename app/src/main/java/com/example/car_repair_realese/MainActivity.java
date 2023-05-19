package com.example.car_repair_realese;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnFragment2, btnFragment1;

    private FirstFragment firstFragment;
    private SecondFragment secondFragment;
    private NewButtonFragment newButtonFragment;

    // Переменная для хранения состояния выбранной кнопки
    private int selectedButtonId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment1 = findViewById(R.id.btn_fragment1);
        btnFragment2 = findViewById(R.id.btn_fragment2);

        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        newButtonFragment = new NewButtonFragment();

        btnFragment1.setVisibility(View.VISIBLE);
        btnFragment2.setVisibility(View.VISIBLE);

        // Устанавливаем начальное состояние выбранной кнопки
        selectedButtonId = R.id.btn_fragment1;

        setNewFragment(firstFragment);

        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNewFragment(firstFragment);
                selectedButtonId = R.id.btn_fragment1; // Обновляем состояние выбранной кнопки
            }
        });

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNewFragment(secondFragment);
                selectedButtonId = R.id.btn_fragment2; // Обновляем состояние выбранной кнопки
            }
        });
    }

    private void setNewFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }

    // Метод для получения ID выбранной кнопки
    public int getSelectedButtonId() {
        return selectedButtonId;
    }
}
