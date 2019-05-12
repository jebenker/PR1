package Arche;

import Tiere.Reptil;
import Tiere.Tier;
import Tiere.Saeuger;
import Tiere.Vogel;


/**
 * 
 * Arche die unterschiedliche St�lle hat 
 */
public class Arche {
	public Stall<Saeuger> saugetierStall = new Stall<>(); // Stall für Säugetiere
	public Stall<Reptil> reptilienStall = new Stall<>(); // Stall für Reptilien
	public Stall<Vogel> vogelStall = new Stall<>(); // Stall für Vögel

	public boolean add(Tier animal) {
		if (animal instanceof Saeuger) // prüfe ob das Tier ein Säugetier ist
			return saugetierStall.add((Saeuger) animal); // Tier zu einem Saueger casten und dem Säugetierstall
															// hinzufügen
		if (animal instanceof Reptil) // prüfe ob das Tier ein Reptil ist
			return reptilienStall.add((Reptil) animal); // Tier zu einem Reptil casten und dem Reptilienstall hinzufügen
		if (animal instanceof Vogel) // prüfe ob das Tier ein Vogel ist
			return vogelStall.add((Vogel) animal); // Tier zu einem Vogel casten und dem Vogelstall hinzufügen
		return false;
	}

	public void printStallBelegung() {
	
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.println("Saugetier-Stall: \n" + saugetierStall.toString() 
				+ "\n -------------------------------------------------------------------------------");
		System.out.println("Reptilien-Stall: \n" + reptilienStall.toString()
				+ "\n -------------------------------------------------------------------------------");
		System.out.println("Vogel-Stall: \n" + vogelStall.toString()
				+ "\n -------------------------------------------------------------------------------");
		}
	}