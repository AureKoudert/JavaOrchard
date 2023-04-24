package orchard.application;

import java.util.ArrayList;

public class OrchardApplicationConsole {
	private static int roundNb = 0;
	public static void main(String[] args) {
		
	
		System.out.println("Round : "+roundNb);
		System.out.println("");
		
		ArrayList<Tree> treeList = new ArrayList<Tree>();
		
		treeList.add(new Tree("appleTree","green","apple",10));
		treeList.add(new Tree("cherryTree","red","cherry",10));
		treeList.add(new Tree("pearTree","yellow","pear",10));
		treeList.add(new Tree("plumTree","plum","plum",10));
		
		System.out.println("Les arbres ainsi que leur nombre de fruits sont :");
		for (Tree i : treeList) {
			System.out.println(i.getTreeName() + " : " + i.getFruitNb() + " " + i.getFruitName() + "(s)");
		}
		
		/*for ( int i = 0 ; i < 1 ; i++) {
			Dice dice = new Dice();
			System.out.println(dice.roll());
		}*/
		

		
		

	}
	


}
