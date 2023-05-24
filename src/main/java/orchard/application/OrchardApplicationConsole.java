package orchard.application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import orchard.application.controller.DiceController;
import orchard.application.view.BasketView;
import orchard.application.view.DiceView;
import orchard.application.view.GameView;
import orchard.application.view.TreeView;

public class OrchardApplicationConsole extends javafx.application.Application{
	//private static int turnNb = 0;
	public static void main(String[] args) {
		Application.launch(args);
		/*
		ArrayList<Tree> treeList = new ArrayList<Tree>();
		
		treeList.add(new Tree("appleTree","green","apple",10));
		treeList.add(new Tree("cherryTree","red","cherry",10));
		treeList.add(new Tree("pearTree","yellow","pear",10));
		treeList.add(new Tree("plumTree","plum","plum",10));
		
		System.out.println("The different trees aswell as their fruits are :");
		for (Tree i : treeList) {
			System.out.println(i.getTreeName() + " : " + i.getFruitNb() + " " + i.getFruitName() + "(s)");
		}
		
		while ((treeList.get(0).getFruitNb() != 0) || (treeList.get(1).getFruitNb() > 0) || (treeList.get(2).getFruitNb() > 0) || (treeList.get(3).getFruitNb() > 0)) {
			turnNb = turnNb+1;
			
			System.out.println("");
			System.out.println("Turn n°"+turnNb);

			
			Dice dice = new Dice();
			Side side = dice.roll();

			if (side == Side.GREEN) {
				treeList.get(0).removeFruit();
			}
			else if (side == Side.RED) {
				treeList.get(1).removeFruit();
			}
			else if (side == Side.YELLOW) {
				treeList.get(2).removeFruit();
			}
			else if(side == Side.BLUE) {
				treeList.get(3).removeFruit();
			}
			
			System.out.println("Les arbres ainsi que leur nombre de fruits sont :");
			for (Tree i : treeList) {
				System.out.println(i.getTreeName() + " : " + i.getFruitNb() + " " + i.getFruitName() + "(s)");
			}
			
		}
		
		System.out.println("\n\n\n");
		System.out.println("# ~ Game Over ~ #");
		System.out.println("    Turn n°"+turnNb);
		*/
	}
	
	public void start(Stage primaryStage){
	
		Game game = new Game();
		
		GridPane root = GameView.gridPaneCreation();      
		TreeView treeView = new TreeView();
		BasketView basketView = new BasketView();
		
		
		DiceView diceView = new DiceView();
		
		
 
		
        GameView.treePlacing(root);
	  
		basketView.basketPlacing(root);
		
		
		VBox vBoxTopLeft = GameView.vBoxCreation(root, 0, 0);
		VBox vBoxTopRight = GameView.vBoxCreation(root, 2, 0);
		VBox vBoxBotLeft = GameView.vBoxCreation(root, 0, 2);
		VBox vBoxBotRight = GameView.vBoxCreation(root, 2, 2);

	    treeView.fruitListCreation();

	    
	    TreeView.setFruitStructure(vBoxTopLeft, treeView.getListAppleImg());
	    TreeView.setFruitStructure(vBoxTopRight, treeView.getListPearImg());
	    TreeView.setFruitStructure(vBoxBotLeft, treeView.getListPlumImg());
	    TreeView.setFruitStructure(vBoxBotRight, treeView.getListCherryImg());
	    
	    diceView.placingRollButton(root);
	    Button buttonRoll = diceView.getButtonRoll();
	    
	    game.createTreeList();
	    
	    buttonRoll.addEventFilter(MouseEvent.MOUSE_PRESSED, new DiceController(game, treeView, diceView));
		
		Scene scene = new Scene(root, 900, 1000);
		
		
		
		primaryStage.setTitle("Orchard");
		primaryStage.setScene(scene);
		
	
		primaryStage.show();
	}
	
	
	
	
	
	
	
	
		

}

