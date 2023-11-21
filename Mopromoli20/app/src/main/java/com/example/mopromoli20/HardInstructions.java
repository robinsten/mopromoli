package com.example.mopromoli20;

import java.util.ArrayList;
import java.util.Collections;

public class HardInstructions {
    private final String string1;
    private final String string2;

    public HardInstructions(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }
    public HardInstructions(){
        string1 = "0";
        string2 = "0";
    }

    public  String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }
    //In Abhängigkeit von der Schwierigkeit werden Schlücke festgelegt
    public String AnzahlSippsHard (double difficulty) {
        ArrayList<String> AnzahlSipps = new ArrayList<>();
        if (difficulty<= 1) {
            AnzahlSipps.add("4 Schlücke für dich!");
            AnzahlSipps.add("6 Schlücke für dich!");
            AnzahlSipps.add("5 Schlücke für dich!");
            AnzahlSipps.add("7 Schlücke für dich!");

        }
        else if  (difficulty <=2) {
            AnzahlSipps.add("8 Schlücke für dich!");
            AnzahlSipps.add("6 Schlücke für dich!");
            AnzahlSipps.add("5 Schlücke für dich!");
            AnzahlSipps.add("7 Schlücke für dich!");
        } else if (difficulty > 2 && difficulty <= 3) {
            AnzahlSipps.add("8 Schlücke für dich!");
            AnzahlSipps.add("9 Schlücke für dich!");
            AnzahlSipps.add("6 Schlücke für dich!");
            AnzahlSipps.add("7 Schlücke für dich!");
        } else if (difficulty > 3 && difficulty <= 4) {
            AnzahlSipps.add("8 Schlücke für dich!");
            AnzahlSipps.add("9 Schlücke für dich!");
            AnzahlSipps.add("10 Schlücke für dich!");
            AnzahlSipps.add("7 Schlücke für dich!");
            AnzahlSipps.add("Glas auf Ex!");
            AnzahlSipps.add("1 Shot für dich!");
            AnzahlSipps.add("1 Shot für dich!");
            AnzahlSipps.add("1 Shot für dich!");
        } else if (difficulty > 4) {
            AnzahlSipps.add("13 Schlücke für dich!");
            AnzahlSipps.add("9 Schlücke für dich!");
            AnzahlSipps.add("10 Schlücke für dich!");
            AnzahlSipps.add("12 Schlücke für dich!");
            AnzahlSipps.add("Glas auf Ex!");
            AnzahlSipps.add("1 Shot für dich!");
            AnzahlSipps.add("2 Shots für dich!");
            AnzahlSipps.add("1 Shots für dich!");
            AnzahlSipps.add("3 Shots für dich");
            AnzahlSipps.add("Glas auf Ex!");
        }
        Collections.shuffle(AnzahlSipps);
        return AnzahlSipps.get(0);
    }

    //Hard Instructions werden Hinzugefügt, ein erstes wird Random ausgegeben
    public  HardInstructions addToHardInstructions(double Anzahl){
        ArrayList<HardInstructions> Random = new ArrayList<>();
        Random.add(new HardInstructions("fechten","Du startest einen Fechtkampf , "+ AnzahlSippsHard(Anzahl) ));
        Random.add(new HardInstructions("purzelbaum", "Du machst einen Purzelbaum, "+ AnzahlSippsHard(Anzahl)  ));
        Random.add(new HardInstructions("tour_de_atown", "Du supportest die Tour de Atown. " + AnzahlSippsHard(Anzahl)  ));
        Random.add(new HardInstructions("strahlkotzen", "Du kotzt im Strahl, " + AnzahlSippsHard(Anzahl) ));
        Random.add(new HardInstructions("reifen", "Du fährst in einem Reifen, " +  AnzahlSippsHard(Anzahl) ));
        Random.add(new HardInstructions("rammbock", "Dein Kopf ist ein Rammbock, " + AnzahlSippsHard(Anzahl)  ));
        Random.add(new HardInstructions("mueller_dick", "Du machst eine Boxerei gegen Müller (dick). " + AnzahlSippsHard(Anzahl) ));
        Random.add(new HardInstructions("kuuseng_boxkampf", "Du startest einen Kuuseng Boxkampf. " + AnzahlSippsHard(Anzahl) ));
        Random.add(new HardInstructions("flasche_leer", "Du trinkst nach dem Superbowl eine Flasche Vodka leer, " + AnzahlSippsHard(Anzahl) ));
        Collections.shuffle(Random);
        return Random.get(0);


    }


}

