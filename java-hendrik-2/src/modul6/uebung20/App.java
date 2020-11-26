package modul6.uebung20;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe ein Wort ein: ");
        String wort = scanner.nextLine();

        System.out.println("------------------------");
        System.out.println(Wortmixer.MixMethode1(wort));
        System.out.println();
        System.out.println(Wortmixer.MixMethode2(wort));
        System.out.println();
        System.out.println(Wortmixer.MixMethode3(wort));

    }
}
