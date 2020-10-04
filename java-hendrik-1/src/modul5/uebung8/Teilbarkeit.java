package modul5.uebung8;

public class Teilbarkeit {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            if((i % 3) == 0 && (i % 4) == 0) {
                System.out.println(i + " teilbar durch 3 und 4");
            } else if((i % 3) == 0) {
                System.out.println(i + " teilbar durch 3");
            } else if((i % 4) == 0) {
                System.out.println(i + " teilbar durch 4");
            } else {
                System.out.println(i);
            }

        }

    }
}
