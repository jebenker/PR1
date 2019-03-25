
public class Spielfeld {
	String[][] spielfeld = new String[7][6];

	public Spielfeld() {

		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[0].length; j++) {
				spielfeld[i][j] = " ";
			}
		}
	}

	public String ausgabe() {

		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[0].length; j++) {
				System.out.print("[" + spielfeld[i][j] + "]");
			}

			System.out.println();
		}
		System.out.println("\n");

		return spielfeld + " ";

	}
	
}