package uebung1;

import java.util.*;

public class waehrungsumrechner {
//class to exchange currency
	public static void main(String[] args) {
		boolean again = true;
		do {
			// loop until user inserts 'no' to not start another exchange
			Scanner sc = new Scanner(System.in);
			System.out.print(
					"Geben Sie 1 ein, um von Euro in Dollar umzurechnen\nund 2 für eine Umrechnung von Dollar in Euro: ");
			int zahl = sc.nextInt();
			// if instruction to convert Euro in Dollar (1) and Dollar in Euro (2)
			if (zahl == 1) {
				System.out.print("Geben Sie den Betrag in Euro ein: ");
				double euro = sc.nextDouble();
				double dollar = euro * 1.34;
				System.out.print(euro + " Euro sind " + dollar + " Dollar. ");
				again = true;
			} else if (zahl == 2) {
				System.out.print("Geben Sie den Betrag in Dollar ein: ");
				double dollar = sc.nextDouble();
				double euro = dollar / 1.34;
				System.out.print(dollar + " Dollar sind " + euro + " Euro.");
				again = true;
				// else to strutting wrong inputs
			} else {
				System.out.println(
						"Bitte geben Sie entweder eine 1 oder eine 2 ein.\n1 für Euro in Dollar Umrechnung und 2 für Dollar in Euro.");
				again = true;
			}
			Scanner ac = new Scanner(System.in);
			String s = new String();
			// program asks user if he wants to start another translation, 'j' to start the program again and 'n' to finish it
			System.out.println("\nMöchten Sie eine weitere Umrechnung starten?\nGeben Sie j ein, um eine erneute Umrechnung zu starten und n um das Programm zu beenden.");
			s = ac.next();
			if (s.equals("j") || s.equals("J")) {
				again = true;
			} else if (s.equals("n") || s.equals("N")) {
				again = false;
			} else {
				System.out.println("Eingabe ungültig");
			}
			// loop until user says 'n' to finsih program
		} while (again);
		System.out.print("Tschüss!");
	}
}


// Scanner.sc.close();
// Scanner.ac.close();