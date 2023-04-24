package orchard.application;

public class Tree {
	private final String treeName;
	private final String color;
	private final String fruitName;
	private int FruitNb;
	
	
	public Tree(String treeName,String color, String fruitName, int FruitNb) {
		this.treeName = treeName;
		this.color = color;
		this.fruitName = fruitName;
		this.FruitNb = FruitNb;
	}
	
	public String getTreeName() {
		return this.treeName;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getFruitNb() {
		return this.FruitNb;
	}
	
	public String getFruitName() {
		return this.fruitName;
	}
	
	

}
