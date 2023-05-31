package orchard.application.view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GameEndView {
	
	//fonction permettant de créer une fenetre de défaite
	public static void gameLose(Stage previousStage) {
		BorderPane borderPane = new BorderPane();
		
		Label label = new Label("Number Two Defeat Royale");
		label.setPrefWidth(75);
		borderPane.getChildren().add(label);
		
		previousStage.hide();
		
		
		Scene loseScene = new Scene(borderPane);
		
		Stage stage = new Stage();
		stage.setTitle("Defeat");
		stage.setScene(loseScene);
		
		stage.show();
	}
	
	//fonction permettant de créer une fenetre de victoire
	public static void gameWin(Stage previousStage) {
		BorderPane borderPane = new BorderPane();
		
		Label label = new Label("Number One Victory Royale");
		label.setPrefWidth(75);
		borderPane.getChildren().add(label);
		
		previousStage.hide();
		
		
		
		Scene winScene = new Scene(borderPane);
		
		Stage stage = new Stage();
		stage.setTitle("Victory");
		stage.setScene(winScene);
		
		stage.show();
	}

}
