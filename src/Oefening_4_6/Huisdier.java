package Oefening_4_6;

import java.util.ArrayList;


public class Huisdier {
	private String naam;
	private ArrayList<Huisdier>dier;
	
	public Huisdier() {
	}
	Huisdier(String naam){
		this.naam=naam;
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
