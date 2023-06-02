package orchard.application.view;


import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class TreeView {
	
	private List<ImageView> listAppleImg = new ArrayList<>();
	private List<ImageView> listPearImg = new ArrayList<>();
	private List<ImageView> listPlumImg = new ArrayList<>();
	private List<ImageView> listCherryImg = new ArrayList<>();
	
	public void fruitListCreation(){
		for (int i = 0 ; i < 10 ; i ++) {
			this.listAppleImg.add(GameView.imageCreation("/apple_img.png", 35, 35));
			this.listPearImg.add(GameView.imageCreation("/pear_img.png", 35, 25));
			this.listPlumImg.add(GameView.imageCreation("/Plum_img.png", 38, 38));
			this.listCherryImg.add(GameView.imageCreation("/cherry_img.png", 35, 35));
		}
	}
	
	public static void setFruitStructure(VBox vBox, List<ImageView> listFruitImg) {
		HBox hBoxTop = new HBox(3);
	    HBox hBoxMid = new HBox(4);
	    HBox hBoxBot = new HBox(3);
	    
	    hBoxTop.setPrefHeight(10);
	    hBoxTop.setPrefWidth(10);
	    vBox.getChildren().add(hBoxTop);
	    
	    hBoxMid.setPrefHeight(10);
	    hBoxMid.setPrefWidth(10);
	    vBox.getChildren().add(hBoxMid);
	    
	    hBoxBot.setPrefHeight(10);
	    hBoxBot.setPrefWidth(10);
	    vBox.getChildren().add(hBoxBot);
	    
	    vBox.setSpacing(10);
	    vBox.setPadding(new Insets(0, 0, 40, 0));
	    
	 	hBoxTop.getChildren().add(listFruitImg.get(0));
	    hBoxTop.getChildren().add(listFruitImg.get(1));
	    hBoxTop.getChildren().add(listFruitImg.get(2));
	    hBoxTop.setAlignment(Pos.CENTER);
	    hBoxTop.setSpacing(30);
	    
	    hBoxMid.getChildren().add(listFruitImg.get(3));
	    hBoxMid.getChildren().add(listFruitImg.get(4));
	    hBoxMid.getChildren().add(listFruitImg.get(5));
	    hBoxMid.getChildren().add(listFruitImg.get(6));
	    hBoxMid.setAlignment(Pos.CENTER);
	    hBoxMid.setSpacing(20);
	    
	    hBoxBot.getChildren().add(listFruitImg.get(7));
	    hBoxBot.getChildren().add(listFruitImg.get(8));
	    hBoxBot.getChildren().add(listFruitImg.get(9));
	    hBoxBot.setAlignment(Pos.CENTER);
	    hBoxBot.setSpacing(20);
}
	
	public List<ImageView> getListAppleImg() {
		return listAppleImg;
	}

	public List<ImageView> getListPearImg() {
		return listPearImg;
	}

	public List<ImageView> getListPlumImg() {
		return listPlumImg;
	}

	public List<ImageView> getListCherryImg() {
		return listCherryImg;
	}
}
