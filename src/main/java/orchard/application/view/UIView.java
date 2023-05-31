package orchard.application.view;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
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
import orchard.application.Game;

public class UIView {
	private Label labelColor = new Label("");
	private Button buttonRoll = new Button("Roll");
	Label labelRound = new Label("Round : 0");
	int counter = 0;
	Label labelBasketSide = new Label("Choose 2 fruits by clicking on their fruit on the right.");
	private List<ImageView> listFruitImg = new ArrayList<>();
	
	
	
	public List<ImageView> getListFruitImg() {
		return listFruitImg;
	}
	
	//fonction permettant d'ajouter le bouton roll et tout ce qui concerne le bouton (labels...)
	public void placingRollButton(GridPane gridPane) {
		
		setFruit(gridPane);
		
        this.buttonRoll.setPrefHeight(62);
        this.buttonRoll.setPrefWidth(100);
        HBox hBoxButton = new HBox();     
        gridPane.add(hBoxButton, 1, 3);   
        hBoxButton.getChildren().add(labelColor);	
        hBoxButton.setAlignment(Pos.CENTER);
        hBoxButton.getChildren().add(this.buttonRoll);
        hBoxButton.getChildren().add(labelRound);
        gridPane.add(labelBasketSide, 0, 3);
        labelBasketSide.setPadding(new Insets(0, 0, 0, 10));
        labelBasketSide.setVisible(false);
        
        labelRound.setPrefWidth(75);
        hBoxButton.setSpacing(25);
        setLabelBorder();
        
	}
	
	//fonction permettant de mettre visible ou non le label apparaissant lorsque l'on tombe sur la face basket
	public void setLabelBasketSideVisibility(boolean bool) {
		labelBasketSide.setVisible(bool);
	}
	

	//fonction permettant de renvoyer  le label de la couleur de la face
	public Label getLabelColor() {
		return labelColor;
	}

	//fonction permettant de modifier le texte du label de la couleur de la face
	public void setLabelColor(String color, int r, int g, int b, int r2, int g2, int b2) {
		labelColor.setText(color);
		//change la couleur de son texte
		labelColor.setTextFill(Color.rgb(r2, g2, b2));
		//met le texte en gras
		labelColor.setStyle("-fx-font-weight: bold");
		//change la couleur de son fond 
		labelColor.setBackground(new Background(new BackgroundFill(Color.rgb(r, g, b, 0.80),  new CornerRadii(5.0), Insets.EMPTY)));

	}
	
	
	//fonction permettant de mettre des bordures à LabelColor
	public void setLabelBorder() {
		//labelColor.setBackground(new Background(new BackgroundFill(Color.rgb(r, g, b, 1), new CornerRadii(150.5), Insets.EMPTY)));
		labelColor.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(5.0), new BorderWidths(1))));
		labelColor.setPadding(new Insets(10, 10, 10, 10));
		labelColor.setPrefWidth(75);
		labelColor.setAlignment(Pos.CENTER);
	}
	
	//fonction permettant d'incrémenter de 1 le compteur de tour et de le mettre à jour
	public void incrementLabelRound() {
		counter += 1;
		labelRound.setText("Round : "+counter);
	}
	
	//fonction permettant de créer un label à afficher lorsque l'on tombe sur la face basket
	public void createLabelToChoseFruit(HBox hBox) {
		Label label = new Label("Chose 2 fruits by clicking on a tree");
		hBox.getChildren().add(label);
		
	}

	//fonction permettant de revnoyer le buttonRolll
	public Button getButtonRoll() {
		return buttonRoll;
	}
	
	//fonction permettant d'ajouter les 4 fruits dans l'UI et de l'ajouter dans une liste
	public void setFruit(GridPane gridPane) {
		HBox hBox = new HBox();
		gridPane.add(hBox, 2, 3);
		ImageView apple = GameView.imageCreation("apple_img.png", 50, 50);
		ImageView pear = GameView.imageCreation("pear_img.png", 60, 45);
		ImageView plum = GameView.imageCreation("plum_img.png", 50, 60);
		ImageView cherry = GameView.imageCreation("cherry_img.png", 50, 50);
		hBox.setSpacing(25);
		hBox.setAlignment(Pos.CENTER);
		
		hBox.getChildren().addAll(apple, pear, plum, cherry );
		
		apple.setVisible(false);
		pear.setVisible(false);
		plum.setVisible(false);
		cherry.setVisible(false);
		
		
		listFruitImg.add(apple);
		listFruitImg.add(cherry);
		listFruitImg.add(pear);
		listFruitImg.add(plum);
		
		
	}
	
	//fonction permettant d'afficher ou non les fruits en fonction de s'il en reste dans les arbres ou non
	public void setFruitVisible(GridPane gridPane, Game treeList) {
		if (treeList.getTreeList().get(0).getFruitNb() != 0) {
			listFruitImg.get(0).setVisible(true);
		}
		if (treeList.getTreeList().get(1).getFruitNb() != 0) {
			listFruitImg.get(1).setVisible(true);
		}
		if (treeList.getTreeList().get(2).getFruitNb() != 0) {
			listFruitImg.get(2).setVisible(true);
		}
		if (treeList.getTreeList().get(3).getFruitNb() != 0) {
			listFruitImg.get(3).setVisible(true);
		}
		
	}
	
	//fonction permettant de mettre les fruits invisible
	public void setFruitInvisible() {
		listFruitImg.get(0).setVisible(false);
		listFruitImg.get(1).setVisible(false);
		listFruitImg.get(2).setVisible(false);
		listFruitImg.get(3).setVisible(false);
	}
	
	
	
	
	
	
}
