package Oefening_4_7;

import java.util.ArrayList;

import Oefening_4_1.Product;

public class App{
	public static void main(String[] args) {
		Huisdier hond = new Hond("Rex");
		Huisdier kat = new Kat("Snowy");
		Huisdier hamster = new Hamster("Pluisje");
		
		ArrayList<Huisdier> dier = new ArrayList<Huisdier>();
		dier.add(hond);
		dier.add(kat);
		dier.add(hamster);
		
		Dierenwinkel winkel = new Dierenwinkel(dier);
		
		winkel.printOverzicht();
		for(Huisdier dieren : dier) {
			System.out.print("Naam dier " + dieren.getNaam() + " maakt geluid ");
			dieren.maakGeluid();
			System.out.print("\r");
		}
	}

}
