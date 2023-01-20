package modul6.uebung10;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        float weight;
        float size;
        int bmi;

        System.out.println("----- BMI-Rechner -----");
        System.out.println("Bitte gebe Deinen Namen ein: ");
        name = scanner.nextLine();
        System.out.println("Bitte gebe Dein Gewicht in Kg ein: ");
        weight = scanner.nextFloat();
        System.out.println("Bitte gebe Deine Groesse in Meter ein: ");
        size = scanner.nextFloat();
        System.out.println(" ");

        //BMI berechnen
        bmi = Math.round(weight / (size * size));
        System.out.println("*************************************************");
        System.out.println(name + " Dein BMI ist: " + bmi);

        //Klassifizierung
        String kf = klassifizierungBerechnen(bmi);
        System.out.println("Deine Klassifizierung ist: " + kf);
    }

    public static String klassifizierungBerechnen(int bmi) {

        if(bmi >= 40) {
            return "Adipositas Grad 3";
        } else if(bmi <= 24) {
            return "Normalgewicht";
        } else if(bmi <= 29) {
            return "Übergewicht";
        } else if(bmi <= 34) {
            return "Adipositas Grad 1";
        } else if(bmi <= 39) {
            return "Adipositas Grad 2";
        } else {
            return "Klassifizierung nicht möglich...";
        }
    }
}
