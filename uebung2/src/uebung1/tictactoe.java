package uebung1;

import java.util.Scanner;

public class tictactoe {

	public static void main(String[] args) {
		System.out.println("Willkommen zu Tic Tac Toe!");
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Wo möchten Sie ihr Kreuz setzen? Geben Sie ihre Position ein.\nDie erste Zahl gibt die Reihe an (beginnend mit 0) und die zweite Zahl die Spalte (beginnend mit 0)\n(zB Für das erste Kästchen in der ersten Reihe geben Sie ein: 00 und für das 3.Kästchen in der 2. Reihe: 12)");
		String s = new String();
		s = sc.next();
		int[][] h = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
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

		System.out.println(h);
		for (int i = 0; i < 3; i++) {
			System.out.print("\n");
			for (int j = 0; j < 3; j++) {
				if (h[i][j] == 0) {
					System.out.print("[ ] ");
				} else {
					System.out.print("[X] ");
				}
			}
		}

	
	}
	}
/*
	int zahl00;
	int zahl01;
	int zahl02;
	int zahl10;
	int zahl11;
	int zahl12;
	int zahl20;
	int zahl21;
	int zahl22;zahl00=(int)(Math.random()*2);zahl01=(int)(Math.random()*2);zahl02=(int)(Math.random()*2);zahl10=(int)(Math.random()*2);zahl11=(int)(Math.random()*2);zahl12=(int)(Math.random()*2);zahl20=(int)(Math.random()*2);zahl21=(int)(Math.random()*2);zahl22=(int)(Math.random()*2);if(zahl00==1)
	{
		System.out.print("X");
	}

	int[][] h = { { zahl00, zahl01, zahl02 }, { zahl10, zahl11, zahl12 }, { zahl20, zahl21, zahl22 } };for(
	int j = 0;j<3;j++)
	{
		for (int i = 0; i < 3; i++) {
			if (h[j][i] == 0) {
				System.out.print("[ ] ");
			} else {
				System.out.print("[O] ");
			}
		}
	}System.out.println("["+h[0][0]+"]"+" "+"["+h[0][1]+"]"+" "+"["+h[0][2]+"]");System.out.println("["+h[1][0]+"]"+" "+"["+h[1][1]+"]"+" "+"["+h[1][2]+"]");System.out.println("["+h[2][0]+"]"+" "+"["+h[2][1]+"]"+" "+"["+h[2][2]+"]");
}}}

*/

