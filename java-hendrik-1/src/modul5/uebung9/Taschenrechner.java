package modul5.uebung9;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {

        int zahl1, zahl2, berechnung, ergebnis, beenden;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Bitte gib zwei Zahlen zur Berechnung ein: ");

            zahl1 = scanner.nextInt();
            zahl2 = scanner.nextInt();

            System.out.println("Wie soll berechnet werden?");
            System.out.println("1 - addieren (+)");
            System.out.println("2 - subrahieren (-)");
            System.out.println("3 - multiplizieren (*)");
            System.out.println("4 - dividieren (/)");

            berechnung = scanner.nextInt();

            switch (berechnung) {
                case 1:
                    ergebnis = zahl1 + zahl2;
                    System.out.println("Das Ergebnis ist: " +  ergebnis);
                    break;
                case 2:
                    ergebnis = zahl1 - zahl2;
                    System.out.println("Das Ergebnis ist: " +  ergebnis);
                    break;
                case 3:
                    ergebnis = zahl1 * zahl2;
                    System.out.println("Das Ergebnis ist: " +  ergebnis);
                    break;
                case 4:
                    ergebnis = zahl1 / zahl2;
                    System.out.println("Das Ergebnis ist: " +  ergebnis);
                    break;
                default:
                    System.out.println("Keine Berechnung möglich!");
            }

            System.out.println("Noch eine Berechnung? 1 - Ja | 0 - Nein");
            beenden = scanner.nextInt();

        } while (beenden != 0);
    }
}
