package Oefening_4_2;

public class Bestelling  
{
	static int bestelNummer;
	
	public static int Bestelnummer() 
	{
		int bestelNummer = 12;
		return bestelNummer;
	}
	public static int getKlantnummer() 
	{
		Klant k = new Klant();
		int klantNummer = k.getNummer();
		return klantNummer;
	}
	public static String getKlantnaam() 
	{
		Klant k = new Klant();
		String naam = k.getNaam();
		return naam;
	}
	public static String getProductOmschrijving() 
	{
		Product p = new Product();
		String omschrijving = p.toString();
		return omschrijving;
	}
	public static double getProductPrijs() 
	{
		Product p = new Product();
		double prijs= p.getPrijs();
		return prijs;
	}
	
	public static void print() 
	{
		System.out.println("De gegevens van de klant: \r Bestelnummer: " + Bestelnummer()  + "\r Klantnummer: " + getKlantnummer() + "\r Naam: "
							+ getKlantnaam() + "\r Omschrijving: "+ getProductOmschrijving() + 
							"\r Productprijs: " + getProductPrijs()	);
	}
	public static void main( String args[] ) {
		print();
	}
}
