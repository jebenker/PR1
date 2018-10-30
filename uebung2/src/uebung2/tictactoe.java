package uebung2;

import java.util.Scanner;
import java.util.Random;

public class tictactoe {

	public static void main(String[] args) {
		boolean again = true;
		boolean win = false;
		System.out.println("Willkommen zu Tic Tac Toe!");
		int[][] h = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"\nWo möchten Sie ihren Kreis setzen? Geben Sie ihre Position ein.\nDie erste Zahl gibt die Reihe an (beginnend mit 0) und die zweite Zahl die Spalte (beginnend mit 0)\n(zB Für das erste Kästchen in der ersten Reihe geben Sie ein: 00 und für das 3.Kästchen in der 2. Reihe: 12)");
			String s = new String();
			s = sc.next();
			
			int spielercomp = (int) (Math.random() * 9);
			switch (s) {
			case "00":
				h[0][0] = 1;
				break;
			case "01":
				h[0][1] = 1;
				break;
			case "02":
				h[0][2] = 1;
				break;
			case "10":
				h[1][0] = 1;
				break;
			case "11":
				h[1][1] = 1;
				break;
			case "12":
				h[1][2] = 1;
				break;
			case "20":
				h[2][0] = 1;
				break;
			case "21":
				h[2][1] = 1;
				break;
			case "22":
				h[2][2] = 1;
				break;
			}

			do {
				switch (spielercomp) {
				case 0:
					if (h[0][0] != 0) {
						spielercomp = (int) (Math.random() * 10);
						again = true;
					} else {
						h[0][0] = 2;
						again = false;
					}
					break;
				case 1:
					if (h[0][1] != 0) {
						spielercomp = (int) (Math.random() * 10);
						again = true;
					} else {
						h[0][1] = 2;
						again = false;
					}
					break;
				case 2:
					if (h[0][2] != 0) {
						spielercomp = (int) (Math.random() * 10);
						again = true;
					} else {
						h[0][2] = 2;
						again = false;
					}
					break;
				case 3:
					if (h[1][0] != 0) {
						spielercomp = (int) (Math.random() * 10);
						again = true;
					} else {
						h[1][0] = 2;
						again = false;
					}
					break;
				case 4:
					if (h[1][1] != 0) {
						spielercomp = (int) (Math.random() * 10);
						again = true;
					} else {
						h[1][1] = 2;
						again = false;
					}
					break;
				case 5:
					if (h[1][2] == 1) {
						spielercomp = (int) (Math.random() * 10);
						again = true;
					} else {
						h[1][2] = 2;
						again = false;
					}
					break;
				case 6:
					if (h[2][0] != 0) {
						spielercomp = (int) (Math.random() * 10);
						again = true;
					} else {
						h[2][0] = 2;
						again = false;
					}
					break;
				case 7:
					if (h[2][1] != 0) {
						spielercomp = (int) (Math.random() * 10);
						again = true;
					} else {
						h[2][1] = 2;
						again = false;
					}
					break;
				case 8:
					if (h[2][2] != 0) {
						spielercomp = (int) (Math.random() * 10);
						again = true;
					} else {
						h[2][2] = 2;
						again = false;
					}
					break;
				}
			} while (!again);

			System.out.print(h);
			for (int i = 0; i < 3; i++) {
				System.out.print("\n");
				for (int j = 0; j < 3; j++) {
					if (h[i][j] == 0) {
						System.out.print("[ ] ");
					} else if (h[i][j] == 1) {
						System.out.print("[O] ");
					} else {
						System.out.print("[X] ");
					}
				}
			}

			if (h[0][0] == 1 && h[0][1] == 1 && h[0][2] == 1) {
				System.out.println("\nHerzlichen Glückwunsch! Sie haben gewonnen!");
				win = true;
				again = false;
			} else if (h[2][0] == 1 && h[2][1] == 1 && h[2][2] == 1) {
				System.out.println("\nHerzlichen Glückwunsch! Sie haben gewonnen!");
				win = true;
				again = false;
			} else if (h[1][0] == 1 && h[1][1] == 1 && h[1][2] == 1) {
				System.out.println("\nHerzlichen Glückwunsch! Sie haben gewonnen!");
				win = true;
				again = false;
			} else if (h[0][0] == 1 && h[1][0] == 1 && h[2][0] == 1) {
				System.out.println("\nHerzlichen Glückwunsch! Sie haben gewonnen!");
				win = true;
				again = false;
			} else if (h[0][1] == 1 && h[1][1] == 1 && h[2][1] == 1) {
				System.out.println("\nHerzlichen Glückwunsch! Sie haben gewonnen!");
				win = true;
				again = false;
			} else if (h[0][2] == 1 && h[1][2] == 1 && h[2][2] == 1) {
				System.out.println("\nHerzlichen Glückwunsch! Sie haben gewonnen!");
				win = true;
				again = false;
			} else if (h[0][0] == 1 && h[1][1] == 1 && h[2][2] == 1) {
				System.out.println("\nHerzlichen Glückwunsch! Sie haben gewonnen!");
				win = true;
				again = false;
			} else if (h[0][2] == 1 && h[1][1] == 1 && h[2][0] == 1) {
				System.out.println("\nHerzlichen Glückwunsch! Sie haben gewonnen!");
				win = true;
				again = false;
			} else if (h[0][2] == 1 && h[1][2] == 1 && h[2][2] == 1) {
				System.out.println("\nHerzlichen Glückwunsch! Sie haben gewonnen!");
				win = true;
				again = false;
			}

			if (h[0][0] == 2 && h[0][1] == 2 && h[0][2] == 2) {
				System.out.println("\nOh nein! Sie haben leider gegen den Computer verloren!");
				win = true;
				again = false;
			} else if (h[2][0] == 2 && h[2][1] == 2 && h[2][2] == 2) {
				System.out.println("\nOh nein! Sie haben leider gegen den Computer verloren!");
				win = true;
				again = false;
			} else if (h[1][0] == 2 && h[1][1] == 2 && h[1][2] == 2) {
				System.out.println("\nOh nein! Sie haben leider gegen den Computer verloren!");
				win = true;
				again = false;
			} else if (h[0][0] == 2 && h[1][0] == 2 && h[2][0] == 2) {
				System.out.println("\nOh nein! Sie haben leider gegen den Computer verloren!");
				win = true;
				again = false;
			} else if (h[0][1] == 2 && h[1][1] == 2 && h[2][1] == 2) {
				System.out.println("\nOh nein! Sie haben leider gegen den Computer verloren!");
				win = true;
				again = false;
			} else if (h[0][2] == 2 && h[1][2] == 2 && h[2][2] == 2) {
				System.out.println("\nOh nein! Sie haben leider gegen den Computer verloren!");
				win = true;
				again = false;
			} else if (h[0][0] == 2 && h[1][1] == 2 && h[2][2] == 2) {
				System.out.println("Oh nein! Sie haben leider gegen den Computer verloren!");
				win = true;
				again = false;
			} else if (h[0][2] == 2 && h[1][1] == 2 && h[2][0] == 2) {
				System.out.println("\nOh nein! Sie haben leider gegen den Computer verloren!");
				win = true;
				again = false;
			} else if (h[0][2] == 2 && h[1][2] == 2 && h[2][2] == 2) {
				System.out.println("\nOh nein! Sie haben leider gegen den Computer verloren!");
				win = true;
				again = false;
			}
		} while (!win);

	}
}
