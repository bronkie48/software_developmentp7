package Oefening_4_8;

public class Kat extends Huisdier implements Klimmer{
	Kat (String naam){
		super(naam);
	}
	public void maakGeluid(){
		System.out.println("Geluid: Miauw");
	}
	public void Spin() {
		System.out.println("spinnen");
	}
	public void Klimmen() {
		System.out.println("klimmen");
	}
}
