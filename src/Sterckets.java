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
	private int maxHp;
	
	//methode 
	public Sterckets(String name){
		int points;
		points = points();
		this.name = name;
		this.pv = Main.randInt(1, points-2);
		this.maxHp = pv;
		this.att = Main.randInt(1,(points - pv - 1));
		this.def = points - pv - att;
		this.rang = Main.randInt(1,3);
		this.element = elem();
		
	}
	
	//methodes
	public void attaque(Sterckets versus)
	{
		if(this.element.equals("Feu") && versus.element.equals("Air"))
		{
			this.att = this.att * 2;
		}
		if(this.element.equals("Air") && versus.element.equals("Terre"))
		{
			this.att = this.att * 2;
		}
		if(this.element.equals("Terre") && versus.element.equals("Eau"))
		{
			this.att = this.att * 2;
		}
		if(this.element.equals("Eau") && versus.element.equals("Feu"))
		{
			this.att = this.att * 2;
		}
		int damagedone = this.att - versus.def;
			if (damagedone < 0)
			{
				damagedone = 0;
			}
		++this.att;
			if (this.att > 100)
			{
				this.att = 100;
			}
		++versus.def;	
			if (versus.def > 100)
			{
				versus.def = 100;
			}
		versus.pv = versus.pv - damagedone;
			if (versus.pv < 0)
			{
				versus.pv = 0;
				return;
			}

		// contre-attaque
		if (versus.pv > 0)
		{
			if(versus.element.equals("Feu") && this.element.equals("Air"))
		{
			versus.att = versus.att * 2;
		}
			if(versus.element.equals("Air") && this.element.equals("Terre"))
		{
			versus.att = versus.att * 2;
		}
			if(versus.element.equals("Terre") && this.element.equals("Eau"))
		{
			versus.att = versus.att * 2;
		}
			if(versus.element.equals("Eau") && this.element.equals("Feu"))
		{
			versus.att = versus.att * 2;
		}
		int damagedone1 = versus.att - this.def;
			if (damagedone1 < 0)
			{
				damagedone1 = 0;
			}
		++versus.att;
			if (versus.att > 100)
			{
				versus.att = 100;
			}
		++this.def;	
			if (this.def > 100)
			{
				this.def = 100;
			}
		this.pv = this.pv - damagedone1;
			if (this.pv < 0)
			{
				this.pv = 0;
				return;
			}


		}
			
		
	}

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
		System.out.println(name + "(" + element + ")" );
		System.out.println("rang :" + rang);
		System.out.println("pv max :"+ maxHp);
		System.out.println("Attaque :"+att);
		System.out.println("Défense : "+def);
		System.out.println("Point de vie :"+ pv);
		System.out.println("-----------------------");

	}

	public String description()
	{
		return name + "(" + element + ")" + " rang " + rang + " " + pv + " pv";
	}
	

}

