package taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class taschenrechnerMain {

	public static void main(String[] args) throws IOException {
		boolean state = true;
		double zahl1 = 0, zahl2 = 0, zahl3 = 0, zahl4 = 0;
		int anzahlElemente = 0;
		String eingabe = "0";
		int eingabeFromString = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(state) {
			System.out.println("Rechenoperation?");
			System.out.println("<0> Ende <1> Plus");
			System.out.println("<2> Minus <3> Mal");
			System.out.println("<4> Geteilt <5> Wurzel");
			System.out.println("<6> Modulo <7> Potenz");
			System.out.println("<8> Natürlicher Logarithmus (ln) <9> Logarithmus Basis 10 (log10)");
			System.out.println("<10> Fakultaet");


			eingabe = reader.readLine();
			eingabeFromString = Integer.parseInt(eingabe);

			switch(eingabeFromString) {
			case 0:
				System.out.println("Prozedur wird beendet");
				state = false;
				break;

			case 1:
				System.out.println("Sollen 2, 3 oder 4 zahlen addiert werden?");
				eingabe = reader.readLine();
				anzahlElemente = Integer.parseInt(eingabe);

				if(anzahlElemente==2) {
					System.out.println("Erste Zahl?");
					eingabe = reader.readLine();
					zahl1 = Integer.parseInt(eingabe);

					System.out.println("Zweite Zahl?");
					eingabe = reader.readLine();
					zahl2 = Integer.parseInt(eingabe);

					System.out.println("Das Ergebnis ist: " + (zahl1 + zahl2));
				}
				if(anzahlElemente==3) {
					System.out.println("Erste Zahl?");
					eingabe = reader.readLine();
					zahl1 = Integer.parseInt(eingabe);

					System.out.println("Zweite Zahl?");
					eingabe = reader.readLine();
					zahl2 = Integer.parseInt(eingabe);

					System.out.println("Dritte Zahl?");
					eingabe = reader.readLine();
					zahl3 = Integer.parseInt(eingabe);

					System.out.println("Das Ergebnis ist: " + (zahl1 + zahl2 + zahl3));
				}
				if(anzahlElemente==4) {
					System.out.println("Erste Zahl?");
					eingabe = reader.readLine();
					zahl1 = Integer.parseInt(eingabe);

					System.out.println("Zweite Zahl?");
					eingabe = reader.readLine();
					zahl2 = Integer.parseInt(eingabe);

					System.out.println("Dritte Zahl?");
					eingabe = reader.readLine();
					zahl3 = Integer.parseInt(eingabe);

					System.out.println("Vierte Zahl?");
					eingabe = reader.readLine();
					zahl4 = Integer.parseInt(eingabe);

					System.out.println("Das Ergebnis ist: " + (zahl1 + zahl2 + zahl3 + zahl4));
				}
				break;

			case 2:
				System.out.println("Sollen 2, 3 oder 4 zahlen subtrahiert werden?");
				eingabe = reader.readLine();
				anzahlElemente = Integer.parseInt(eingabe);

				if(anzahlElemente==2) {
					System.out.println("Erste Zahl?");
					eingabe = reader.readLine();
					zahl1 = Integer.parseInt(eingabe);

					System.out.println("Zweite Zahl?");
					eingabe = reader.readLine();
					zahl2 = Integer.parseInt(eingabe);

					System.out.println("Das Ergebnis ist: " + (zahl1 - zahl2));
				}
				if(anzahlElemente==3) {
					System.out.println("Erste Zahl?");
					eingabe = reader.readLine();
					zahl1 = Integer.parseInt(eingabe);

					System.out.println("Zweite Zahl?");
					eingabe = reader.readLine();
					zahl2 = Integer.parseInt(eingabe);

					System.out.println("Dritte Zahl?");
					eingabe = reader.readLine();
					zahl3 = Integer.parseInt(eingabe);

					System.out.println("Das Ergebnis ist: " + (zahl1 - zahl2 - zahl3));
				}

				if(anzahlElemente==4) {
					System.out.println("Erste Zahl?");
					eingabe = reader.readLine();
					zahl1 = Integer.parseInt(eingabe);

					System.out.println("Zweite Zahl?");
					eingabe = reader.readLine();
					zahl2 = Integer.parseInt(eingabe);

					System.out.println("Dritte Zahl?");
					eingabe = reader.readLine();
					zahl3 = Integer.parseInt(eingabe);

					System.out.println("Vierte Zahl?");
					eingabe = reader.readLine();
					zahl4 = Integer.parseInt(eingabe);

					System.out.println("Das Ergebnis ist: " + (zahl1 - zahl2 - zahl3 - zahl4));
				}
				break;
			case 3:
				System.out.println("Sollen 2, 3 oder 4 zahlen multipliziert werden?");
				eingabe = reader.readLine();
				anzahlElemente = Integer.parseInt(eingabe);

				if(anzahlElemente==2) {
					System.out.println("Erste Zahl?");
					eingabe = reader.readLine();
					zahl1 = Integer.parseInt(eingabe);

					System.out.println("Zweite Zahl?");
					eingabe = reader.readLine();
					zahl2 = Integer.parseInt(eingabe);

					System.out.println("Das Ergebnis ist: " + (zahl1 * zahl2));
				}
				if(anzahlElemente==3) {
					System.out.println("Erste Zahl?");
					eingabe = reader.readLine();
					zahl1 = Integer.parseInt(eingabe);

					System.out.println("Zweite Zahl?");
					eingabe = reader.readLine();
					zahl2 = Integer.parseInt(eingabe);

					System.out.println("Dritte Zahl?");
					eingabe = reader.readLine();
					zahl3 = Integer.parseInt(eingabe);

					System.out.println("Das Ergebnis ist: " + (zahl1 * zahl2 * zahl3));
				}
				if(anzahlElemente==4) {
					System.out.println("Erste Zahl?");
					eingabe = reader.readLine();
					zahl1 = Integer.parseInt(eingabe);

					System.out.println("Zweite Zahl?");
					eingabe = reader.readLine();
					zahl2 = Integer.parseInt(eingabe);

					System.out.println("Dritte Zahl?");
					eingabe = reader.readLine();
					zahl3 = Integer.parseInt(eingabe);

					System.out.println("Vierte Zahl?");
					eingabe = reader.readLine();
					zahl4 = Integer.parseInt(eingabe);

					System.out.println("Das Ergebnis ist: " + (zahl1 * zahl2 * zahl3 * zahl4));
				}
				break;

			case 4:
				System.out.println("Erste Zahl?");
				eingabe = reader.readLine();
				zahl1 = Integer.parseInt(eingabe);

				System.out.println("Zweite Zahl?");
				eingabe = reader.readLine();
				zahl2 = Integer.parseInt(eingabe);

				if(zahl2 == 0){
					System.out.println("Es darf nicht duch 0 dividiert werden!");
					break;
				}
				System.out.println("Das Ergebnis ist: " + (zahl1 / zahl2));
				break;

			case 5:
				System.out.println("Zahl?");
				eingabe = reader.readLine();
				zahl1 = Integer.parseInt(eingabe);

				System.out.println("Das Ergebnis ist: " + Math.sqrt(zahl1));

				break;

			case 6:
				System.out.println("Erste Zahl?");
				zahl1 = Integer.parseInt(reader.readLine());
				System.out.println("Zweite Zahl?");
				zahl2 = Integer.parseInt(reader.readLine());

				System.out.println("Das Ergebnis ist: " + zahl1 % zahl2);

				break;

			case 7:
				System.out.println("Basis?");
				zahl1 = Integer.parseInt(reader.readLine());
				System.out.println("Exponent?");
				zahl2 = Integer.parseInt(reader.readLine());

				System.out.println("Das Ergebnis ist: " + Math.pow(zahl1, zahl2));

				break;

			case 8:
				System.out.println("Zahl für ln?");
				zahl1 = Integer.parseInt(reader.readLine());

				if (zahl1 <= 0) {
					System.out.println("Eingabe muss größer als 0 sein.");
				} else {
					System.out.println("Das Ergebnis von log10(" + zahl1 + ") ist: " + Math.log10(zahl1));
				}

				break;

			case 9:
				System.out.println("Zahl für log10?");
				zahl1 = Double.parseDouble(reader.readLine());
				if (zahl1 <= 0) {
					System.out.println("Eingabe muss größer als 0 sein.");
				} else {
					System.out.println("Das Ergebnis von log10(" + zahl1 + ") ist: " + Math.log10(zahl1));
				}
				break;

			case 10:
				System.out.println("Gib n ein:");
				zahl1 = Integer.parseInt(reader.readLine());
				if (zahl1 < 0) {
					System.out.println("Die eingegebene Zahl darf nicht kleiner als 0 sein.");
				}
				int result = 1;
				for (int i = 1; i <= zahl1; i++) {
					result *= i;
				}
				System.out.println("Die Fakultaet von " + zahl1 + " ist " + result);
				break;

			default: System.out.println("Gib eine Zahl zwischen 0 und 9 ein!");
			
			}//end switch Case

				
		}//end while

	}
}
