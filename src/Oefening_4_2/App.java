package Oefening_4_2;

import java.util.ArrayList;

public class App {
	public static void main (String [] args) {
		Klant k = new Klant("Kees",1);
		
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product("Broodje Hamburger speciaal",2.50));
		list.add(new Product("Friet speciaal",1.75));
		list.add(new Product("Frikandel speciaal",1.75));
		
		Bestelling b  = new Bestelling(1, list);
		
		System.out.println("Klantnaam: " + k.getNaam() + "\rKlantnummer:" 
							+ k.getNummer() + "\r" + b.print() + 
							"producten:\r" + list);
	}
}
