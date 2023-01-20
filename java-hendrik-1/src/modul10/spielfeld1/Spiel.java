package modul10.spielfeld1;

import java.util.Scanner;

public class Spiel {
    public static void main(String[] args) {

        String aktion = "v";
        boolean spiel = true;

        Spielfeld spielfeld = new Spielfeld();
        Spieler spieler = new Spieler();
        spielfeld.zeichneFeld(spieler, aktion);

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Aktion: g = gehen, l = links drehen, r = rechts drehen, v = vorwärtz drehen, z = zurück drehen, q = beenden");
            aktion = scanner.nextLine();

            switch (aktion) {
                case "g": {
                    if(spieler.getRichtung().equals("^") && spieler.getyPosition() < spielfeld.getGRENZE_OBEN()) {
                        System.out.println("gehen nicht möglich!");
                    } else if(spieler.getRichtung().equals("v") && spieler.getyPosition() > spielfeld.getGRENZE_UNTEN()) {
                        System.out.println("gehen nicht möglich!");
                    } else if(spieler.getRichtung().equals("<") && spieler.getxPosition() < spielfeld.getGRENZE_LINKS()) {
                        System.out.println("gehen nicht möglich!");
                    } else if(spieler.getRichtung().equals(">") && spieler.getxPosition() > spielfeld.getGRENZE_RECHTS()) {
                        System.out.println("gehen nicht möglich!");
                    } else {
                        spielfeld.zeichneFeld(spieler, aktion);
                    }
                    break;
                }
                case "l", "r", "v", "z":
                    spielfeld.zeichneFeld(spieler, aktion);
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
