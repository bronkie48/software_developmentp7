package Oefening_4_3;

public class Vak {
	private String omschrijving;

	public Vak (String omschrijving) {
		this.omschrijving = omschrijving;
	}
	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	public String toString(){
		return "Vak: " + omschrijving;
	}
}
