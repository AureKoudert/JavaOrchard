package orchard.application;

public class Tree {
	private final String treeName;
	private final String color;
	private final String fruitName;
	private int fruitNb;
	
	//constructeur permettant de créer un arbre composé d'un nom, d'une couleur, d'un nombre de fruit et d'un nom de fruit
	public Tree(String treeName,String color, String fruitName, int fruitNb) {
		this.treeName = treeName;
		this.color = color;
		this.fruitName = fruitName;
		this.fruitNb = fruitNb;
	}
	
	//fonction permettant de renvoyer le nom d'un arbre
	public String getTreeName() {
		return this.treeName;
	}
	
	//fonction permettant de renvoyer la couleur d'un arbre
	public String getColor() {
		return this.color;
	}
	
	//fonction permettant de renvoyer le nombre de fruit d'un arbre
	public int getFruitNb() {
		return this.fruitNb;
	}
	
	//fonction permettant de renvoyer le nom d'un fruit
	public String getFruitName() {
		return this.fruitName;
	}
	
	//fonction permettant de retirer un fruit à l'arbre s'il n'est pas vide
	public void removeFruit() {
		if (this.fruitNb > 0) {
		 this.fruitNb  = this.fruitNb -1;
		}
	}
	
	

}
