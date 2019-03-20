
public class PCPC extends Spielfeld {

	public String setzenSpieler1() {

		int zufallsspieler1 = (int) (Math.random() * 6);

		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld.length; j++) {
				if (spielfeld[i][j] == "besetzt") {
					j++;
					spielfeld[i][j] = "besetzt";
				} else {
					do {
						switch (zufallsspieler1) {
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

	public String setzenSpieler2() {

		// boolean again = "frei";
		int zufallsspieler2 = (int) (Math.random() * 6);

		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld.length; j++) {
				if (spielfeld[i][j] == "besetzt") {
					j++;
					spielfeld[i][j] = "besetzt";
				} else {
					do {
						switch (zufallsspieler2) {
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
					System.out.print("[2] ");
				}
			}
		}

		return spielfeld + " ";
	}
}
