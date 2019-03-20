import java.util.Scanner;
import java.util.Scanner.*;

public class PCMensch extends Spielfeld {

	public String setzenZufallsspieler() {

		int zufallsspieler = (int) (Math.random() * 6);

		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld.length; j++) {
				if (spielfeld[i][j] == "besetzt") {
					j++;
					spielfeld[i][j] = "besetzt";
				} else {
					do {
						switch (zufallsspieler) {
						case 1:
							spielfeld[i][j] = "besetzt";
							break;
						case 2:
							spielfeld[i][j] = "besetzt";
							break;
						case 3:
							spielfeld[i][j] = "besetzt";
							break;
						case 4:
							spielfeld[i][j] = "besetzt";
							break;
						case 5:
							spielfeld[i][j] = "besetzt";
							break;
						case 6:
							spielfeld[i][j] = "besetzt";
							break;
						}
					} while (spielfeld[i][j] == "frei");
				}
			}
		}
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld.length; j++) {
				if (spielfeld[i][j] == "frei") {
					System.out.print("[ ] ");
				} else if (spielfeld[i][j] == "besetzt") {
					System.out.print("[1] ");
				}
			}
		}
		return spielfeld + " ";
	}

	public String setzenSpieler() {
		String spieler;
		Scanner spielzug = new Scanner(System.in);
		int spielzug1 = new Int();
		spielzug1 = spielzug.nextInt();
		
		return spielfeld + " ";
	}
}
