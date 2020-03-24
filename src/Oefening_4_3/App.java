package Oefening_4_3;

import java.util.ArrayList;

public class App {
	public static void main(String [] args) {
		Datum gebdatum = new Datum(19,3,1997);
		Datum start = new Datum(1,9,2020);
		Datum eind = new Datum(7,1,2021);
		
		ArrayList<Vak> list = new ArrayList<Vak>();
		list.add(new Vak("Software Programming"));
		list.add(new Vak("Software Development"));
		list.add(new Vak("Webdevelopment"));
		
		Studieprogramma prog = new Studieprogramma(new Datum(1,1,2020),new Datum(1,1,2021), list);
		
		Student student = new Student("Brian Bronkhorst", 164035 , gebdatum, prog);
	
		
		System.out.println(" Student: " + student.getNaam() + "\r nummer: " + student.getNr() + "\r Geboorte datum: " + gebdatum + "\r Studieprogramma: " + prog);
		System.out.println("\r Startdatum: "+ start + "\r Einddatum: " + eind + "\r Vaklijst " + list);
	}
}
