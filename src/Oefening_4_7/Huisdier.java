package Oefening_4_7;

import java.util.ArrayList;


public class Huisdier {
	
	private String naam;
	protected static ArrayList<Huisdier>dier;
	
	Huisdier(String naam){
		this.naam=naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public void setDier(ArrayList<Huisdier> dier) {
		this.dier = dier;
	}
	public ArrayList<Huisdier> getDier() {
		return dier;
	}
	public String getNaam() {
		return naam;
	}
	public void maakGeluid() {
		System.out.print("Een dier maakt geluid");
	}
}
