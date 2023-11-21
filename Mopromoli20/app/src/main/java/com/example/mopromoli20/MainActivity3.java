package com.example.mopromoli20;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;



public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Integer Playercount = Spieler.getAnzahlSpieler();
        System.out.println("aaaaaaaaaaaaaaaaaaaaaa" + Playercount);
        final Integer[] numPlayers = {Playercount};


        TextInputEditText textInput1 = findViewById(R.id.TextInput1);
        Button button4 = findViewById(R.id.button4);

        button4.setOnClickListener(v -> {
            String text = textInput1.getText().toString();
            Spieler p = new Spieler(text, 0);
            p.addToAllPlayer();
            textInput1.setText("");

            // Spieleranzahl wird heruntergezählt, danach auf nächste Seite
            numPlayers[0]--;

            if (numPlayers[0] == 0) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }

}
