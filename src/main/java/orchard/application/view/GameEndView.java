package orchard.application.view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GameEndView {
	
	public static void gameLose(Stage previousStage) {
		
		BorderPane borderPane = new BorderPane();
		
		Label label = new Label("Number Two Defeat Royale");
		
		previousStage.hide();
		
		borderPane.getChildren().add(label);
		
		Scene loseScene = new Scene(borderPane);
		
		Stage stage = new Stage();
		stage.setTitle("Defeat");
		stage.setScene(loseScene);
		
		stage.show();
	}
	
	public static void gameWin(Stage previousStage) {
		BorderPane borderPane = new BorderPane();
		
		Label label = new Label("Number One Victory Royale");
		
		previousStage.hide();
		
		borderPane.getChildren().add(label);
		
		Scene winScene = new Scene(borderPane);
		
		Stage stage = new Stage();
		stage.setTitle("Victory");
		stage.setScene(winScene);
		
		stage.show();
	}

}
