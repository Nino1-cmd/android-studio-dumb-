package com.example.lepasana;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Counter extends AppCompatActivity  {
    private int counter = 0;
    private TextView counterTextView;
    private Button increaseButton, decreaseButton, resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counter_layout);

        counterTextView = findViewById(R.id.counterTextView);
        increaseButton = findViewById(R.id.increaseButton);
        decreaseButton = findViewById(R.id.decreaseButton);
        resetButton = findViewById(R.id.resetButton);

        updateCounter();

        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                updateCounter();
            }
        });

        decreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter > 0) {
                    counter--;
                }
                updateCounter();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                updateCounter();
            }
        });
    }

    private void updateCounter() {
        counterTextView.setText(String.valueOf(counter));
    }
}
