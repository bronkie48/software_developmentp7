package Oefening_4_3;

import java.util.ArrayList;

public class Studieprogramma {
	
	private Datum startDatum;
	private Datum eindDatum;
	
	private ArrayList<Vak> vaklijst;
	

	public Studieprogramma (Datum start, Datum eind, ArrayList<Vak> lijst) {
		this.startDatum=start;
		this.eindDatum=eind;
		this.vaklijst=lijst;
	}
	
	public String toString() {
		return "Studieprogramma: ";
	}
	
	public Datum getStartDatum() {
		return startDatum;
	}
	
	public Datum getEindDatum() {
		return eindDatum;
	}

	public ArrayList<Vak> getVaklijst() {
		return vaklijst;
	}
	
}

