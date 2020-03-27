package Oefening_4_5;

public class App extends Huisdier{


	App(String naam) {
		super(naam);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Hond hond = new Hond("Rex");
		Huisdier dier = hond;

		Kat kat = new Kat("Felix");
		Huisdier dier2 = kat;
		
		Hamster hamster = new Hamster("Fluffy");
		Huisdier dier3 = hamster;
		
		
		System.out.print("Naam Hond: " + dier.getNaam() + " Geluid: ");
		hond.maakGeluid();
		System.out.print(" ");
		hond.Kwispel();
		
		System.out.print("\rNaam Kat: " + dier2.getNaam() + " Geluid: "  );
		kat.maakGeluid();
		System.out.print(" ");
		kat.Spin();
		
		System.out.print("\rNaam Hamster: " + dier3.getNaam() + " Geluid: " );
		hamster.maakGeluid();
		
	}

	

}
