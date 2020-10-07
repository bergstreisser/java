package modul10.spielfeld2;

public class Spielfeld2 {

    public void zeichneSpielfeld(int x, int y) {

        char[][] feld = new char[x][y];

        for(int i = 0; i < feld.length; i++) {
            feld[i][0] = '#';
            feld[i][y-1] = '#';
            for(int j = 1; j < feld.length - 1; j++) {
                feld[i][j] = ' ';
            }
            for(int k = 1; k < feld[i].length -1; k++) {
                feld[0][k] = '#';
                feld[y-1][k] = '#';
            }
        }

        for(int i = 0; i < feld.length; i++) {
            for(int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j]);
            }
            System.out.println();
        }
    }

}
