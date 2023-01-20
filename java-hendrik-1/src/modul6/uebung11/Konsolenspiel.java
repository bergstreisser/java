package modul6.uebung11;

import java.util.Scanner;

public class Konsolenspiel {
    public static void main(String[] args) {
        int zahl, antwort;
        int untergrenze = 1;
        int obergrenze = 1000;
        int frageZahl = (obergrenze +  untergrenze) / 2;
        int versuche = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib eine Ganzzahl zwischen "+untergrenze+" und "+obergrenze+" ein: ");
        zahl = scanner.nextInt();

        do {
            System.out.println("Ist Deine Zahl = " + frageZahl + "? 1 - Ja");
            System.out.println("Ist Deine Zahl < " + frageZahl + "? 2 - Ja");
            System.out.println("Ist Deine Zahl > " + frageZahl + "? 3 - Ja");
            antwort = scanner.nextInt();

            if(antwort == 1) {
                System.out.println("Deine Zahl ist: " +frageZahl);
                System.out.println("Du hast " + versuche + " Versuche gebraucht!");
            } else if(antwort == 2) {
                obergrenze = frageZahl;
                frageZahl = getFragezahl(obergrenze, untergrenze);
                //int div = obergrenze - untergrenze;
                //frageZahl = obergrenze - (div / 2);
                versuche++;
            } else if(antwort == 3) {
                untergrenze = frageZahl;
                frageZahl = getFragezahl(obergrenze, untergrenze);
                //int div = obergrenze - untergrenze;
                //frageZahl = untergrenze + (div / 2);
                versuche++;
            } else {
                System.out.println("Bitte nur 1, 2, oder 3 eingeben! ");
            }

        } while (antwort != 1);
    }

    public static int getFragezahl(int obergrenze, int untergrenze) {
        return (obergrenze +  untergrenze) / 2;
    }
}
