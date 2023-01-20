package uebung5;

public class BreackCont {
    public static void main(String[] args) {
        for(int i = 0; i <= 15; i++) {
            if(i%2 == 0) {
                continue; // continue verlässt die Schleife
            }
            System.out.println("Das ist eine ungerade Zahl: " + i);
        }
    }
}
