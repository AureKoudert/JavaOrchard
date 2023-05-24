package orchard.application;

import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;



public class Game {
	
	private ArrayList<Tree> treeList = new ArrayList<Tree>();
	private ArrayList<Basket> basketList = new ArrayList<Basket>();
	


	public void createTreeList() {
		this.treeList.add(new Tree("appleTree","green","apple",10));
		this.treeList.add(new Tree("cherryTree","red","cherry",10));
		this.treeList.add(new Tree("pearTree","yellow","pear",10));
		this.treeList.add(new Tree("plumTree","blue","plum",10));
	}
	
	public void createBasketList() {
		this.basketList.add(new Basket(0, "green"));
		this.basketList.add(new Basket(0, "red"));
		this.basketList.add(new Basket(0, "yellow"));
		this.basketList.add(new Basket(0, "blue"));
	}
	


	public ArrayList<Tree> getTreeList() {
		return this.treeList;
	}

	public ArrayList<Basket> getBasketList() {
		return this.basketList;
	}
	
	
	
	
	
	
	
	
	
	
	
}
