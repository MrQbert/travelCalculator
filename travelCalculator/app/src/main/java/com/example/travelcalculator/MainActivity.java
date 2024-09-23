package com.example.travelcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView milesToDestination;
    Spinner sp;
    String cities[] = {"Washington DC","Miami","New York","Los Angeles"};
    ArrayAdapter adapter;
    EditText mpgInput;
    EditText gasCostInput;
    String mpg;
    String gasCost;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.sp);
        mpgInput = findViewById(R.id.mpgInput);
        gasCostInput = findViewById(R.id.gasCostInput);
        milesToDestination = findViewById(R.id.milesToDestination);
        adapter = new  ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1,cities);

        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
               if (position ==0 ){
                   milesToDestination.setText("700.8");
               }else if(position == 1){
                   milesToDestination.setText("1380.6");
               }else if(position == 2){
                   milesToDestination.setText("790.2");
               }else if(position == 3){
                   milesToDestination.setText("2014.8 ");
               }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void calculateNow(View v) {
        Double milesTo = Double.parseDouble(milesToDestination.getText().toString()) ;
        Double mpg = Double.parseDouble(mpgInput.getText().toString());
        Double gasCost= Double.parseDouble(gasCostInput.getText().toString());
        Intent i = new Intent(this,resultsPage.class);
        i.putExtra("milesTo", milesTo);
        i.putExtra("mpg",mpg);
        i.putExtra("gasCost", gasCost);
        startActivity(i);
    }
}