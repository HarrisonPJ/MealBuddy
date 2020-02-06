package com.example.mealbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button butt;
int counter;
TextView textCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//yogabbagabba
        counter = 5;
        //tesing brett branch
        //i helped lmao

        butt=findViewById(R.id.butt);
        textCounter = findViewById(R.id.textView);

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textCounter.setText(counter);
            }
        });

    }
}
