package Oefening_4_1;

import java.util.ArrayList;


public class Bestelling  
{
	private int bestelNummer;
	private ArrayList<Product> productlijst;
	
	public Bestelling(int bestelnr, ArrayList<Product> list) {
		this.bestelNummer=bestelnr;
		this.productlijst=list;
	}
	public int getBestelnummer() 
	{
		return bestelNummer;
	}
	public ArrayList<Product> getProductlijst() {
		return productlijst;
	}
	public void setProductlijst(ArrayList<Product> productlijst) {
		this.productlijst = productlijst;
	}
}
