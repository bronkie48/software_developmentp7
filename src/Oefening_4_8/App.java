package Oefening_4_8;

import java.util.ArrayList;



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
		}
	}


