package orchard.application;

import java.util.ArrayList;




public class Game {
	
	private ArrayList<Tree> treeList = new ArrayList<Tree>();
	private ArrayList<Basket> basketList = new ArrayList<Basket>();
	private int counter = 0;
	

	//fonction permettant de créer une liste contenant les 4 arbres, avec leur nom, leur couleur, leur fruit et leur nombre de fruit
	public void createTreeList() {
		this.treeList.add(new Tree("appleTree","green","apple",10));
		this.treeList.add(new Tree("cherryTree","red","cherry",10));
		this.treeList.add(new Tree("pearTree","yellow","pear",10));
		this.treeList.add(new Tree("plumTree","blue","plum",10));
	}
	
	//fonction permettant de créer une liste de panier contenant, leur nombre de fruit ainsi que la couleur de leur fruit
	public void createBasketList() {
		this.basketList.add(new Basket(0, "green"));
		this.basketList.add(new Basket(0, "red"));
		this.basketList.add(new Basket(0, "yellow"));
		this.basketList.add(new Basket(0, "blue"));
	}
	

	//fonction permettant de renvoyer la liste d'arbre
	public ArrayList<Tree> getTreeList() {
		return this.treeList;
	}
	
	//fonction permettant de renvoyer la liste de panier
	public ArrayList<Basket> getBasketList() {
		return this.basketList;
	}
	
	//fonction permettant de renvoyer le compteur
	public int getCounter() {
		return this.counter;
	}
	
	//fonction permettant d'ajouter un au compteur
	public void addOneToCounter() {
		this.counter = this.counter + 1;
	}
	
	//fonction permettant de rénitialiser le compteur
	public void resetCounter() {
		this.counter = 0;
	}
	
	//fonction permettant de mettre le compteur à deux
	public void setCountertoTwo() {
		this.counter = 2;
	}
	
	
	
	
	
	
	
	
	
	
	
}
