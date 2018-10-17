package uebung1;

import java.util.*;

public class waehrungsumrechner {
//class to exchange currency
	public static void main(String[] args) {
		String s = "";
		boolean again = true; //
		do {
		Scanner sc = new Scanner(System.in);
		System.out.print(
				"Geben Sie 1 ein, um von Euro in Dollar umzurechnen\nund 2 für eine Umrechnung von Dollar in Euro: ");
		int zahl = sc.nextInt();
		if (zahl == 1) {
			System.out.print("Geben Sie den Betrag in Euro ein: ");
			double euro = sc.nextDouble();
			double dollar = euro * 1.34;
			System.out.print(euro + " Euro sind " + dollar + " Dollar. ");
			again = true;
		}
		else if (zahl == 2) {
			System.out.print("Geben Sie den Betrag in Dollar ein: ");
			double dollar = sc.nextDouble();
			double euro = dollar / 1.34;
			System.out.print(dollar + " Dollar sind " + euro + " Euro.");
			again = true;
		}
		else {
			System.out.println("Bitte geben Sie entweder eine 1 oder eine 2 ein.\n1 für Euro in Dollar Umrechnung und 2 für Dollar in Euro.");
	}
		System.out.print("\nMöchten Sie eine weitere Umrechnung starten?\nGeben Sie j ein, um eine erneute Umrechnung zu starten und n um das Programm zu beenden.");
		s = sc.nextLine();
		if (s == "j") {
			again = true;
		}
		else {
			again = false;
		}
		}
		while (!again);
}
}
