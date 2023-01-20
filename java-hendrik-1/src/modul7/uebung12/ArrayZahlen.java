package modul7.uebung12;

import java.util.Scanner;

public class ArrayZahlen {
    public static void main(String[] args) {
        int anzahlZahlen;
        int temp = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wieviele Zahlen möchtest Du eingeben? ");
        anzahlZahlen = scanner.nextInt();

        int[] zahlen = new int[anzahlZahlen];

        System.out.println("Jetzt kannst du Deine " +anzahlZahlen+ " Zahlen nacheinander eingeben: ");
        for(int i = 0; i < zahlen.length; i++) {
            System.out.println("Zahl " + (i+1) + ": ");
            zahlen[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("**************************************************************");
        System.out.print("Du hast folgende Zahlen eingegeben: ");
        for(int zahl : zahlen) {
            if(zahl > temp) {
                temp = zahl;
            }
            System.out.print(zahl + " ");
        }

        //Größte Zahl ermitteln
        System.out.println();
        System.out.println("Die größte Zahl ist: " + temp);
        System.out.println("**************************************************************");
    }
}
