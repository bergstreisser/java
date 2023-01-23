package taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class taschenrechnerMain {

	public static void main(String[] args) throws IOException {
		boolean state = true;
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
				int zahl1, zahl2 = 0;
				System.out.println("Erste Zahl?");
				eingabe = reader.readLine();
				zahl1 = Integer.parseInt(eingabe);
				
				System.out.println("Zweite Zahl?");
				eingabe = reader.readLine();
				zahl2 = Integer.parseInt(eingabe);
				
				System.out.println("Das Ergebnis ist: " + (zahl1 + zahl2));
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			
			}//end switch Case
				
		}//end while

	}
}
