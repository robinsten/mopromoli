package com.example.mopromoli20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class MainActivity2 extends AppCompatActivity {


    //Schwierigkeit in Sternen 1-5
    private float rating;

    private int anzahlSpieler;
    private Editable inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RatingBar ratingbar = findViewById(R.id.ratingBar);
        Button button2 = findViewById(R.id.picture_button3);
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        EditText EditTextNumber = findViewById(R.id.editTextNumber);

        button2.setOnClickListener(v -> {

            //Schwierigkeit und Anzahl Spieler werden in Spieler und Schwierigkeit gespeichert, dann auf zur nächsten Seite

            rating = ratingbar.getRating();
            Schwierigkeit.setSchwierigkeit(rating);
            inputText =  EditTextNumber.getText();
            String inputString = inputText.toString();
            anzahlSpieler = Integer.parseInt(inputString);
            Spieler.setAnzahlSpieler(anzahlSpieler);
            startActivity(intent);
        });
    }
}