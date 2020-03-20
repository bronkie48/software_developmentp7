package Oefening_4_1;

import java.util.ArrayList;


public class Product extends Bestelling
{
	private ArrayList<Product> productenlijst = new ArrayList<Product>();
	private String omschrijving;
	private double prijs;
	
	public Product(Product p1) {
		productenlijst.add(p1);
	}
	
	public double getPrijs() 
	{
		prijs = 1.0;
		return prijs;
	}
	public String toString() 
	{
		omschrijving = "test123";
		return omschrijving;
	}
}
