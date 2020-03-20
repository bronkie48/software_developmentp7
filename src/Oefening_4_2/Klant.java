package Oefening_4_2;

public class Klant extends Bestelling 
{
	private String naam;
	private int nummer;
	
	public Klant(String naam) {
		this.naam= naam;
	}
	
	public String getNaam() 
	{
		naam="kees";
		return naam;
	}
	public int getNummer() 
	{
		nummer=123;
		return nummer;
	}
}

