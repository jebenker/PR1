import java.util.Scanner;

public class VierGewinnt {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner eingabe = new Scanner(System.in);
		
		
		Spieler spieler1 = null;
		Spieler spieler2 = null;

		Spieler zufallsspieler1 = null;
		Spieler zufallsspieler2 = null;

		

		Spielfeld spielfeld = new Spielfeld();

		System.out.println("\nHerzlich Willkommen zu Vier Gewinnt!\n");
		System.out.println(" 0  1  2  3  4  5  6");
		spielfeld.ausgabe();
		
		System.out.println("Wie möchten Sie spielen?\n\nMöchten Sie gegen einen Freund spielen? Dann geben Sie die 1 ein.\nWer darf anfangen? Wählen Sie die 1 für Spieler 1 und die 2 für Spieler 2.\n\nWenn Sie gegen einen Zufallsspieler spielen wollen, dann wählen Sie die 2.\nWer beginnt? Geben Sie die 1 ein, wenn Sie starten möchten und die 2 für den Zufalsspieler.\n\nFür ein Spiel von Zufallsspieler gegen Zufallsspieler,geben Sie die 3 ein.\nWenn Zufallsspieler 1 starten darf, wählen Sie die 1 und für Zufallsspieler 2 die 2.");
		
		//input to decide how to play; opportunities: human against human, human against comp and comp against comp
		int wahl = eingabe.nextInt();
		

		// if input is 1, human plays against human
		// condition who is allowed to start playing
		if (wahl == 1) {
			spieler1 = new Mensch("Merve", 'x');
			spieler2 = new Mensch("Jessi", 'o');
			int eingabeBeginner = eingabe.nextInt();
			if (eingabeBeginner == 1) {
				mVSm(spieler1, spieler2);
			} else {
				mVSm(spieler2, spieler1);
			}
			
			// if input is 2, human against computer
			// condition who is allowed to start playing
		} else if (wahl == 2) {
			spieler1 = new Mensch("Merve", 'm');
			zufallsspieler1 = new Zufallsspieler("Zufallsspieler", 'z');
			int eingabeBeginner = eingabe.nextInt();

			if (eingabeBeginner == 1) {
				mVSr(spieler1, zufallsspieler1);
			} else {
				mVSr2(zufallsspieler1, spieler1);
			}
			
			// if input is 3, computer against computer
			// condition who is allowed to start playing
		} else if (wahl == 3) {
			zufallsspieler1 = new Zufallsspieler("Zufallsspieler 1", 'z');
			zufallsspieler2 = new Zufallsspieler("Zufallsspieler 2", 'y');
			int eingabeBeginner = eingabe.nextInt();
			if (eingabeBeginner == 1) {
				rVSr(zufallsspieler1, zufallsspieler2);
			} else {
				rVSr(zufallsspieler2, zufallsspieler1);
			}
		}
		eingabe.close();
	}
	
	// method which prints Spielfeld and checks winning conditions
	private static void mVSm(Spieler zufallsspieler2, Spieler zufallsspieler1) throws InterruptedException {
		Spielfeld spielfeld = new Spielfeld();
		Scanner sc = new Scanner(System.in);
		Thread t1 = Thread.currentThread();
		while(true) {
			spielfeld.ausgabe();
			t1.sleep(250);
			spielfeld.setzen(zufallsspieler1, sc.nextInt());
			if(spielfeld.ende() || spielfeld.winSpalte() || spielfeld.winZeile() || spielfeld.winDiagonale()) {
				System.out.println("Herzlichen Glückwunsch!\nSpieler 1, du hast gewonnen!");
				break;
			}
			spielfeld.ausgabe();
			t1.sleep(250);
			spielfeld.setzen(zufallsspieler2, sc.nextInt());
			if(spielfeld.ende() || spielfeld.winSpalte() || spielfeld.winZeile() || spielfeld.winDiagonale()) {
				System.out.println("Herzlichen Glückwunsch!\nSpieler 2, du hast gewonnen!");
				break;
			}	
	}
	}
	
	// method which prints Spielfeld and checks winning conditions
	private static void mVSr(Spieler zufallsspieler2, Spieler zufallsspieler1) throws InterruptedException {
		Spielfeld spielfeld = new Spielfeld();
		Scanner sc = new Scanner(System.in);
		while(true) {
			spielfeld.ausgabe();
			spielfeld.setzen(zufallsspieler1, sc.nextInt());
			if(spielfeld.ende() || spielfeld.winSpalte() || spielfeld.winZeile() || spielfeld.winDiagonale()) {
				System.out.println("Herzlichen Glückwunsch!\nSpieler 1, du hast gewonnen!");
				break;
			}
			spielfeld.ausgabe();
			spielfeld.setzen(zufallsspieler2, (int)(Math.random()*6));
			if(spielfeld.ende() || spielfeld.winSpalte() || spielfeld.winZeile() || spielfeld.winDiagonale()) {
				System.out.println("Herzlichen Glückwunsch!\nSpieler 2, du hast gewonnen!");
				break;
			}	
	}
	}
	
	// method which prints Spielfeld and checks winning conditions
	private static void mVSr2(Spieler zufallsspieler2, Spieler zufallsspieler1) throws InterruptedException {
		Spielfeld spielfeld = new Spielfeld();
		Scanner sc = new Scanner(System.in);
		while(true) {
			spielfeld.ausgabe();
			spielfeld.setzen(zufallsspieler2, (int)(Math.random()*6));
			if(spielfeld.ende() || spielfeld.winSpalte() || spielfeld.winZeile() || spielfeld.winDiagonale()) {
				System.out.println("Herzlichen Glückwunsch!\nSpieler 2, du hast gewonnen!");
				break;
			}	
			
			spielfeld.ausgabe();
			spielfeld.setzen(zufallsspieler1, sc.nextInt());
			if(spielfeld.ende() || spielfeld.winSpalte() || spielfeld.winZeile() || spielfeld.winDiagonale()) {
				System.out.println("Herzlichen Glückwunsch!\nSpieler 1, du hast gewonnen!");
				break;
			}
	}
	}
	
	//method which prints Spielfeld and checks winning conditions
	private static void rVSr(Spieler zufallsspieler2, Spieler zufallsspieler1) throws InterruptedException {
		Spielfeld spielfeld = new Spielfeld();
		Thread t1 = Thread.currentThread();
		while(true) {
			spielfeld.ausgabe();
			t1.sleep(250);
			spielfeld.setzen(zufallsspieler1, (int)(Math.random()*6));
			if(spielfeld.ende() || spielfeld.winSpalte() || spielfeld.winZeile() || spielfeld.winDiagonale()) {
				System.out.println("Herzlichen Glückwunsch!\nSpieler 1, du hast gewonnen!");
				break;
			}
			spielfeld.ausgabe();
			t1.sleep(250);
			spielfeld.setzen(zufallsspieler2, (int)(Math.random()*6));
			if(spielfeld.ende() || spielfeld.winSpalte() || spielfeld.winZeile() || spielfeld.winDiagonale()) {
				System.out.println("Herzlichen Glückwunsch!\nSpieler 2, du hast gewonnen!");
				break;
			}	
	}
	}
}