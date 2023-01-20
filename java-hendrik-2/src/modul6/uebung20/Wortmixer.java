package modul6.uebung20;

import java.util.Scanner;

public class Wortmixer {

    public static String MixMethode1(String wort) {
        char buchstabe1 = wort.charAt(0);
        char buchstabe2 = wort.charAt(wort.length()-1);
        return buchstabe2 + wort.substring(1, wort.length()-1) + buchstabe1;
    }

    public static String MixMethode2(String wort) {
        String teil1 = wort.substring(0, wort.length() / 2);
        String teil2 = wort.substring(wort.length() / 2);
        return teil2 + teil1;
    }

    public static String MixMethode3(String wort) {
        String teil1 = wort.substring(0, wort.length()-3);
        String teil2 = wort.substring(wort.length()-3);
        return teil1 + teil2.toUpperCase();
    }
}
