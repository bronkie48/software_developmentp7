package Oefening_4_6;

import java.util.ArrayList;


public class Dierenwinkel extends Huisdier {
	private ArrayList<Huisdier> dier;
	
	public void voegToe(ArrayList<Huisdier> dieren) {
		this.dier = dieren;
	}
	public void printOverzicht() {
		System.out.println("Dierenlijst: ");
	}
}
