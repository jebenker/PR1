package Arche;

import java.util.LinkedList;

import Tiere.Reptil;
import Tiere.Tier;
import Tiere.Tiergenerator;
import Tiere.Vogel;

public class Queue extends LinkedList<Tier> {

	public static void main(String[] args) {
		Queue w = new Queue();
	
		w.addTier(25);
		w.printWarteschlange();
		w.sturm();
		w.printWarteschlange();
		w.grossesFressen();
		w.printWarteschlange();
	}
	
	public static Queue getBefuellteWarteschlange() {
		Queue warteschlange = new Queue(); //Erstelle Warteschlange
		warteschlange.addTier(25); 
		warteschlange.printWarteschlange();
		warteschlange.sturm();
		warteschlange.printWarteschlange();
		warteschlange.grossesFressen();
		warteschlange.printWarteschlange();
		return warteschlange; //gebe bef�llte Warteschlange zur�ck
		
		
	}
	public static Queue getBefuellteWarteschlange2() {
		Queue warteschlange = new Queue(); //Erstelle Warteschlange
		warteschlange.addTier(25); 
		warteschlange.printWarteschlange();
	
		
		return warteschlange; //gebe bef�llte Warteschlange zur�ck
	}
	private void addTier(int j) {

		for (int i = 0; i < j; i++) {
			add((Tiergenerator.getTier()));
			// add() f�gt ein Element vom Typ Tier das er aus dem Tiergenerator bekommt der
			// Warteschlange hinzu
		}
	}
	private void printWarteschlange() {

		for (int i = 0; i < size(); i++) {

			System.out.print(get(i).getTierart() + " " + get(i).getGeschlecht() + " | " );

		}
		System.out.println();

		// printfunktion die das Objekt der Stelle i jeweils Tierart und Geschlecht
		// ausgibt
	}

	public int sturm() {

		int Anzahl = 0; // counter f�r die gel�schten V�gel

		for (int i = 0; i < size(); i++) {
			if (get(i).getClass().getSimpleName().equals("Vogel")) {// pr�ft ob das objekt vom Typ Vogel ist
				
				remove(i);// entfert das objekt an der Stelle i
				i = i - 1;
				Anzahl++;
			}
			
		
		}
		return Anzahl; // gibt die Anzahl der gel�schten V�gel zur�ck
	}
	public int grossesFressen() {

		int Anzahl = 0; // Counter f�r gefressene Tiere

		for (int i = 0; i < size() - 1; i++) {

			if (get(i).getRaubtier() == true) { // falls es ein Raubtier ist

				if (get(i + 1).getClass().getSimpleName().equals("Reptil")) {

					if (get(i + 1).getRaubtier() == false && ((Reptil) get(i + 1)).getGiftig() == false) {
						// abfrage ob das n�chste tier nicht gifig und kein Raubtier ist
						// die abfrage ob das Tier giftig ist kann nur an Objketen vom Typ Reptil
						// angewendet werden, deshalb fragen wir
						// eins vorher ab ob es vom Typ reptil ist,
						remove(i + 1); // l�scht
						Anzahl++;
					}
				} else if (get(i + 1).getRaubtier() == false) {// falls das n�chte tier kein reptil ist schaut man nur
																// ob es sich um ein Raubtier handelt
					remove(i + 1);// l�scht
					Anzahl++;
				}

			}
		}

		return Anzahl; // gibt die Anzahl der gefressenen Tiere zur�ck

	}
}