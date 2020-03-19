package Oefening_4_2;

public class Product extends Bestelling
{
	private String omschrijving;
	private double prijs;
	
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
