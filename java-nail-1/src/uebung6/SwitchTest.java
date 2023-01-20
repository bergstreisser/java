package uebung6;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Bitte gib Dein Alter als Zahl ein: ");
        int alter = scanner1.nextInt();

        switch (alter) {
            case 0:
                System.out.println("Du bist geboren");
                break;
            case 7:
                System.out.println("Du gehst in die Schule");
                break;
            case 18:
                System.out.println("Du hast Führerschein bekommen");
            default:
                System.out.println("keine passende Antwort gefunden");
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Bitte gib Dein Alter als Wort ein: ");
        String age = scanner2.nextLine();

        switch (age) {
            case "eins":
                System.out.println("Du bist geboren");
                break;
            case "sieben":
                System.out.println("Du gehst in die Schule");
                break;
            case "achtzehn":
                System.out.println("Du hast Führerschein bekommen");
            default:
                System.out.println("keine passende Antwort gefunden");
        }
    }
}
