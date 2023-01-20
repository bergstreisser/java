package modul7.uebung13;

public class SpezialArray {
    public static void main(String[] args) {
        int[][] feldArray = {{1,1,1}, {1,2,3}, {2,3,2}};
        System.out.println("Drei gleiche Zahlen gefunden? " + spielfeldArray(feldArray));
    }

    public static boolean spielfeldArray(int [][] feld) {
        for(int i = 0; i < feld.length; i++) {
            if(feld[i][0] == feld[i][1] && feld[i][0] == feld[i][2]) {
                return true;
            }
        }
        return false;
    }
}
