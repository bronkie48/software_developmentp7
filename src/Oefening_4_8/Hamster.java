package Oefening_4_8;

public class Hamster extends Huisdier implements Graver,Klimmer {
	Hamster(String naam){
		super(naam);
	}
	public void maakGeluid(){
		System.out.println("Geluid: Ghehehe");
	}
	public void Graven() {
		System.out.println("graven");
	}
	public void Klimmen() {
		System.out.println("klimmen");
	}
}
