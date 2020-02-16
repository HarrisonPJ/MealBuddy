package com.example.mealbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button butt;
<<<<<<< Updated upstream
int counter;
TextView textCounter;
=======

>>>>>>> Stashed changes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< Updated upstream
//yogabbagabba
        counter = 5;
//hello world im dumb
        butt=findViewById(R.id.butt);
        textCounter = findViewById(R.id.textView);

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textCounter.setText(counter);
=======


        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



>>>>>>> Stashed changes
            }
        });

    }
}
