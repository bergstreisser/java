package modul10;

public class TestFeld {
    public static void main(String[] args) {
        char[][] feld = new char[10][10];

        for(int i = 0; i < feld.length; i++) {
            feld[i][0] = '#';
            feld[i][9] = '#';
            for(int j = 1; j < feld.length - 1; j++) {
                feld[i][j] = ' ';
            }
            for(int k = 1; k < feld[i].length -1; k++) {
                feld[0][k] = '#';
                feld[9][k] = '#';
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
