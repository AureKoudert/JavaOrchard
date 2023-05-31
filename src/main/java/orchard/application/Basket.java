package orchard.application;

public class Basket {
	
	private int fruitNb;
	private final String color;
	
	//Constructeur permettant de créer un panier avec une couleur donné et un nombre de fruit
	public Basket(int fruitNb, String color) {
		this.fruitNb = fruitNb;
		this.color = color;
	}

}
