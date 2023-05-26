package orchard.application.view;

import java.awt.Font;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class DiceView {
	private Label labelColor = new Label("");
	private Button buttonRoll = new Button("Roll");
	Label labelRound = new Label("Round : 0");
	int counter = 0;
	
	
	public void placingRollButton(GridPane gridPane) {
        this.buttonRoll.setPrefHeight(62);
        this.buttonRoll.setPrefWidth(100);
        HBox hBoxButton = new HBox();     
        gridPane.add(hBoxButton, 1, 3);   
        hBoxButton.getChildren().add(labelColor);	
        hBoxButton.setAlignment(Pos.CENTER);
        hBoxButton.getChildren().add(this.buttonRoll);
        hBoxButton.getChildren().add(labelRound);
        labelRound.setPrefWidth(75);
        hBoxButton.setSpacing(25);
        setLabelBorder();
        
	}
	



	public Label getLabelColor() {
		return labelColor;
	}


	public void setLabelColor(String color, int r, int g, int b) {
		labelColor.setText(color);
		labelColor.setStyle("-fx-font-weight: bold");
		labelColor.setBackground(new Background(new BackgroundFill(Color.rgb(r, g, b, 0.80),  new CornerRadii(5.0), Insets.EMPTY)));

	}
	
	public void setLabelBorder() {
		//labelColor.setBackground(new Background(new BackgroundFill(Color.rgb(r, g, b, 1), new CornerRadii(150.5), Insets.EMPTY)));
		labelColor.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(5.0), new BorderWidths(1))));
		labelColor.setPadding(new Insets(10, 10, 10, 10));
		labelColor.setPrefWidth(75);
		labelColor.setAlignment(Pos.CENTER);
	}
	
	public void placingRoundLabel() {
		
	}
	
	public void incrementLabelRound() {
		counter += 1;
		labelRound.setText("Round : "+counter);
	}


	public Button getButtonRoll() {
		return buttonRoll;
	}
	
	
}
