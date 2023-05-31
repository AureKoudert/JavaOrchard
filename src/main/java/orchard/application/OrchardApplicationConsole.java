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
import orchard.application.controller.AppleController;
import orchard.application.controller.CherryController;
import orchard.application.controller.DiceController;
import orchard.application.controller.PearController;
import orchard.application.controller.PlumController;
import orchard.application.view.BasketView;
import orchard.application.view.CrowView;
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
		BasketView basketView = new BasketView();
		GameView gameView = new GameView();
		UIView uiView = new UIView();
		
		//appel de la fonction permettant de placer les arbres sur la gridPane root
        GameView.treePlacing(root);
	  
        //appel de la fonction permettant de placer les paniers sur la gridPane root
		basketView.basketPlacing(root);
		
		//Création de VBox avec appel de la fonction vBoxCreation
		VBox vBoxTopLeft = GameView.vBoxCreation(root, 0, 0);
		VBox vBoxTopRight = GameView.vBoxCreation(root, 2, 0);
		VBox vBoxBotLeft = GameView.vBoxCreation(root, 0, 2);
		VBox vBoxBotRight = GameView.vBoxCreation(root, 2, 2);
		
		//appel de la fonction fruitListCreation permettant de créer une liste d'image
	    treeView.fruitListCreation();
	    
	    

	    //appel de la fonction setFruitsStructure pour placer une liste d'image sur une VBox précise
	    TreeView.setFruitStructure(vBoxTopLeft, treeView.getListAppleImg());
	    TreeView.setFruitStructure(vBoxTopRight, treeView.getListPearImg());
	    TreeView.setFruitStructure(vBoxBotLeft, treeView.getListPlumImg());
	    TreeView.setFruitStructure(vBoxBotRight, treeView.getListCherryImg());
	    
	    //appel de la fonction placingRollButton permettant de placer le bouton ainsi que les éléments en lien avec celui-ci
	    uiView.placingRollButton(root);
	    //création du bouton buttonRoll 
	    Button buttonRoll = uiView.getButtonRoll();
	    
	    //appel de la fonction createTreeList permettant de créer 4 arbres et de les placer dans une liste
	    game.createTreeList();
	    
	    //création d'une gridPane grâce à l'appel de la fonction crowPuzzleCreation
	    GridPane crowPuzzle = CrowView.crowPuzzleCreation(root);
	    
	    //ajout de l'évènement de la classe DiceController sur le bouton buttonRoll
	    buttonRoll.addEventFilter(MouseEvent.MOUSE_PRESSED, new DiceController(game, treeView, uiView, basketView, gameView, crowPuzzle, primaryStage, root));
	   	
	    //ajout des évènements correspondant aux fruits à la liste de fruit
	    uiView.getListFruitImg().get(0).addEventFilter(MouseEvent.MOUSE_PRESSED, new AppleController(game, treeView, basketView));
	    uiView.getListFruitImg().get(2).addEventFilter(MouseEvent.MOUSE_PRESSED, new PearController(game, treeView, basketView));
	    uiView.getListFruitImg().get(3).addEventFilter(MouseEvent.MOUSE_PRESSED, new PlumController(game, treeView, basketView));
	    uiView.getListFruitImg().get(1).addEventFilter(MouseEvent.MOUSE_PRESSED, new CherryController(game, treeView, basketView));
	    
		//création d'une image de background avec redimension et paramètre pour la centrer sur l'image
	    BackgroundImage backgroundImage = new BackgroundImage(new Image("background/4couleur.jpg"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(900, 900, false, false, false, false));
	    
	    //création d'une background avec l'image de fond créée précédemment
	    Background background = new Background(backgroundImage);
	    
	    //ajout du background sur la gridPane de base
	    root.setBackground(background);
	    
	    //création de la scene à partir de la gridPane de base avec des dimensions données
	    Scene scene = new Scene(root, 900, 1000);
	    
	   
		//ajout d'un titre à la fenetre
		primaryStage.setTitle("Orchard");
		//ajout de la scene sur la fenetre
		primaryStage.setScene(scene);
		//permet de bloquer les dimensions de la fenetre
		primaryStage.setResizable(false);
	
		//permet d'aficher la fenetre
		primaryStage.show();
	}
	
	
	
	
	
	
	
	
		

}

