package com.example.mopromoli20;


import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;

public class Instructions {

    public  String RandomPlayer (ArrayList < Spieler > myList) {
        Collections.shuffle(myList);
        Spieler p = myList.get(0);
        return p.getName();

    }
    //Möglichkeit, alle Instructions zu bekommen
    public ArrayList<String> getInstructions() {


        ArrayList<String> AllInstructions = addToInstructions( Spieler.getAllPlayer(), Schwierigkeit.getSchwierigkeit());
        return AllInstructions;
    }

    //Liste wird erstellt
    public  ArrayList<String> addToInstructions( ArrayList myList, double difficulty) {
        ArrayList Instructions = new ArrayList<Instructions>();
        Collections.shuffle(myList);
        Instructions.add("Ein Pädophiler klopft beim Footballschauen an der Tür. Vor Lauter Beunruhigung musst du erstmal "+ AnzahlSippsNormal(difficulty) + " Schlücke trinken " + RandomPlayer(myList));
        Instructions.add("Die Iris haut deine PS4 weg. Trinke "+ AnzahlSippsNormal(difficulty) + " Schlücke Marco");
        Instructions.add(RandomPlayer(myList) + " hat beef mit seinem Kuuseng. Trink "+ AnzahlSippsNormal(difficulty) +" Schlücke.");
        Instructions.add("Ralles Onkel füllt " + RandomPlayer(myList)+" mit Schnaps ab. Trink "+ AnzahlSippsNormal(difficulty) +" Schlücke nach");
        Instructions.add("Die Security in Bulgarien schlägt "+RandomPlayer(myList)+" zusammen, trink "+ AnzahlSippsNormal(difficulty) +" Schlücke");
        Instructions.add(RandomPlayer(myList)+ " macht Feuer beim FCA, dafür muss er "+ AnzahlSippsNormal(difficulty)+" Schlücke trinken");
        Instructions.add("McDonalds ruft "+ RandomPlayer(myList)+"s Arbeit an, darauf erstmal "+ AnzahlSippsNormal(difficulty) +" Schlücke!");
        Instructions.add(RandomPlayer(myList)+ " wird im Chuckys von einem Betrunkenen angepisst, darauf "+ AnzahlSippsNormal(difficulty) + "Schlücke");
        Instructions.add(RandomPlayer(myList)+ " ext nach einem Eagles Sieg ne Flasche Ouzo und muss Kotzen, trink lieber "+ AnzahlSippsNormal(difficulty)+ " Schlücke nach!");
        Instructions.add(RandomPlayer(myList) +  " verirrt sich im Maisfeld und trifft Saskia, darauf erstmal "+ AnzahlSippsNormal(difficulty)+ " Schlücke");
        Instructions.add(RandomPlayer(myList) + " raucht Shisha auf dem Klo und trinkt dafür " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add("Maddin zahlt 1000€ für eine Saufhütte und verteilt aus Frust " + AnzahlSippsNormal(difficulty)+ " Schlücke an alle");
        Instructions.add(RandomPlayer(myList)+ " fällt besoffen von einem Mecces Stuhl und braucht "+ AnzahlSippsNormal(difficulty) + " Schlücke zum wieder Aufstehen");
        Instructions.add(RandomPlayer(myList)+ "s Mond geht beim Flunkyball auf, aus Schock für den Rest "+ AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList)+ " ruft besoffen durchgehend nach einem Taxi und trinkt dafür "+ AnzahlSippsNormal(difficulty)+ " Schlücke");
        Instructions.add(RandomPlayer(myList)+ " trinkt 2 Jahre abgelaufenen O-Saft. Darauf "+ AnzahlSippsNormal(difficulty) + "Schlücke zum runterspülen");
        Instructions.add(RandomPlayer(myList)+"s Freundin schnauzt ihn 3h auf einer FCA Feier an. Darauf " + AnzahlSippsNormal(difficulty) + " Schlücke.");
        Instructions.add(RandomPlayer(myList)+ " kotzt auf das Tennisnetz und muss zur Strafe " + AnzahlSippsNormal(difficulty) + " Schlücke trinken");
        Instructions.add("Die Wirbelsäule von " + RandomPlayer(myList)+ " wird ausgerenkt und ist erst nach "+ AnzahlSippsNormal(difficulty) +"Schlücken wieder drin");
        Instructions.add(RandomPlayer(myList) + " kassiert einen krassen Highkick, trink mit dem schwersten " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add("Jemand mit Aufsicht wirft "+ RandomPlayer(myList)+" raus, " + AnzahlSippsNormal(difficulty) + " Schlücke aus Schock");

        Instructions.add(RandomPlayer(myList) + " verwechselt seine Mutter mit den Nachbarn und trinkt " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add("Das Zuhause von " + RandomPlayer(myList)+ " ist in der Garage, deswegen trinkt er " + AnzahlSippsNormal(difficulty)+ " Schlücke");
        Instructions.add(myList.get(0)+ " hat zwei Fäuste und trinkt " + AnzahlSippsNormal(difficulty) + " Schlücke  mit " + myList.get(1));
        Collections.shuffle(myList);

        Instructions.add(RandomPlayer(myList) + " wirft Shishakohlen auf den Boden und trinkt " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList)+ " will sich den Kiefer brechen und trinkt " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add("Eine Random Frau beim Mecces wird von "+ RandomPlayer(myList)+ " weggeschubst. " + AnzahlSippsNormal(difficulty) + " Schlücke für dich");
        Instructions.add(RandomPlayer(myList)+ " verliert beim Kingscup 4 mal in Folge und verteilt " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add("Die Mutter von " + RandomPlayer(myList)+ " kommt während dem Fortnite zocken um 5 vorbei. " + AnzahlSippsNormal(difficulty) + " Schlücke für dich");
        Instructions.add(RandomPlayer(myList) + " ist schwarz, also schafft er den Zug safe noch und trinkt " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList)+ " ist der größte Opferpfälzer und 'Tuat a mal die Verlängerung her' " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " reihert von 2 Bier und verteilt deswegen lieber " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " hat beim Volleyball 1 vs 3 verloren sucht sich 2 Kumpane und trinkt mit denen  " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add("Jemand hat von " + RandomPlayer(myList) + "s Maß getrunken, deswegen verteilt er " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " schiebt einen Einkaufswagen durch Altdorf, jeder trinkt " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add("Chälene macht Faxxen mit " + RandomPlayer(myList)+ ". Verteile " + AnzahlSippsNormal(difficulty) + "  Schlücke");
        Instructions.add(RandomPlayer(myList) + " eröffnet eine Diskapo Webseite. Alle Mitlglieder  " +AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " wirft beim Nam Reis ins Aquarium und verteilt " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " flexxt in Bulgarien ne dicke und verteilt " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " trinkt 23 Bier an einen Abend und gibt den anderen " + AnzahlSippsNormal(difficulty) + " Schlücke ab");
        Instructions.add("Die Tür von " + RandomPlayer(myList) + " wird im Bulgarienurlaub aufgebrochen. Dafür verteilt er " + AnzahlSippsNormal(difficulty) + "Schlücke");
        Instructions.add("Ivan zieht " + RandomPlayer(myList) + " ab, verteile " + AnzahlSippsNormal(difficulty)+ " Schlücke");
        Instructions.add(myList.get(0)+ " wird besoffen vom Maddin am Klo vom FCA gefunden und trinkt "+ AnzahlSippsNormal(difficulty) + " Schlücke mit " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add(myList.get(0)+ " macht besoffen mit Schland rum und geht danach kotzen. " + AnzahlSippsNormal(difficulty)+" Schlücke für " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add(myList.get(0) + " trägt ein Ortsschild von Altdorf nach Pattenhofen und trinkt "+ AnzahlSippsNormal(difficulty) +" Schlücke mit " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add(myList.get(0) + " hat Hausverbot in der Party Area und verteilt " + AnzahlSippsNormal(difficulty) + " Schlücke an " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add("Man kann mit " + myList.get(0) + " kein Brot brechen, deswegen verteilt er " + AnzahlSippsNormal(difficulty) + " Schlücke an " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add("Jemand legt seine Arme um " + myList.get(0) + ". Verteile " + AnzahlSippsNormal(difficulty)+ " Schlücke an " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add("Die Blauen Zipfel machen ein Foto mit " + myList.get(0) + ". Verteile "+ AnzahlSippsNormal(difficulty) + " Schlücke an " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add(RandomPlayer(myList)+ " scheißt auf die Demokratie. Alle die zustimmen "+ AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(myList.get(0) + " fragt seine Mutter ob er eine Haftpflicht hat. Diese verteilt " +AnzahlSippsNormal(difficulty) + " Schlücke an "+ myList.get(1));
        Collections.shuffle(myList);
        Instructions.add(myList.get(0) + " macht ein Ablenkungsmanöver bei Bens Cousine und verteilt " +AnzahlSippsNormal(difficulty) + " Schlücke an " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add(myList.get(0) + " ruft am Boden liegend nach der Airforce und verteilt " + AnzahlSippsNormal(difficulty) + " Schlücke an " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add("Trink mal " + AnzahlSippsNormal(difficulty) +" Schlücke mit  " + RandomPlayer(myList));
        Instructions.add(myList.get(0)+ " trinkt " + AnzahlSippsNormal(difficulty) + " Schlücke mit " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add(myList.get(0)+" zieht seinen Rucksack falsch herum auf und verteilt " + AnzahlSippsNormal(difficulty) + " Schlücke an " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add(RandomPlayer(myList)+" eskaliert und die Saufhütte wird gesperrt. " +AnzahlSippsNormal(difficulty) + "  Schlücke für dich");
        Instructions.add(RandomPlayer(myList) + " zündet das Tarnnetz an und bekommt vom Maddin hausverbot. " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(myList.get(0)+" wirft mit " + myList.get(1)+ " Bierdeckel im Vereinsheim rum. Beide "+ AnzahlSippsNormal(difficulty) + " Schlücke");
        Collections.shuffle(myList);
        Instructions.add(myList.get(0)+ " lässt sich eine Glatze rasieren und verteilt " + AnzahlSippsNormal(difficulty) + "  Schlücke an " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add(myList.get(0) + " betritt Kubas Eigentum und verteilt " + AnzahlSippsNormal(difficulty) + " Schlücke an " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add(RandomPlayer(myList) + " trinkt eine Flasche Ouzo und muss ins Krankenhaus. " + AnzahlSippsNormal(difficulty) + " Schlücke für dich");
        Instructions.add("Maddin findet " + RandomPlayer(myList) + " besoffen am Klo vom FC Altdorf. " + AnzahlSippsNormal(difficulty) + " Schlücke für alle FCA Mitglieder");

        Instructions.add(myList.get(0)+ " und " + myList.get(1) + " werden um halb eins vom Herbi abgeholt, trinkt zusammen " + AnzahlSippsNormal(difficulty)*2 + " Schlücke.");
        Collections.shuffle(myList);
        Instructions.add(RandomPlayer(myList) + " macht in der Stern WG mit einer Kasachin rum. Ihr Freund zwingt dich zu "+ AnzahlSippsNormal(difficulty) + " Schlücken");
        Instructions.add(RandomPlayer(myList) + " macht in Bulgarien die Salatschlampe an. Trinke " + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " bricht bei Manni und Wolfi im Schweinestall ein. Alle unter 95 Kilo werden überrant und trinken" + AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " wacht ohne Hose bei Lars und Yannick auf dem Balkon auf. " + AnzahlSippsNormal(difficulty) + " Schlücke für dich!");
        Instructions.add(RandomPlayer(myList) + " setzt beim Pferderennen eine Bumbas. Spielt eine Runde, du setzt min. " + AnzahlSippsNormal(difficulty)*2 + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " spritzt Bier in Bens Auto. Verteile " + AnzahlSippsNormal(difficulty)+ " Schlücke");
        Instructions.add(RandomPlayer(myList)+ " kauft im Mecces Wasser und ist deswegen ein Hurensohn.  " + AnzahlSippsNormal(difficulty)+ " Schlücke für diese Schande.");
        Instructions.add(RandomPlayer(myList) + " vergisst seine Freundin im Tal und stellt sich im Lift ein Bier rein. " +AnzahlSippsNormal(difficulty) + " Schlücke für dich");

        Instructions.add(RandomPlayer(myList) + " singt die erste Strophe von Eihockey oder trinkt" +AnzahlSippsNormal(difficulty) + " Schlücke" );
        Instructions.add(RandomPlayer(myList) + " singt die erste Strophe von Feierwehrprüfung oder trinkt "  +AnzahlSippsNormal(difficulty) +" Schlücke");

        Instructions.add("Der kleinste muss zu Peter Auer ans Kopfballpendel und trinkt dafür " +AnzahlSippsNormal(difficulty) +" Schlücke");
        Instructions.add(RandomPlayer(myList) + " trinkt in der Schwarzach einen Lambrusco und speit. " +AnzahlSippsNormal(difficulty) + " Schlücke für dich");
        Instructions.add(myList.get(0) + " fällt halb eine Böschung runter und stirbt fast. Verteile " +AnzahlSippsNormal(difficulty) + " Schlücke an " + myList.get(1));
        Collections.shuffle(myList);
        Instructions.add(myList.get(0)+ " geht in die falsche Shotgunbar und wird fast ausgeraubt. " +AnzahlSippsNormal(difficulty) + " Schlücke an " + myList.get(1));
        Collections.shuffle(myList);

        Instructions.add(RandomPlayer(myList) + " will sich besoffen mit einem tschechen auf Deutsch unterhalten. Trinke " +AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " trifft Ice Tiger Fans in der Sparta Ultra Bar. Verteile " +AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " stolpert in Bietigheim über einen Rauchtopf und sein Schuh wird rot. " +AnzahlSippsNormal(difficulty) + " Schlücke für dich");

        Collections.shuffle(myList);

        Instructions.add(RandomPlayer(myList) + " trinkt auf der Fahrt nach Straubing eine Flasche Jäger pur und kann dann nicht mehr reden. " +AnzahlSippsNormal(difficulty) +" Schlücke für dich");
        Instructions.add(RandomPlayer(myList) + " kotzt am Berliner Flughafen, trinke " +AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " spielt am Vatertag in Grünsberg Busfahren, spielt mal ne Runde");
        Instructions.add(myList.get(0) + " spielt im Ice mit " + myList.get(1) + " Bierpong. " +AnzahlSippsNormal(difficulty) + " Schlücke für euch beide");
        Collections.shuffle(myList);
        Instructions.add(RandomPlayer(myList) + "s IceTiger Sticker werden im Aufzug andauernd abgerissen. " +AnzahlSippsNormal(difficulty) + " Schlücke für dich");
        Instructions.add("Wir spielen Kategorien aus Kingscup, " + RandomPlayer(myList) + " legt die Kategorie fest, " +AnzahlSippsNormal(difficulty) + " Schlücke für den Verlierer");
        Instructions.add(RandomPlayer(myList) + " ist ab sofort der Questionmaster, falls er es verkackt, " +AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " rutscht besoffen im Max Morlock Stadion aus und die Security will ihn aus dem Block werfen, " +AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add("Ganz A-Town hat " + RandomPlayer(myList) + "s DAZN Account, Passwort ändern kostet " +AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " holt sich bis 10 Uhr kostenloses Bar Wasser damit er nichts zahlen muss, " +AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " singt einem Kanadier das Christoph Daum Lied vor, sing die erste Strophe erneut oder trinke " +AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " geht Skifahren und fährst in den Abfangszaun. Wer nicht fahren kann trinkt " +AnzahlSippsNormal(difficulty) + " Schlücke");
        Instructions.add(RandomPlayer(myList) + " fährt besoffen auf einem E-Roller, " +AnzahlSippsNormal(difficulty) + " Schlücke das du den Führerschein zurück bekommst");
        Instructions.add("Zählt Tigers Spieler auf der erste der keinen mehr kennt trinkt " +AnzahlSippsNormal(difficulty) +" Schlücke");
        Instructions.add("Zählt Club Spieler auf der erste der keinen mehr kennt trinkt "+AnzahlSippsNormal(difficulty) +" Schlücke");

        if (difficulty > 3) {
            Instructions.add(RandomPlayer(myList)+"s Jägermeistershots kommen mit der Post, seine Mutter rastet aus. Einen (Jäger)Shot zur Beruhigung");
            Instructions.add(RandomPlayer(myList)+ " trinkt eine Flasche Vodka auf Ex und landet im Krankenhaus. Mische auf Ex!");
            Instructions.add(RandomPlayer(myList) + " fällt besoffen in einen Busch, verteilt so viel wie er will und trinkt das gleiche");
            Instructions.add(RandomPlayer(myList) + " zerstört aus versehen seine Haustür und Marco trinkt einen Shot");
            Instructions.add("Eine Runde Wasserfall startet bei " + RandomPlayer(myList));
            Instructions.add("Die beiden schwersten machen ein Busfahren 1 vs 1 ");
            Instructions.add(RandomPlayer(myList) + " bekommt Malaria von einem Inder. Trink was hochprozentiges zum desinfizieren");
            Collections.shuffle(myList);
            Instructions.add("Pucki spielt mit " + myList.get(0) + " Bierpong und ist ultra schlecht, 2 Strafshots für " + myList.get(1));
            Instructions.add("Ein Rentner fängt mit " + RandomPlayer(myList) + " im Zug fast eine Boxerei an. Glas auf Ex");

        }

        return Instructions;
    }

    //Anhand der Schwierigkeit wird die Menge der Schlücke festgelegt
    public int AnzahlSippsNormal (double difficulty) {
        ArrayList<Integer> AnzahlSipps = new ArrayList<>();
        if (difficulty<= 1) {
            for (int i = 1; i <4; i++) {
                AnzahlSipps.add(i);
            }
        }
        else if  (difficulty <=2) {
            for (int i = 1; i<5; i++) {
                AnzahlSipps.add(i);
            }
        } else if (difficulty > 2 && difficulty <= 3) {
            for (int i = 2; i<5; i++) {
                AnzahlSipps.add(i);
            }
        } else if (difficulty > 3 && difficulty <= 4) {
            for (int i = 3; i < 6; i++) {
                AnzahlSipps.add(i);
            }
        } else if (difficulty > 4) {
            for (int i = 5; i < 9; i++) {
                AnzahlSipps.add(i);
            }
        }
        Collections.shuffle(AnzahlSipps);
        return AnzahlSipps.get(0);
    }


}
