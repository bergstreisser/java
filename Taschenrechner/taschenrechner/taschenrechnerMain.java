package taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class taschenrechnerMain {

	public static void main(String[] args) {
		boolean state = true;
		String eingabe = "0";
		int eingabeFromString = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(state) {
			System.out.println("Rechenoperation?");
			System.out.println("<0> Ende <1> Plus");
			System.out.println("<2> Minus <3> Mal");
			System.out.println("<4> Geteilt");
			
			try {
				eingabe = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			eingabeFromString = Integer.parseInt(eingabe);
			
			switch(eingabeFromString) {
			case 0:
				
				break;
			case 1:
				
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
