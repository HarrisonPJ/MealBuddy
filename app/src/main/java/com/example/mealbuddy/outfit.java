package com.example.mealbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class outfit extends AppCompatActivity {
    EditText tempText;
    Button butt;
    FirebaseDatabase temp;
    DatabaseReference dataRef;
    String tex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outfit);
        temp = FirebaseDatabase.getInstance();
        butt = findViewById(R.id.push);
        tempText = findViewById(R.id.editText);
        dataRef = temp.getReference("Outfits").child("temp");
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tex = tempText.getText().toString();
                dataRef.setValue(""+tex);
            }
        });


    }
}
