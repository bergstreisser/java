package uebung4;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben: ");

        int x = scanner.nextInt();
        System.out.println("Die Zahl ist: " + x);
    }
}
