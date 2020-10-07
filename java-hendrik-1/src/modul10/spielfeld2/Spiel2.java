package modul10.spielfeld2;

import java.util.Scanner;

public class Spiel2 {
    public static void main(String[] args) {

        int feldLaenge;
        int feldBreite;
        String aktion;
        boolean spiel = true;

        Spielfeld2 spielfeld2 = new Spielfeld2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gibt die Länge und Breite des Feldes ein.");
        System.out.println("Es sind nur quadratische Felder erlaubt!");

        do {
            System.out.println("Die Feldgröße soll min. 10X10 und max. 30X30 sein!");
            System.out.println("Länge: ");
            feldLaenge = scanner.nextInt();
            System.out.println("Breite: ");
            feldBreite = scanner.nextInt();

        } while ((feldLaenge != feldBreite) || (feldLaenge < 10) || (feldLaenge > 30));

        spielfeld2.zeichneSpielfeld(feldLaenge, feldBreite);

        do {
            System.out.println();
            System.out.println("Aktion: g = gehen, l = links drehen, r = rechts drehen, q = beenden");
            aktion = scanner.next();

            switch (aktion) {
                case "g":
                    spielfeld2.zeichneSpielfeld(feldLaenge, feldBreite);
                    break;
                case "l", "r", "v", "z":
                    spielfeld2.zeichneSpielfeld(feldLaenge, feldBreite);
                    break;
                case "q":
                    System.out.println("Spiel beendet!");
                    return;
                default:
                    System.out.println("Falsche Eingabe!");
            }

        } while (spiel);

    }
}
