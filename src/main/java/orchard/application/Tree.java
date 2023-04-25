package orchard.application;

public class Tree {
	private final String treeName;
	private final String color;
	private final String fruitName;
	private int fruitNb;
	
	
	public Tree(String treeName,String color, String fruitName, int fruitNb) {
		this.treeName = treeName;
		this.color = color;
		this.fruitName = fruitName;
		this.fruitNb = fruitNb;
	}
	
	public String getTreeName() {
		return this.treeName;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getFruitNb() {
		return this.fruitNb;
	}
	
	public String getFruitName() {
		return this.fruitName;
	}
	
	public void removeFruit() {
		if (this.fruitNb > 0) {
		 this.fruitNb  = this.fruitNb -1;
		}
	}
	
	

}
