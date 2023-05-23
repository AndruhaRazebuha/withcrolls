package com.example.car_repair_realese;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class InfoOrdersActivity extends AppCompatActivity {

    private ImageButton backButton;
    private Spinner spinner, spinner1, spinner2;
    private Spinner spinner_units,spinner_units1,spinner_units2,spinner_units3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_orders);

        spinner = findViewById(R.id.spinner_info_order);
        spinner1 = findViewById(R.id.spinner_info_order1);
        spinner2 = findViewById(R.id.spinner_info_order2);

        spinner_units=findViewById(R.id.spinner_units);
        spinner_units1=findViewById(R.id.spinner_units1);
        spinner_units2=findViewById(R.id.spinner_units2);
        spinner_units3=findViewById(R.id.spinner_units3);

        String[] items_units = {"шт","л","кг"};
        ArrayAdapter<String> adapter_units = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_units);



// Создание массива с элементами выпадающего списка
        String[] items = {"Сделано", "В работе"};

// Создание адаптера для списка с выбором
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

// Установка адаптера для списка с выбором
        spinner.setAdapter(adapter);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);


        spinner_units.setAdapter(adapter_units);
        spinner_units1.setAdapter(adapter_units);
        spinner_units2.setAdapter(adapter_units);
        spinner_units3.setAdapter(adapter_units);

        spinner_units.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = (String) adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner_units.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = (String) adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner_units1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = (String) adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner_units2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = (String) adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner_units3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = (String) adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



// Добавление слушателя выбора элемента
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
// Обработка выбора элемента
                String selectedItem = (String) parent.getItemAtPosition(position);
// Дополнительные действия в зависимости от выбранного элемента
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
// Обработка случая, когда не выбран ни один элемент
            }
        });

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
// Обработка выбора элемента для первого Spinner
                String selectedItem = (String) parent.getItemAtPosition(position);
// Дополнительные действия в зависимости от выбранного элемента
                }@Override
            public void onNothingSelected(AdapterView<?> parent) {
// Обработка случая, когда не выбран ни один элемент для первого Spinner
            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
// Обработка выбора элемента для первого Spinner
                String selectedItem = (String) parent.getItemAtPosition(position);
// Дополнительные действия в зависимости от выбранного элемента
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
// Обработка случая, когда не выбран ни один элемент для первого Spinner
            }
        });

        backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Обработка события щелчка кнопки назад
                onBackPressed();
            }
        });
    }
}