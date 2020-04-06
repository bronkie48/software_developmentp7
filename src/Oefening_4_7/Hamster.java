package Oefening_4_7;

public class Hamster extends Huisdier {
	Hamster(String naam){
		super(naam);
	}
	public void maakGeluid(){
		System.out.print("Ghehehe");
	}
	public String toString() {
		String s =  "Hamster naam: " + getNaam() + " maakt geluid ";
		return s;
	}
}
