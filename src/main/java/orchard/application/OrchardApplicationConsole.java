package orchard.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
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
		
		File file = new File("C:\\Users\\iut\\javabut1\\image\\tree_img.png");
		Image imgTree = new Image(new FileInputStream(file));
		
		
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
		
		
		
		
		
		
		Scene scene = new Scene(root, 900, 900);
		
		
		
		primaryStage.setTitle("Orchard");
		primaryStage.setScene(scene);
		File file_ico = new File("C:\\Users\\iut\\javabut1\\image\\raven_ico.jpg");
		primaryStage.getIcons().add(new Image(new FileInputStream(file_ico)));
		primaryStage.show();
	}
	


}

