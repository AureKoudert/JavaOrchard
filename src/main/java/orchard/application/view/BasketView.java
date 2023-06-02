package orchard.application.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class BasketView {
	
	private Label labelApple = new Label();
	private Label labelPear = new Label();
	private Label labelCherry = new Label();
	private Label labelPlum = new Label();
	
	public static Label basketCreation(GridPane gridPane, int posY, int posX, String text, int r, int g, int b){
		ImageView imageViewBasket = GameView.imageCreation("/basket_img.png", 200, 300);
		gridPane.add(imageViewBasket, posY, posX);
		VBox vBoxBasket = new VBox();
		gridPane.add(vBoxBasket, posY, posX);
		vBoxBasket.setAlignment(Pos.CENTER);
		Label labelBasket = new Label(text);
		labelBasket.setBackground(new Background(new BackgroundFill(Color.rgb(r, g, b, 1), new CornerRadii(150.5), Insets.EMPTY)));
		labelBasket.setPrefWidth(65);
		labelBasket.setPrefHeight(65);
		labelBasket.setAlignment(Pos.CENTER);
		labelBasket.setStyle("-fx-font-weight: bold");
		vBoxBasket.getChildren().add(labelBasket);
		return labelBasket;
	}
	
	public void basketPlacing(GridPane root) {	
		this.labelApple = BasketView.basketCreation(root, 1, 0, "Apple : 0", 33, 217, 0);
		this.labelPear = BasketView.basketCreation(root, 2, 1, "Pear : 0", 255, 230, 0);
		this.labelCherry = BasketView.basketCreation(root, 1, 2, "Cherry : 0", 180, 18, 4);
		this.labelPlum = BasketView.basketCreation(root, 0, 1, "Plum : 0", 93, 0, 255);
	}
	
	public Label getLabelApple() {
		return labelApple;
	}

	public void setLabelApple(String text) {
		this.labelApple.setText(text);
	}

	public Label getLabelPear() {
		return labelPear;
	}

	public void setLabelPear(String text) {
		this.labelPear.setText(text);
	}

	public Label getLabelCherry() {
		return labelCherry;
	}

	public void setLabelCherry(String text) {
		this.labelCherry.setText(text);
	}

	public Label getLabelPlum() {
		return labelPlum;
	}

	public void setLabelPlum(String text) {
		this.labelPlum.setText(text);
	}


}
