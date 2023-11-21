package com.example.mopromoli20;


import java.util.ArrayList;

public class Spieler {
    private final String name;
    private Integer position;
    private static Integer AnzahlSpieler;
    private final static ArrayList<Spieler> AllPlayer = new ArrayList<>();



    public Spieler(String name, Integer position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public static void setAnzahlSpieler(Integer anzahlSpieler) {
        AnzahlSpieler = anzahlSpieler;
    }
    public static Integer getAnzahlSpieler(){
        return AnzahlSpieler;
    }
    public static ArrayList<Spieler> getAllPlayer() {
        return AllPlayer;
    }
    public void addToAllPlayer() {
        AllPlayer.add(this);
    }

    public Integer getPosition() {return position;}
    public void setPosition(int position) { this.position= position ;}
}
