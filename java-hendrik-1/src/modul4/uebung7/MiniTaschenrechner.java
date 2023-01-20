package modul4.uebung7;

import java.util.Scanner;

public class MiniTaschenrechner {
    public static void main(String[] args) {
        int zahl1;
        int zahl2;
        int rest;
        int erg;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib die 1. Zahl ein: ");
        zahl1 = scanner.nextInt();
        System.out.println("Bitte gib die 2. Zahl ein: ");
        zahl2 = scanner.nextInt();
        erg = zahl1 / zahl2;
        rest = zahl1 % zahl2;

        System.out.println("Das Ergebnis ist: " + erg + " mit einem Rest von: " + rest);
    }
}
