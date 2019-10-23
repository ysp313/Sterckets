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

	
	//methode 
	public Sterckets(String name){
		int points;
		points = points();
		this.name = name;
		this.pv = Main.randInt(1, points-2);
		this.att = Main.randInt(1,(points - pv - 1));
		this.def = points - pv - att;
		this.rang = Main.randInt(1,3);
		this.element = elem();
		
	}
	
	//methodes
	
	private int points() 
	{
		int pointPerso = Main.randInt(10, 100);
		if(this.rang == 2) 
		{
			pointPerso = ((pointPerso * 10)/100) + pointPerso;
			if (pointPerso > 100)
			{
				pointPerso = 100;
				return pointPerso;
			}
			return pointPerso;
		}
		if(this.rang == 3) 
		{
			pointPerso = ((pointPerso * 20)/100) + pointPerso;
			if (pointPerso > 100)
			{
				pointPerso = 100;
				return pointPerso;
			}
			return pointPerso;
		}
		return pointPerso;
	}

	
	
	private String elem()
	{
		int num = Main.randInt(1,4);

		switch (num)
		{
			case 1 :
				return "Feu";
			case 2 :
				return "Eau";
			case 3 :
				return "Terre";
			case 4 :
				return "Air";
			default :
				return "Should never happen";
		}
		/*if (num == 1)
			{
				return "feu";
			}
		if (num == 2)
		{
			return "Eau";
		}
		if (num == 3)
		{
			return "Terre";
		}
		return "Air";
		*/
	}

	public void affiche()
	{
		System.out.println(name + "(" + element + ")" + " rang " + rang + " " + pv + " pv");
	}

	public String description()
	{
		return name + "(" + element + ")" + " rang " + rang + " " + pv + " pv";
	}
	

}

