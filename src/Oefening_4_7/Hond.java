package Oefening_4_7;

public class Hond extends Huisdier{
	public Hond(String naam) {
		super(naam);
	}
	
	public void maakGeluid(){
		System.out.print("Woof");
	}
	public void Kwispel() {
		System.out.print("en de hond kwispelt");
	}
	public String toString() {
		String s =  "Hond naam: " + getNaam() + " maakt geluid ";
		return s;
	}
}
