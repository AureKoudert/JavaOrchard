package orchard.application;
import java.util.Random;

public class Dice {
	Side sideOne = Side.GREEN;
	Side sideTwo = Side.RED;
	Side sideThree = Side.YELLOW;
	Side sideFour = Side.BLUE;
	Side sideFive = Side.CROW;
	Side sideSix = Side.BASKET;
	
	public Side roll() {
		int sideNb = generateInt(1, 7);
		if (sideNb == 1) {
			return sideOne;
		}
		else if(sideNb == 2) {
			return sideTwo;
		}
		else if(sideNb == 3) {
			return sideThree;
		}
		else if(sideNb == 4) {
			return sideFour;
		}		
		else if(sideNb == 5) {
			return sideFive;
		}
		else if(sideNb == 6) {
			return sideSix;
		}
		else {
			System.out.println("Problem");
			return null;
			
		}
	}
	
	public static int generateInt(int borneInf, int borneSup){
		 Random random = new Random();
		 int nb;
		 nb = borneInf+random.nextInt(borneSup-borneInf);
		 return nb;
		}
	
	
	
}
