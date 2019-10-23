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
		System.out.println(jeanjean.description());
	}
		
		
		

	

}
