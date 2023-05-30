package orchard.application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import orchard.application.controller.DiceController;
import orchard.application.view.CrowView;
import orchard.application.view.DiceView;
import orchard.application.view.GameView;
import orchard.application.view.TreeView;
import orchard.application.view.UIView;

public class OrchardApplicationConsole extends javafx.application.Application{
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage){
		
		
	
		Game game = new Game();
		
		GridPane root = GameView.gridPaneCreation();      
		TreeView treeView = new TreeView();
		UIView basketView = new UIView();
		GameView gameView = new GameView();
		
		
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
	    GridPane crowPuzzle = CrowView.crowPuzzleCreation(root);
	    
	    buttonRoll.addEventFilter(MouseEvent.MOUSE_PRESSED, new DiceController(game, treeView, diceView, basketView, gameView, crowPuzzle));
	    
	   		
	    
		
	    BackgroundImage backgroundImage = new BackgroundImage(new Image("background/4couleur.jpg"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(900, 900, false, false, false, false));
	    
	    Background background = new Background(backgroundImage);
	    
	   
	    
	    
	    root.setBackground(background);
	    
	    Scene scene = new Scene(root, 900, 1000);
		
		primaryStage.setTitle("Orchard");
		primaryStage.setScene(scene);
		
	
		primaryStage.show();
	}
	
	
	
	
	
	
	
	
		

}

