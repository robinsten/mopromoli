package com.example.mopromoli20;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity5 extends AppCompatActivity {

    private final Instructions i = new Instructions();
    private final Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView textView3 = findViewById(R.id.textView3);
        Button button5 = findViewById(R.id.button5);
        ArrayList<String> AlleInstructions = i.getInstructions();

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Wenn Button gedrückt wird, werden Instructions geshuffled, der Runner startet und shuffled die Aufgaben durch
                Collections.shuffle(AlleInstructions);
                Runnable updateTextRunnable = new Runnable() {
                    final long startTime = System.currentTimeMillis();

                    @Override
                    public void run() {
                        long elapsedTime = System.currentTimeMillis() - startTime;
                        if (elapsedTime > 5000) {
                            return;
                        }

                        long delay = (long) (200 * Math.pow(1.06, elapsedTime / 1000.0));

                        Collections.shuffle(AlleInstructions);
                        textView3.setText(AlleInstructions.get(0));
                        AlleInstructions.remove(0);

                        handler.postDelayed(this, delay);
                    }
                };
                handler.post(updateTextRunnable);

                //Bei erneutem Klick wird die Seite geschlossen und auf die Hauptseite zurückgekehrt

                button5.setOnClickListener(v1 -> finish());
            }



        });
    }
}
