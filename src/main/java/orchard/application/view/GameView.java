package orchard.application.view;



import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;

public class GameView {
	
	//fonction permettant de créer la gridpane de base
	public static GridPane gridPaneCreation() {
		GridPane root = new GridPane();
		//création de 3 colonnes de 300 pixels
		for (int i = 0 ; i < 3 ; i ++) {
			ColumnConstraints column = new ColumnConstraints(300);
	         root.getColumnConstraints().add(column);
	     }
		
		//création de 3 lignes de 300 pixels
		for (int i = 0 ; i < 3 ; i ++) {
			RowConstraints row = new RowConstraints(300);
	         root.getRowConstraints().add(row);
	     }
		
		//création d'une ligne de plus de 100 pixels de haut (UI permettant l'afficher du dé, etc...)
		RowConstraints row = new RowConstraints(100);
	    root.getRowConstraints().add(row);
	    return root;
	}
	
	//fonction permettant de créer une vBox et de la placer dans une gridPane et des coordonnées données
	public static VBox vBoxCreation(GridPane gridPane, int posX, int posY) {
		  VBox vBox = new VBox();
		  vBox.setAlignment(Pos.CENTER);
		  gridPane.add(vBox, posX, posY);
		  return vBox;
	}
	
	//fonction permettant de créer les images d'arbres et de les placer dans les 4 coins de la gridpane donnée
	public static void treePlacing(GridPane root) {
		ImageView imageView1 = GameView.imageCreation("/tree_img.png", 300, 300);
		ImageView imageView2 = GameView.imageCreation("/tree_img.png", 300, 300);
		ImageView imageView3 = GameView.imageCreation("/tree_img.png", 300, 300);
		ImageView imageView4 = GameView.imageCreation("/tree_img.png", 300, 300);
		
	    root.add(imageView1, 0, 0);
	    root.add(imageView2, 2, 0);
		root.add(imageView3, 0, 2);		
		root.add(imageView4, 2, 2);	
	}
    
	
	//fonction permettant de créer une image, et de préciser ses dimensions
	public static ImageView imageCreation(String imagePath, int height, int width) {
		Image img = new Image(imagePath);
		ImageView imgView = new ImageView(img);
		//modification de la hauteur
		imgView.setFitHeight(height);
		//modification de la largeur
		imgView.setFitWidth(width);
		return imgView;
	}
	
}
