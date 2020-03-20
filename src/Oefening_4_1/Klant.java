package Oefening_4_1;

public class Klant extends Bestelling {
	private String naam;
	private int nummer;
	
	public Klant(String naam) {
		this.naam= naam;
	}
	public String getNaam() {
		return naam;
	}
	public int getNummer() {
		return nummer;
	}
}
