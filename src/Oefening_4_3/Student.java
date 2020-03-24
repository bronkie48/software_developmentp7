package Oefening_4_3;

public class Student {
	private String naam;
	private int nr;
	private Datum gebdatum;
	private Studieprogramma programma;
	
	public Student(String naam, int nr, Datum gebdatum, Studieprogramma programma)
	{
		this.naam=naam;
		this.nr = nr;
		this.gebdatum=gebdatum;
		this.programma =programma;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	
}
