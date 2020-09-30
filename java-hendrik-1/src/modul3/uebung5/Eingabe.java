package modul3.uebung5;

import java.util.Scanner;

public class Eingabe {
    public static void main(String[] args) {

        String vorname, nachname;
        int alter;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib Deinen Vornamen ein: ");
        vorname = scanner.next();

        System.out.println("Bitte gib Deinen Nachnamen ein: ");
        nachname = scanner.next();

        System.out.println("Bitte gib Dein Alter ein: ");
        alter = scanner.nextInt();

        System.out.println(vorname + " " + nachname + ", " + alter + " Jahre alt");
    }
}
