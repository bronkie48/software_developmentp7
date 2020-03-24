package Oefening_4_3;

public class Datum {
	private int dag;
	private int maand;
	private int jaar;
	
	public Datum(int dag, int maand, int jaar) 
	{
		this.dag = dag;
		this.maand = maand;
		this.jaar=jaar;
	}
	public int getDag() {
		return dag;
	}
	
	public int getMaan() {
		return maand;
	}
	
	public int getJaar() {
		return jaar;
	}
	public String toString() {
		return dag + "-" + maand + "-" + jaar;
	}
}
