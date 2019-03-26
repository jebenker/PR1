import java.util.Scanner;

public class Spielfeld {
	
	// Spielfeld array, 2 dimensional
	char[][] spielfeld = new char[6][7];

	// empty Spielfeld
	public Spielfeld() {
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				spielfeld[i][j] = ' ';
			}
		}
	}
	
	// prints Spielfeld
	public void ausgabe() {
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				System.out.print("[" + spielfeld[i][j] + "]");
			}

			System.out.println();
		}
		System.out.println("\n");
	}
	
	// method to print currents status of game
	public void setzen(Spieler x, int position) {
		try {
			if(position <  0 || position > 6) {
				// exception of width
				throw new Exception(); 
			}
			for (int i = 5; i >= 0; i--) { // array höhe 6 deswegen fängt es bei 5 an
				if (spielfeld[i][position] == ' ') {
					spielfeld[i][position] = x.stein;
					return;
				}
				
			}
			// exception of height
			throw new Exception(); 
		} catch (Exception e) {
			System.out.println("Fehler! Bitte machen Sie erneut eine Eingabe:");
			Scanner sc = new Scanner(System.in);
			int pos = sc.nextInt();
			setzen(x, pos);
			
		}
		
	}

	public boolean ende() {
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				if (spielfeld[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public boolean winSpalte() {
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				if (spielfeld[i][j] != ' ') {
					try {
						if (spielfeld[i][j] == spielfeld[i + 1][j] && spielfeld[i][j] == spielfeld[i + 2][j]
								&& spielfeld[i][j] == spielfeld[i + 3][j]) {
							return true;
						}
						
					} catch (Exception e) {
						
					}
				}
			}

		}
		return false;
	}

	public boolean winZeile() {
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				if (spielfeld[i][j] != ' ') {
					try {
						if (spielfeld[i][j] == spielfeld[i][j + 1] && spielfeld[i][j] == spielfeld[i][j + 2]
								&& spielfeld[i][j] == spielfeld[i][j + 3]) {
							return true;
						}						
					} catch (Exception e) {
					}
				}
			}

		}
		return false;
	}

	public boolean winDiagonale() {
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld.length; j++) {
				if (spielfeld[i][j] != ' ') {
					try {
						if (spielfeld[i][j] == spielfeld[i + 1][j + 1] && spielfeld[i][j] == spielfeld[i + 2][j + 2]
								&& spielfeld[i][j] == spielfeld[i + 3][j + 3]) {
							return true;
						}
					}	
					catch (Exception e) {
					}
					try {
						if (spielfeld[i][j] == spielfeld[i + 1][j - 1] && spielfeld[i][j] == spielfeld[i + 2][j - 2]
								&& spielfeld[i][j] == spielfeld[i + 3][j - 3]) {
							return true;
						}
					} catch (Exception e) {
					}
					try {
						if (spielfeld[i][j] == spielfeld[i - 1][j + 1] && spielfeld[i][j] == spielfeld[i - 2][j + 2]
								&& spielfeld[i][j] == spielfeld[i - 3][j + 3]) {
							return true;
						}
					} catch (Exception e) {
					}
					try {
						if (spielfeld[i][j] == spielfeld[i - 1][j - 1] && spielfeld[i][j] == spielfeld[i - 2][j - 2]
								&& spielfeld[i][j] == spielfeld[i - 3][j - 3]) {
							return true;
						}
					} catch (Exception e) {
					}
				}
			}
		}
		return false;
	}
	
	
}