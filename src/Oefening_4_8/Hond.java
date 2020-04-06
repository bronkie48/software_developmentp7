package Oefening_4_8;

public class Hond extends Huisdier implements Graver{
	public Hond(String naam) {
		super(naam);
	}
	public void maakGeluid(){
		System.out.println("Geluid: Woof");
	}
	public void Kwispel() {
		System.out.println("kwispelen");
	}
	public void Graven() {
		System.out.println("graven");
	}
}
