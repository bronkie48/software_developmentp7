package Oefening_4_2;

import java.util.ArrayList;


public class Product 
{
	private String omschrijving;
	private double prijs;
	private ArrayList<Product> productenlijst;
	
	public Product(String om, double prijs) {
		this.omschrijving=om;
		this.prijs=prijs;
	}
	
	public String getOmschrijving() {
		return omschrijving;
	}
	public double getPrijs() {
		return prijs;
	}
	public ArrayList<Product> getProductenlijst() {
		return productenlijst;
	}
	public String toString() {
		return omschrijving + " " + prijs;
	}
}
