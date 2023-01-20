package uebung4;

import java.util.Scanner;

public class ScannerMitSchleife {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wert;

        do {
            System.out.println("Bitte die Zahl 5 eingeben: ");
            wert = scanner.nextInt();
        } while (wert != 5);

        System.out.println("Du hast 5 eingegeben");

    }
}
