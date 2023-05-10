package orchard.application;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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
	
	public void start(Stage primaryStage) throws FileNotFoundException{
		
		Dice dice = new Dice();
		
		GridPane root = new GridPane();
		for (int i = 0 ; i < 3 ; i ++) {
			ColumnConstraints column = new ColumnConstraints(300);
	         root.getColumnConstraints().add(column);
	     }
		
		
		
		for (int i = 0 ; i < 3 ; i ++) {
			RowConstraints row = new RowConstraints(300);
	         root.getRowConstraints().add(row);
	     }
		
		RowConstraints row = new RowConstraints(100);
        root.getRowConstraints().add(row);
        
 
        
        
        
        
        
        
		ImageView imageView1 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\tree_img.png", 300, 300);
		ImageView imageView2 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\tree_img.png", 300, 300);
		ImageView imageView3 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\tree_img.png", 300, 300);
		ImageView imageView4 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\tree_img.png", 300, 300);

		List<ImageView> listAppleImg = new ArrayList<>();
		List<ImageView> listPearImg = new ArrayList<>();
		List<ImageView> listPlumImg = new ArrayList<>();
		List<ImageView> listCherryImg = new ArrayList<>();
		
		for (int i = 0 ; i < 10 ; i ++) {
			listAppleImg.add(imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\apple_img.png", 35, 35));
			listPearImg.add(imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\pear_img.png", 35, 25));
			listPlumImg.add(imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\Plum_img.png", 38, 38));
			listCherryImg.add(imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\cherry_img.png", 35, 35));
		}
		

	    root.add(imageView1, 0, 0);
	    root.add(imageView2, 2, 0);
		root.add(imageView3, 0, 2);		
		root.add(imageView4, 2, 2);	
		
	    
	    VBox vBoxTopLeft = new VBox();
	    vBoxTopLeft.setAlignment(Pos.CENTER);
	    root.add(vBoxTopLeft, 0, 0);
	    
	    VBox vBoxTopRight = new VBox();
	    vBoxTopRight.setAlignment(Pos.CENTER);
	    root.add(vBoxTopRight, 2, 0);
	    
	    VBox vBoxBotLeft = new VBox();
	    vBoxBotLeft.setAlignment(Pos.CENTER);
	    root.add(vBoxBotLeft, 0, 2);
	    
	    VBox vBoxBotRight = new VBox();
	    vBoxBotRight.setAlignment(Pos.CENTER);
	    root.add(vBoxBotRight, 2, 2);
	   
	    
	    setFruitStructure(vBoxTopLeft, listAppleImg);
	    setFruitStructure(vBoxTopRight, listPearImg);
	    setFruitStructure(vBoxBotLeft, listPlumImg);
	    setFruitStructure(vBoxBotRight, listCherryImg);
	    
	    
	    Button buttonRoll = new Button("Roll");
        buttonRoll.setPrefHeight(60);
        buttonRoll.setPrefWidth(106);
        HBox hBoxButton = new HBox();
        root.add(hBoxButton, 1, 3);     
        
        Label labelColor = new Label("");
        root.add(labelColor, 1, 3);
         
        hBoxButton.setAlignment(Pos.CENTER);
        hBoxButton.getChildren().add(buttonRoll);
        
        buttonRoll.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
    
        	@Override
        	public void handle(MouseEvent event) {
        		labelColor.setText("");
        		labelColor.setText(dice.roll().toString());
        		
        	}
        });
	    
	    	

		
		
		Scene scene = new Scene(root, 900, 1000);
		
		
		
		primaryStage.setTitle("Orchard");
		primaryStage.setScene(scene);
		File file_ico = new File("C:\\Users\\iut\\javabut1\\orchard\\image\\raven_ico.jpg");
		primaryStage.getIcons().add(new Image(new FileInputStream(file_ico)));
		primaryStage.show();
	}
	
	
	
	
	public ImageView imageCreation(String imagePath, int height, int width) throws FileNotFoundException{
		File file = new File(imagePath);
		Image img = new Image(new FileInputStream(file));
		ImageView imgView = new ImageView(img);
		imgView.setFitHeight(height);
		imgView.setFitWidth(width);
		return imgView;
	}
	
	public void setFruitStructure(VBox vBox, List<ImageView> listFruitImg) {
			HBox hBoxTop = new HBox(3);
		    HBox hBoxMid = new HBox(4);
		    HBox hBoxBot = new HBox(3);
		    
		    hBoxTop.setPrefHeight(10);
		    hBoxTop.setPrefWidth(10);
		    vBox.getChildren().add(hBoxTop);
		    
		    hBoxMid.setPrefHeight(10);
		    hBoxMid.setPrefWidth(10);
		    vBox.getChildren().add(hBoxMid);
		    
		    hBoxBot.setPrefHeight(10);
		    hBoxBot.setPrefWidth(10);
		    vBox.getChildren().add(hBoxBot);
		    
		    vBox.setSpacing(10);
		    vBox.setPadding(new Insets(0, 0, 40, 0));
		 	hBoxTop.getChildren().add(listFruitImg.get(0));
		    hBoxTop.getChildren().add(listFruitImg.get(1));
		    hBoxTop.getChildren().add(listFruitImg.get(2));
		    hBoxTop.setAlignment(Pos.CENTER);
		    hBoxTop.setSpacing(30);
		    
		    hBoxMid.getChildren().add(listFruitImg.get(3));
		    hBoxMid.getChildren().add(listFruitImg.get(4));
		    hBoxMid.getChildren().add(listFruitImg.get(5));
		    hBoxMid.getChildren().add(listFruitImg.get(6));
		    hBoxMid.setAlignment(Pos.CENTER);
		    hBoxMid.setSpacing(20);
		    
		    hBoxBot.getChildren().add(listFruitImg.get(7));
		    hBoxBot.getChildren().add(listFruitImg.get(8));
		    hBoxBot.getChildren().add(listFruitImg.get(9));
		    hBoxBot.setAlignment(Pos.CENTER);
		    hBoxBot.setSpacing(20);
	}
	
	
	

}

