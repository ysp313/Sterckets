import java.util.Random;

public class Main {
	private static Random rand = new Random();

	public static int randInt(int min, int max) {
		int randNum = rand.nextInt((max - min) +1) + min;
		return randNum;
	}
	

	public static void main(String[] args) 
	{

		Sterckets jeanjean = new Sterckets("Jean");
		jeanjean.affiche();

		Sterckets patpat = new Sterckets("Patrick");
		patpat.affiche();

		//premier tour attaque
		jeanjean.attaque(patpat);

		jeanjean.affiche();
		patpat.affiche();
		if (getPV(patpat) == 0)
		{
			return win();
		}
		if (getPV(jeanjean) == 0)
		{
			return loose();
		}

		//deuxieme tour attaque
		jeanjean.attaque(patpat);

		jeanjean.affiche();
		patpat.affiche();

		//troisieme tour attaque
		jeanjean.attaque(patpat);

		jeanjean.affiche();
		patpat.affiche();

		//System.out.println(jeanjean.description());
	}
		
		
		

	

}
