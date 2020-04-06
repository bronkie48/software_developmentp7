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
		
		// In een for loop door de lijst heen gaan en
		// dan de to string van de type classe (hond,hamster en kat) die dan geerft wprdt.
		for(Huisdier dieren : dier) {
			System.out.print(dieren.toString());
			dieren.maakGeluid();
			System.out.print("\r");
		}
	}

}
