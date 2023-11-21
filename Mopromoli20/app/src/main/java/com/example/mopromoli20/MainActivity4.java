package com.example.mopromoli20;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Random;


public class MainActivity4 extends AppCompatActivity {


        private final ArrayList<Spieler> AllPlayer = Spieler.getAllPlayer();



        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main5);

                final int[] diceValues = {1,2,3,4,5,6};
                ViewGroup layout = findViewById(R.id.layout);
                TextView challenges = findViewById(R.id.output_challenges);
                Button dice_button = findViewById(R.id.dice_button);

                // Set the OnClickListener outside of the loop
                dice_button.setOnClickListener(v -> {
                        // Inside the listener, perform the logic for each player
                        for (int k = 0; k < Spieler.getAnzahlSpieler(); k++) {
                                String Name = AllPlayer.get(k).getName();
                                challenges.setText("Du bist dran " + Name + "!");

                                // Perform your dice roll logic here
                                shuffleArray(diceValues);
                                dice_button.setText(String.valueOf(diceValues[0]));
                                String wurf = dice_button.getText().toString();
                                int gewuerfelt = Integer.parseInt(wurf);
                                checkWhatToDo(gewuerfelt, challenges);
                                //
                        }
                });
        }


        public void setAllButtonsFalse(ViewGroup layout) {
                layout.post(() -> {
                        for (int i = 0; i < layout.getChildCount(); i++) {
                                View view = layout.getChildAt(i);
                                if (view instanceof ImageButton) {
                                        view.setEnabled(false);
                                }
                                if (view instanceof Button) {
                                        view.setEnabled(false);
                                }
                        }
                });
        }

        //Methode shuffled den Array
        private static void shuffleArray(int[] array) {

                Random random = new Random();

                for (int i = array.length - 1; i > 0; i--) {
                        int index = random.nextInt(i + 1);
                        int temp = array[index];
                        array[index] = array[i];
                        array[i] = temp;
                }
        }

        //Methode checked auf welchem Feld der Spieler ist und löst die entsprechende Aktion aus
        public void checkWhatToDo(int Position, TextView Challenge_Anzeigen) {

                final float rating = Schwierigkeit.getSchwierigkeit();
                HardInstructions h = new HardInstructions();
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);

                switch (Position) {
                        case 1: {
                                ImageButton ErstesFeld = findViewById(R.id.pictureButton1);
                                ErstesFeld.setEnabled(true);
                                ErstesFeld.setOnClickListener(v -> {
                                        ErstesFeld.setEnabled(false);

                                        startActivity(intent);
                                });
                                break;

                        }
                        case 4:
                        {
                                ImageButton ZweitesFeld = findViewById(R.id.picture_button2);
                                ZweitesFeld.setEnabled(true);
                                ZweitesFeld.setOnClickListener(v -> {
                                        ZweitesFeld.setEnabled(false);
                                        startActivity(intent);

                                });

                                break;
                        }
                        case 5:
                        {
                                ImageButton DrittesFeld = findViewById(R.id.picture_button3);
                                DrittesFeld.setEnabled(true);
                                DrittesFeld.setOnClickListener(v -> {
                                        DrittesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                                break;
                        }
                        case 7:
                        {
                                ImageButton ViertesFeld = findViewById(R.id.picture_button4);
                                ViertesFeld.setEnabled(true);
                                ViertesFeld.setOnClickListener(v -> {
                                        ViertesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                                break;
                        }
                        case 8:
                        {
                                ImageButton FuenftesFeld = findViewById(R.id.picture_button5);
                                FuenftesFeld.setEnabled(true);
                                FuenftesFeld.setOnClickListener(v -> {
                                        FuenftesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                        }
                        case 9:
                        {
                                ImageButton SechstesFeld = findViewById(R.id.picture_button6);
                                SechstesFeld.setEnabled(true);
                                SechstesFeld.setOnClickListener(v -> {
                                        SechstesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                                break;
                        }

                        case 11:
                        {
                                ImageButton AchtesFeld = findViewById(R.id.pictureButton8);
                                AchtesFeld.setEnabled(true);
                                AchtesFeld.setOnClickListener(v -> {
                                        AchtesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                                break;
                        }
                        case 13:
                        {
                                ImageButton NeuntesFeld = findViewById(R.id.picture_button9);
                                NeuntesFeld.setEnabled(true);
                                NeuntesFeld.setOnClickListener(v -> {
                                        NeuntesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                                break;
                        }
                        case 16:
                        {
                                ImageButton ZehntesFeld = findViewById(R.id.pictureButton10);
                                ZehntesFeld.setEnabled(true);
                                ZehntesFeld.setOnClickListener(v -> {
                                     ZehntesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                                break;
                        }
                        case 17:
                        {
                                ImageButton ElftesFeld = findViewById(R.id.picture_button11);
                                ElftesFeld.setEnabled(true);
                                ElftesFeld.setOnClickListener(v -> {
                                        ElftesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                                break;
                        }
                        case 19:
                        {
                                ImageButton ZwoelftesFeld = findViewById(R.id.pictureButton12);
                                ZwoelftesFeld.setEnabled(true);
                                ZwoelftesFeld.setOnClickListener(v -> {
                                        ZwoelftesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                                break;
                        }
                        case 20:
                        {
                                ImageButton DreizehntesFeld = findViewById(R.id.pictureButton13);
                                DreizehntesFeld.setEnabled(true);
                                DreizehntesFeld.setOnClickListener(v -> {
                                        DreizehntesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                                break;
                        }
                        case 21:
                        {
                                ImageButton VierzehntesFeld = findViewById(R.id.pictureButton14);
                                VierzehntesFeld.setEnabled(true);
                                VierzehntesFeld.setOnClickListener(v -> {
                                        VierzehntesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                                break;
                        }

                        case 23:
                        {
                                ImageButton SechzehntesFeld = findViewById(R.id.pictureButton16);
                                SechzehntesFeld.setEnabled(true);
                                SechzehntesFeld.setOnClickListener(v -> {
                                     SechzehntesFeld.setEnabled(false);
                                        startActivity(intent);
                                });

                                break;
                        }
                        case 2:
                        {
                                ImageButton Stadtwerke1 = findViewById(R.id.wwerk_Button1);
                                Stadtwerke1.setEnabled(true);
                                Stadtwerke1.setOnClickListener(v -> {
                                        Challenge_Anzeigen.setText("Stadtwerke Altdorf! Trinke das 3 fache deines Wurfes!");
                                        Stadtwerke1.setEnabled(false);
                                });

                                break;
                        }
                        case 14: {
                                ImageButton Stadtwerke2 = findViewById(R.id.wwerk2);
                                Stadtwerke2.setEnabled(true);
                                Stadtwerke2.setOnClickListener(v -> {
                                        Challenge_Anzeigen.setText("Stadtwerke Altdorf! Trinke das 3fache deines Wurfes!");
                                        Stadtwerke2.setEnabled(false);
                                });

                                break;
                        }
                        case 3:
                                Button ZuBesuch = findViewById(R.id.knast_button);
                                ZuBesuch.setEnabled(true);
                                ZuBesuch.setOnClickListener(v -> {
                                        Challenge_Anzeigen.setText("Glück gehabt, nur zu Besuch!");
                                        ZuBesuch.setEnabled(false);
                                });
                                break;

                        case 6:

                                ImageButton KingsCupFill1 = findViewById(R.id.kingscup_fill);
                                KingsCupFill1.setEnabled(true);
                                KingsCupFill1.setOnClickListener(v -> {
                                                Challenge_Anzeigen.setText("Du darfst etwas in den Kingscup füllen!");
                                                KingsCupFill1.setEnabled(false);
                                });


                                break;
                        case 10:
                                ImageButton Extreme1 = findViewById(R.id.extreme1);
                                Extreme1.setEnabled(true);
                                Extreme1.setOnClickListener(v -> {System.out.println("Test2");

                                        VideoView videoView = findViewById(R.id.videoView3);
                                        videoView.setVisibility(View.VISIBLE);

                                        HardInstructions k = h.addToHardInstructions(rating);
                                        String video = k.getString1();
                                        String beschreibung = k.getString2();


                                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/raw/" + video));
                                        videoView.start();

                                        videoView.setOnCompletionListener(mp -> {
                                                Challenge_Anzeigen.setText(beschreibung);
                                                videoView.setVisibility(View.INVISIBLE);
                                                Extreme1.setEnabled(false);
                                        });
                                });
                                break;
                        case 22:
                                ImageButton Extreme2 = findViewById(R.id.extreme2);
                                Extreme2.setEnabled(true);
                                Extreme2.setOnClickListener(v -> {

                                        VideoView videoView = findViewById(R.id.videoView3);
                                        videoView.setVisibility(View.VISIBLE);

                                        HardInstructions k = h.addToHardInstructions(rating);
                                        String video = k.getString1();
                                        String beschreibung = k.getString2();

                                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/raw/" + video));
                                        videoView.start();

                                        videoView.setOnCompletionListener(mp -> {
                                                Challenge_Anzeigen.setText(beschreibung);
                                                videoView.setVisibility(View.INVISIBLE);
                                                Extreme2.setEnabled(false);
                                        });
                                });
                                break;

                        case 12:
                                Button DrinkKingsCup = findViewById(R.id.kingscup_button);
                                DrinkKingsCup.setEnabled(true);
                                DrinkKingsCup.setOnClickListener(v -> {Challenge_Anzeigen.setText("Du musst den Kingscup trinken!");
                                DrinkKingsCup.setEnabled(false);
                                });
                                break;


                        case 18:
                                ImageButton FillKingsCup2 = findViewById(R.id.fillKingscup);
                                FillKingsCup2.setEnabled(true);
                                FillKingsCup2.setOnClickListener(v -> {Challenge_Anzeigen.setText("Du darfst den Kingscup füllen!");
                                FillKingsCup2.setEnabled(false);
                                });
                                break;


                        case 24:
                                Button StartFeld = findViewById(R.id.starting_button);
                                StartFeld.setEnabled(true);
                                StartFeld.setOnClickListener(v -> {
                                    StartFeld.setEnabled(false);
                                    Challenge_Anzeigen.setText("Das Start Feld. Hier passiert nichts!");
                                });
                                break;
                        default:
                                break;
                }

        }


}
//  //Methode simuliert einen geworfenen Würfel mit den Zahlen 1 bis 6
//        public void simulateDiceRoll() {
//
//                Button dice_button = findViewById(R.id.dice_button);
//                dice_button.setEnabled(true);
//
//                dice_button.setOnClickListener(v -> {
//
//                        shuffleArray(diceValues);
//                        final Handler handler = new Handler();
//
//                        for (int i = 0; i < numRolls; i++) {
//                                handler.postDelayed(() -> {
//                                        //6 weil die Zahlen von 1 bis 6 gewürfelt werden können
//                                        int number = new Random().nextInt(6) + 1;
//                                        dice_button.setText(String.valueOf(number));
//                                }, i * delayMillis);
//                        }
//                        handler.postDelayed(() -> {
//                                int lastNumber = diceValues[0];
//                                dice_button.setText(String.valueOf(lastNumber));
//                        }, numRolls * delayMillis);
//
//                        dice_button.setEnabled(false);
//                });
//
//        }