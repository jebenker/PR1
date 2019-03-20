import java.util.Scanner;

public class VierGewinnt {

	public static void main(String[] args) {

		PCPC a = new PCPC();
		PCMensch b = new PCMensch();
		MenschMensch c = new MenschMensch();

		System.out.println("Willkommen zu Vier Gewinnt!\n");
		Spielfeld [][] spielfeldAusgabe = new Spielfeld();
		spielfeldAusgabe.ausgabe();
		Scanner start = new Scanner(System.in);
		System.out.println(
				"Wie möchten Sie spielen?\nSie gegen den Zufallsspieler (Geben Sie dafür die 1 ein),\nZufallsspieler gegen Zufallsspieler (Geben Sie die 2 ein),\noder möchten Sie zu zweit spielen? (Geben Sie die 3 ein)");
		int startS = start.nextInt();
		start.close();
		if (startS == 2) {
			a.setzenSpieler1();
			a.setzenSpieler2();
			
/**			System.out.println("Wer darf anfangen? Zufallsspieler 1 oder 2?");
			Scanner eins = new Scanner(System.in);
			int einsEingabe = eins.nextInt();
			eins.close();
			if (einsEingabe == 1) {
				a.setzenSpieler1();
				a.setzenSpieler2();
			}
			if (einsEingabe == 2) {
				a.setzenSpieler2();
				a.setzenSpieler1();
			} else {
				throw new RuntimeException("Bitte machen Sie eine gültige Eingabe!");
			}
*/
		} else if (startS == 1) {
			// b.setzen();
		} else if (startS == 3) {
			// c.setzen();
		} else {
			throw new RuntimeException("Bitte machen Sie eine gültige Eingabe. Geben Sie entweder 1, 2 oder 3 ein.");
		}

	}

}
