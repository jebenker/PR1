package Arche;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import Tiere.Tier;
import Tiere.TierPaar;

//Generischer Stall f�r Tiere
public class Stall<T extends Tier> extends LinkedList<T> {
	public boolean add(T e) {
		Iterator<T> ite = super.iterator();
		while (ite.hasNext()) {
			T tier = ite.next();
			if (tier.getTierart().equals(e.getTierart())) {
				if (tier.getGeschlecht() == e.getGeschlecht()) {
					return false;

				}
				if (ite.hasNext()) {
					if (ite.next().getTierart().equals(e.getTierart())) {
						return false;
					}
				}
				super.add(e);
				return true;

			}

		}

		super.addLast(e);
		return true;

	}
	
	

	public String toString() {
		String temp = "";
		Iterator<T> it = super.iterator();
		while (it.hasNext()) {
			T tier = it.next();
			temp += tier.getTierart() + " " + tier.getGeschlecht() + " | ";
		}
		return temp;

	}

	/*
	 * //Verwende Tierpaare, damit Tiere der gleichen Art zusammen sind //Map mit
	 * Key Tierart public Map<String, TierPaar<T>> stallPlaetze = new HashMap<>();
	 * 
	 * //f�gt ein Tier dem Stall hinzu public boolean add(T e) {
	 * if(stallPlaetze.containsKey(e.getTierart())) //pr�ft ob es schon die Tierart
	 * im Stall gibt return stallPlaetze.get(e.getTierart()).addTier(e); //holt das
	 * Tierpaar und f�gt das Tier hinzu //die Tierart gibt es noch nicht in der Map
	 * -> es wird ein neues Tierpaar angelegt TierPaar<T> tierpaar = new
	 * TierPaar<T>(); tierpaar.addTier(e); stallPlaetze.put(e.getTierart(),
	 * tierpaar); //das neue Tierpaar kommt in die Map return true; }
	 */

	/*
	 * public String toString() { String temp = ""; if (stallPlaetze != null) {
	 * for(String key: stallPlaetze.keySet()) { temp = key + " |  " + temp; } return
	 * temp; } return null;
	 * 
	 */
}