package modul10.spielfeld2;

public class Spielfeld2 {

    private int feldLaenge;
    private int feldBreite;
    private char[][] feld;

    Spielfeld2(int feldLaenge, int feldBreite) {
        this.feldLaenge = feldLaenge;
        this.feldBreite = feldBreite;
        feld = new char[feldLaenge][feldBreite];
    }

    public void zeichneSpielfeld(Spieler2 spieler2) {

        //das gesamte Spielfeld belegen
        for(int i = 0; i < feld.length; i++) {
            feld[i][0] = '#'; //linke Seite von oben nach unten mit # belegen
            feld[i][feld.length - 1] = '#'; //rechte Seiten von oben nach unten mit # belegen

            // 1 und -1 weil links und rechts schon mit # belegt
            for(int j = 1; j < feld.length - 1; j++) {
                feld[i][j] = ' ';
            }

            // 1 und -1 weil links und rechts schon mit # belegt
            for(int k = 1; k < feld[i].length -1; k++) {
                feld[0][k] = '#'; //obere Reihe von links nach rechts mit # belegen
                feld[feld.length - 1][k] = '#'; //untere Reihe von links nach rechts mit # belegen
            }
        }

        feld[feldLaenge - 2][feldBreite - 2] = '$';

        if(feld[spieler2.getxPosition()][spieler2.getyPosition()] == '$') {
            System.out.println("Gratuliere, Du hast das Geld gefunden!!!");
            System.out.println("Das Spiel ist beendet!");
            System.exit(0);
        }

        //den Spieler auf das Feld setzen
        if(feld[spieler2.getxPosition()][spieler2.getyPosition()] == '#') {
            System.out.println("gehen nicht möglich...");

            //Position des Spielers zurücksetzen
            if(spieler2.getRichtung() == '^') {
                spieler2.setyPosition(spieler2.getyPosition() + 1);
            } else if(spieler2.getRichtung() == '<') {
                spieler2.setxPosition(spieler2.getxPosition() + 1);
            } else if(spieler2.getRichtung() == '>') {
                spieler2.setxPosition(spieler2.getxPosition() - 1);
            } else if(spieler2.getRichtung() == 'v') {
                spieler2.setyPosition(spieler2.getyPosition() - 1);
            }
            feld[spieler2.getyPosition()][spieler2.getxPosition()] = spieler2.getRichtung();

        } else {
            feld[spieler2.getyPosition()][spieler2.getxPosition()] = spieler2.getRichtung();
        }

        //das gesamte Spielfeld drucken
        for(int i = 0; i < feld.length; i++) {
            for(int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j]);
            }
            System.out.println();
        }
    }
}
