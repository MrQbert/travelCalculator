package com.example.travelcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView milesToDestination;
    Spinner sp;
    String cities[] = {"Washington DC","Miami","New York","Los Angeles"};
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.sp);

        milesToDestination = findViewById(R.id.milesToDestination);
        adapter = new  ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1,cities);

        sp.setAdapter(adapter);



    }
}