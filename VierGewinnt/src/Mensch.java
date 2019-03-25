import java.util.Scanner;

public class Mensch extends Spieler {

	// Spielfeld spielfeldMensch = new Spielfeld();

	public String setzen(Spielfeld spielfeld) {
		int spieler;
		int spielzug;
		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie die Spalte ein, in die Sie Ihren Stein setzen wollen.");
		spielzug = sc.nextInt();

/**
		 for (int i = 0; i < spielfeld.spielfeld.length; i++) { 
			 for (int j = 0; j < 6;j++) {
				int k = spielzug - 1;
				spielfeld.spielfeld[7][k];
			 }
		 }
		 
		 
*/	
		
		for (int i = 0; i < spielfeld.spielfeld.length; i++) {
			for (int j = 0; j < spielfeld.spielfeld[0].length; j++) {

				do {
					switch (spielzug) {
					case 1:
						spielfeld.spielfeld[6][0] = "besetzt";
						break;
					case 2:
						spielfeld.spielfeld[6][1] = "besetzt";
						break;
					case 3:
						spielfeld.spielfeld[6][2] = "besetzt";
						break;
					case 4:
						spielfeld.spielfeld[6][3] = "besetzt";
						break;
					case 5:
						spielfeld.spielfeld[6][4] = "besetzt";
						break;
					case 6:
						spielfeld.spielfeld[6][5] = "besetzt";
						break;
					}
				} while (spielfeld.spielfeld[i][j] == "frei");

			}
		}

		for (int i = 0; i < spielfeld.spielfeld.length; i++) {
			for (int j = 0; j < spielfeld.spielfeld[0].length; j++) {
				if (spielfeld.spielfeld[i][j] == "frei") {
					System.out.print("[ ] ");
				} else if (spielfeld.spielfeld[i][j] == "besetzt") {
					System.out.print(spielfeld.spielfeld[i][j] == "[1] ");
				}
			}
		}
		return spielfeld.ausgabe();
	}

}