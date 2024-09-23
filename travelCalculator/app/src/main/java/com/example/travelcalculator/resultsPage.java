package com.example.travelcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultsPage extends AppCompatActivity {
    TextView displayResults;
    Double milesTo;
    Double mpg;
    Double gasCost;
    Double totalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);

        Intent intent= getIntent();
        displayResults = findViewById(R.id.displayResults);
        milesTo = intent.getDoubleExtra("milesTo",0);
        mpg= intent.getDoubleExtra("mpg",0);
        gasCost= intent.getDoubleExtra("gasCost",0);

        travel calcTravelNow = new travel();
        calcTravelNow.CalcExp(milesTo,mpg,gasCost);
        totalCost = calcTravelNow.getExp();

        displayResults.setText("Your Cost to Travel will be $" + String.format("%.2f",totalCost));



    }
}