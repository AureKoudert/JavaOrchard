package orchard.application.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class DiceView {
	private Label labelColor = new Label();
	private Button buttonRoll = new Button("Roll");
	
	
	public void placingRollButton(GridPane gridPane) {
        this.buttonRoll.setPrefHeight(60);
        this.buttonRoll.setPrefWidth(106);
        HBox hBoxButton = new HBox();
        gridPane.add(hBoxButton, 1, 3);                  
       
        hBoxButton.setAlignment(Pos.CENTER);
        hBoxButton.getChildren().addAll(this.buttonRoll, this.labelColor);
    
	}


	public Label getLabelColor() {
		return labelColor;
	}


	public void setLabelColor(String color) {
		this.labelColor.setText(color);
	}


	public Button getButtonRoll() {
		return buttonRoll;
	}
}
