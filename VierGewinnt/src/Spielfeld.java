
public class Spielfeld {
	String[][] spielfeld = new String[6][7];

	public Spielfeld(String[][] spielfeld) {
		this.spielfeld = spielfeld;
		
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld.length; j++) {
				spielfeld[i][j].equals(" ");
				}
		}
	}

	public String ausgabe() {

		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld.length; j++) {
				System.out.print("[" + spielfeld[i][j] + "]");
			}

			System.out.println();
		}
		System.out.println("\n");

		return spielfeld + " ";
	}

}
