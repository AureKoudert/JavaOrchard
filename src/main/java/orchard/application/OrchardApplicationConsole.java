package orchard.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
		GridPane root = new GridPane();
		for (int i = 0 ; i < 5 ; i ++) {
			ColumnConstraints column = new ColumnConstraints(300);
	         root.getColumnConstraints().add(column);
	     }
		
		for (int i = 0 ; i < 5 ; i ++) {
			RowConstraints row = new RowConstraints(300);
	         root.getRowConstraints().add(row);
	     }
		
		File fileTree = new File("C:\\Users\\iut\\javabut1\\orchard\\image\\tree_img.png");
		Image imgTree = new Image(new FileInputStream(fileTree));
		
	
		ImageView imageViewAppleTop1 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\apple_img.png", 35, 35);
		ImageView imageViewAppleTop2 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\apple_img.png", 35, 35);
		ImageView imageViewAppleTop3 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\apple_img.png", 35, 35);
		
		ImageView imageViewAppleMid1 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\apple_img.png", 35, 35);
		ImageView imageViewAppleMid2 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\apple_img.png", 35, 35);
		ImageView imageViewAppleMid3 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\apple_img.png", 35, 35);
		ImageView imageViewAppleMid4 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\apple_img.png", 35, 35);
		
		ImageView imageViewAppleBot1 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\apple_img.png", 35, 35);
		ImageView imageViewAppleBot2 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\apple_img.png", 35, 35);
		ImageView imageViewAppleBot3 = imageCreation("C:\\Users\\iut\\javabut1\\orchard\\image\\apple_img.png", 35, 35);

		
		
		
		ImageView imageView1 = new ImageView(imgTree);
		ImageView imageView2 = new ImageView(imgTree);
		ImageView imageView3 = new ImageView(imgTree);
		ImageView imageView4 = new ImageView(imgTree);
		
		imageView1.setFitHeight(300); 
	    imageView1.setFitWidth(300); 
	    
	    imageView2.setFitHeight(300); 
	    imageView2.setFitWidth(300); 
	    
	    imageView3.setFitHeight(300); 
	    imageView3.setFitWidth(300); 
	    
	    imageView4.setFitHeight(300); 
	    imageView4.setFitWidth(300); 
		
	    root.add(imageView1, 0, 0);
	    root.add(imageView2, 2, 0);
		root.add(imageView3, 0, 2);		
		root.add(imageView4, 2, 2);	
		
	    
	    VBox vBox = new VBox();
	    vBox.setAlignment(Pos.CENTER);
	    root.add(vBox, 0, 0);
	   
	    
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
	    
	    
	    hBoxTop.getChildren().add(imageViewAppleTop1);
	    hBoxTop.getChildren().add(imageViewAppleTop2);
	    hBoxTop.getChildren().add(imageViewAppleTop3);
	    hBoxTop.setAlignment(Pos.CENTER);
	    hBoxTop.setSpacing(30);
	    
	    hBoxMid.getChildren().add(imageViewAppleMid1);
	    hBoxMid.getChildren().add(imageViewAppleMid2);
	    hBoxMid.getChildren().add(imageViewAppleMid3);
	    hBoxMid.getChildren().add(imageViewAppleMid4);
	    hBoxMid.setAlignment(Pos.CENTER);
	    hBoxMid.setSpacing(20);
	    
	    hBoxBot.getChildren().add(imageViewAppleBot1);
	    hBoxBot.getChildren().add(imageViewAppleBot2);
	    hBoxBot.getChildren().add(imageViewAppleBot3);
	    hBoxBot.setAlignment(Pos.CENTER);
	    hBoxBot.setSpacing(20);
	    
	    
	  
	    
	    
	    
	   
		
		
		
		
		
		
		Scene scene = new Scene(root, 900, 900);
		
		
		
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

}

