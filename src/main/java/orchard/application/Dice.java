package orchard.application;
import java.util.Random;

public class Dice {
	//attribution des couleurs aux différents côtés
	Side sideOne = Side.GREEN;
	Side sideTwo = Side.RED;
	Side sideThree = Side.YELLOW;
	Side sideFour = Side.BLUE;
	Side sideFive = Side.CROW;
	Side sideSix = Side.BASKET;
	
	//fonction permettant de lancer le dé
	public Side roll() {
		//génère un entier entre 1 et 6
		int sideNb = generateInt(1, 7);
		//renvoie la face sur laquelle on est tombée
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
	
	//fonction permettant de générer un entier aléatoire 
	public static int generateInt(int borneInf, int borneSup){
		 Random random = new Random();
		 int nb;
		 nb = borneInf+random.nextInt(borneSup-borneInf);
		 return nb;
		}
	
	
	
}
