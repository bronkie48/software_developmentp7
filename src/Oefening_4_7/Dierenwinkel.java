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
		System.out.println("Dierenlijst: \r");
		for( Huisdier huisdier : dier) {
			
			if (huisdier instanceof Hamster) 
			{
				System.out.print("Hamster: ");
				System.out.print(huisdier.getNaam() + "\r");
				((Hamster) huisdier).maakGeluid();
				
				System.out.print("Eigenschappen: \r");
				
				System.out.print("\r");
			}
			if (huisdier instanceof Hond) 
			{
				System.out.print("Hond: ");
				System.out.print(huisdier.getNaam() + "\r");
				((Hond) huisdier).maakGeluid();
				
				System.out.print("Eigenschappen: \r");
				((Hond) huisdier).Kwispel();
				
				System.out.print("\r");
			}
			if (huisdier instanceof Kat) 
			{
				System.out.print("Kat: ");
				System.out.print(huisdier.getNaam() + "\r");
				((Kat) huisdier).maakGeluid();
				
				System.out.print("Eigenschappen: \r");
				((Kat) huisdier).Spin();
				
				System.out.print("\r");
			}
		}
	}
}
