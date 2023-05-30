package orchard.application.view;

import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class CrowView {
	
	public static GridPane crowPuzzleCreation(GridPane gridPane) {
		GridPane gridPanePuzzle = new GridPane();
		for (int i = 0 ; i < 3 ; i ++) {
			ColumnConstraints column = new ColumnConstraints(100);
			gridPanePuzzle.getColumnConstraints().add(column);
	     }
	
		for (int i = 0 ; i < 3 ; i ++) {
			RowConstraints row = new RowConstraints(100);
			gridPanePuzzle.getRowConstraints().add(row);
	     }
		
		
		gridPane.add(gridPanePuzzle, 1, 1);
		
		ImageView one = GameView.imageCreation("crow_shadow/00.png", 100, 100);
		gridPanePuzzle.add(one, 0, 0);
		
		ImageView two = GameView.imageCreation("crow_shadow/01.png", 100, 100);
		gridPanePuzzle.add(two, 0, 1);

		
		ImageView three = GameView.imageCreation("crow_shadow/02.png", 100, 100);
		gridPanePuzzle.add(three, 0, 2);

		
		ImageView four = GameView.imageCreation("crow_shadow/10.png", 100, 100);
		gridPanePuzzle.add(four, 1, 0);

		
		ImageView five = GameView.imageCreation("crow_shadow/11.png", 100, 100);
		gridPanePuzzle.add(five, 1, 1);

		
		ImageView six = GameView.imageCreation("crow_shadow/12.png", 100, 100);
		gridPanePuzzle.add(six, 1, 2);

		
		ImageView seven = GameView.imageCreation("crow_shadow/20.png", 100, 100);
		gridPanePuzzle.add(seven, 2, 0);

		
		ImageView eight = GameView.imageCreation("crow_shadow/21.png", 100, 100);
		gridPanePuzzle.add(eight, 2, 1);

		
		ImageView nine = GameView.imageCreation("crow_shadow/22.png", 100, 100);
		gridPanePuzzle.add(nine, 2, 2);
		
		return gridPanePuzzle;

		
		
	
		
	}

}
