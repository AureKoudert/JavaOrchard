package orchard.application;
import java.util.Random;

public class Dice {
	Side sideOne = Side.GREEN;
	Side sideTwo = Side.RED;
	Side sideThree = Side.YELLOW;
	Side sideFour = Side.BLUE;
	
	public Side roll() {
		int sideNb = genererInt(1, 5);
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
		else {
			System.out.println("ça marche pas");
			return null;
			
		}
	}
	
	int genererInt(int borneInf, int borneSup){
		 Random random = new Random();
		 int nb;
		 nb = borneInf+random.nextInt(borneSup-borneInf);
		 return nb;
		}
}
