package orchard.application.view;



import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;

public class GameView {
	
	public static GridPane gridPaneCreation() {
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
	    return root;
	}
	
	public static VBox vBoxCreation(GridPane gridPane, int posX, int posY) {
		  VBox vBox = new VBox();
		  vBox.setAlignment(Pos.CENTER);
		  gridPane.add(vBox, posX, posY);
		  return vBox;
	}
	
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
    
	
	public static ImageView imageCreation(String imagePath, int height, int width) {
		Image img = new Image(imagePath);
		ImageView imgView = new ImageView(img);
		imgView.setFitHeight(height);
		imgView.setFitWidth(width);
		return imgView;
	}
}
