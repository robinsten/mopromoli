package com.example.mopromoli20;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button3 = findViewById(R.id.button3);
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.lord);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        //Startbildschirm, wenn Button gedrückt geht es zur nächsten Seite

        button3.setOnClickListener(v -> {

            mp.start();
            startActivity(intent);

        });
    }
}
