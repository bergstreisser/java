package modul4.uebung6;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        float weight;
        float size;
        float bmi;

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
        System.out.println(name + " Dein BMI ist: " + bmi);
    }
}
