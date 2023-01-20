package uebung7;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] zahl = new int[5];

        int i = 0;
        int z = 1;
        while (i < zahl.length) {
            System.out.println("Bitte gib die " + z + ". Zahl ein: ");
            zahl[i] = scanner.nextInt();
            i++; z++;
        }

        System.out.print("Du hast eingegeben: ");
        for(int j = 0; j < zahl.length; j++) {
            if(j < zahl.length - 1) {
                System.out.print(zahl[j] + ".");
            } else {
                System.out.print(zahl[j]);
            }
        }
    }
}
