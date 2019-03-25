import java.util.Scanner;

public class VierGewinnt {

	public static void main(String[] args) {

		Spieler spieler1 = null;
		Spieler spieler2 = null;

		System.out.println("\nWillkommen zu Vier Gewinnt!\n");
		Spielfeld spielfeldAusgabe = new Spielfeld();
		spielfeldAusgabe.ausgabe();
		
		Scanner startSpieler1 = new Scanner(System.in);
		System.out.println("Spieler 1! Möchten Sie spielen (1), oder soll der Zufallsspieler für Sie spielen (2) ?");
		int inpSpieler1 = startSpieler1.nextInt();

		Scanner startSpieler2 = new Scanner(System.in);
		System.out.println("Spieler 2! Möchten Sie spielen (1), oder soll der Zufallsspieler für Sie spielen (2) ?");
	
		int inpSpieler2 = startSpieler2.nextInt();

		if (inpSpieler1 == 1) {
			spieler1 = new Mensch();
		} else if (inpSpieler1 == 2) {
			spieler1 = new Zufallsspieler();
	
		} else if (inpSpieler2 == 1) {
			spieler2 = new Mensch();
		} else if (inpSpieler2 == 2) {
			spieler2 = new Zufallsspieler();
		} else {
			throw new RuntimeException("Bitte machen Sie eine gültige Eingabe!");
		}

		Scanner wahl = new Scanner(System.in);
		System.out.println("Wer darf anfangen? Spieler 1 oder Spieler 2?");
		int inpWahl = wahl.nextInt();

		if (inpWahl == 1) {
			spieler1.setzen(spielfeldAusgabe);
			spieler2.setzen(spielfeldAusgabe);
			
		} else if (inpWahl == 2) {
			spieler2.setzen(spielfeldAusgabe);
			spieler1.setzen(spielfeldAusgabe);
		} else {
			throw new RuntimeException("Bitte machen Sie eine gültige Eingabe!");
		}
		startSpieler1.close();
		startSpieler2.close();
		wahl.close();
	}
}
