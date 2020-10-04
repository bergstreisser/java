package modul6.uebung11;

import java.util.Scanner;

public class Konsolenspiel {
    public static void main(String[] args) {
        int zahl, antwort;
        boolean ende = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib eine Zahl zwischen 1 und 1000 ein: ");
        zahl = scanner.nextInt();

        do {
            System.out.println("Ist Deine Zahl = 500? 1 - Ja");
            System.out.println("Ist Deine Zahl < 500? 2 - Ja");
            System.out.println("Ist Deine Zahl > 500? 3 - Ja");
            antwort = scanner.nextInt();
            ende = getAntwort(antwort);


        } while (ende == false);

    }

    public static boolean getAntwort(int zahl) {
        if(zahl == 1) {
            return true;
        } else {
            return false;
        }
    }
}
