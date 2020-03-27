package Oefening_4_5;

public class Huisdier {
	String naam;
	
	Huisdier(String naam){
		this.naam=naam;
	}
	public String getNaam() {
		return naam;
	}
	public void maakGeluid() {
		System.out.print("Een dier maakt geluid");
	}
}
