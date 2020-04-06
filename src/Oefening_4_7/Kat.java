package Oefening_4_7;

public class Kat extends Huisdier {
	Kat (String naam){
		super(naam);
	}
	public void maakGeluid(){
		System.out.print("Miauw");
	}
	public void Spin() {
		System.out.println("en de kat spint");
	}
	public String toString() {
		String s =  "Kat naam: " + getNaam() + " maakt geluid ";
		return s;
	}
}
