package Arche;

import Tiere.Tier;

public class Main {

	public static void main(String[] args) {
		aufgabe1(); //jeweils ändern wenn aufgabe 1 oder 2 gefragt ist 

	}
	
	public static void aufgabe1() {
		Queue.getBefuellteWarteschlange();
			
		
	}
	public static void aufgabe2() {
		Arche arche = new Arche();
		//hole die Warteschlange und gehe jedes Tier durch
		for(Tier tier : Queue.getBefuellteWarteschlange2())
			arche.add(tier); //füge jedes Tier aus der Warteschlange der Arche hinzu
		
		arche.printStallBelegung(); //Zeige die Stallbelegung an
		
	}

}