import java.util.Random;

public class Sterckets 
{
	//Attributs
	private String name;
	private int pv;
	private int att;
	private int def;
	private int rang;
	private String element;
	private int points;

	
	//methode 
	public Sterckets(String name){
		this.name = name;
		this.pv = 0;
		this.att = 0;
		this.def = 0;
		this.rang = Main.randInt(1,3);
		this.element = "feu";
		this.points = points();
	}
	
	//methodes
	
	public int points() {
		int pointPerso = Main.randInt(10, 100);
		if(this.rang == 2) {
			return (pointPerso * 10)/100;
		}
		if(this.rang == 3) {
			return (pointPerso * 20)/100;
		}
		return pointPerso;
		
	}
	
	
	

}

