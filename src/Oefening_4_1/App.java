package Oefening_4_1;

import java.util.ArrayList;

public class App {
	public static void main (String [] args) {
	
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product("Broodje Hamburger speciaal",2.50));
		list.add(new Product("Friet speciaal",1.75));
		list.add(new Product("Frikandel speciaal",1.75));
		
		
		System.out.println("producten" + list);
	}
}
