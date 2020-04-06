package Oefening_4_7;

import java.util.ArrayList;


public class Dierenwinkel  {
	private ArrayList<Huisdier> dier;
	
	Dierenwinkel(ArrayList<Huisdier> dier){
		this.dier=dier;
	}
	public ArrayList<Huisdier> getDier() {
		return dier;
	}
	public void setDier(ArrayList<Huisdier> dier) {
		this.dier = dier;
	}
	public void voegToe(ArrayList<Huisdier> dieren) {
		this.dier = dieren;
	}
	public void printOverzicht() {
		System.out.println("Dierenlijst array: " + dier);
		System.out.println("\rDierenlijst: ");
	}
}
