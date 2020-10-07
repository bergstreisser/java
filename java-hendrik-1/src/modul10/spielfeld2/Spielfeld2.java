package modul10.spielfeld2;

public class Spielfeld2 {

    private char[][] feld;

    Spielfeld2(int feldLaenge, int feldBreite) {
        feld = new char[feldLaenge][feldBreite];
    }

    public char[][] getFeld() {
        return feld;
    }

    public void zeichneSpielfeld(Spieler2 spieler2) {

        for(int i = 0; i < feld.length; i++) {
            feld[i][0] = '#';
            feld[i][feld.length - 1] = '#';
            for(int j = 1; j < feld.length - 1; j++) {
                feld[i][j] = ' ';
            }
            for(int k = 1; k < feld[i].length -1; k++) {
                feld[0][k] = '#';
                feld[feld.length - 1][k] = '#';
            }
            feld[spieler2.getxPosition()][spieler2.getyPosition()] = spieler2.getRichtung();
        }

        for(int i = 0; i < feld.length; i++) {
            for(int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j]);
            }
            System.out.println();
        }
    }
}
