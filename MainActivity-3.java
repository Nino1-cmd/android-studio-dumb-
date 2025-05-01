package com.example.lepasana;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   TextView nameText, ageText, programText, yrText, whamText;
   ImageView imageText;
   Button button;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        imageText = findViewById(R.id.phoesh);

        nameText = findViewById(R.id.Name);
        ageText = findViewById(R.id.Age);
        programText = findViewById(R.id.Program);
        yrText = findViewById(R.id.yr);
        whamText = findViewById(R.id.whame);
        button = findViewById(R.id.Button);

        nameText.setText("Name: Nino Marrrel Lepasana");
        ageText.setText("Age: 21");
        programText.setText("Program: BS-IT");
        yrText.setText("Year: 2nd Year");
        whamText.setText("WHAM: I tend to make efforts especially with things I like");
    }
}