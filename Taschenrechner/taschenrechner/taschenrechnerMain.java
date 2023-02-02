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
				
				System.out.println("Das Ergebnis ist: " + (zahl1 / zahl2));
				break;
				
			case 5:
				System.out.println("Zahl?");
				eingabe = reader.readLine();
				zahl1 = Integer.parseInt(eingabe);
				
				System.out.println("Das Ergebnis ist: " + Math.sqrt(zahl1));
				
				break;
			
			}//end switch Case
				
		}//end while

	}
}
