package Oefening_4_7;

import java.util.ArrayList;

import Oefening_4_1.Product;

public class App{
	public static void main(String[] args) {
		
		ArrayList<Huisdier> dier = new ArrayList<Huisdier>();
		dier.add(new Hond("Rex"));
		dier.add(new Kat("Snowy"));
		dier.add(new Hamster("Pluisje"));
		
		Dierenwinkel winkel = new Dierenwinkel(dier);
		
		winkel.printOverzicht();
	}

}
