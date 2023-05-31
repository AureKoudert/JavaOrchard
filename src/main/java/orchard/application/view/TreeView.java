package orchard.application.view;


import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class TreeView {
	
	//listes permettant de contenir les 10 images de fruits
	private List<ImageView> listAppleImg = new ArrayList<>();
	private List<ImageView> listPearImg = new ArrayList<>();
	private List<ImageView> listPlumImg = new ArrayList<>();
	private List<ImageView> listCherryImg = new ArrayList<>();
	
	//liste permettant d'ajouter 10 images de fruit dans chaque liste
	public void fruitListCreation(){
		for (int i = 0 ; i < 10 ; i ++) {
			//ajoute 10 fois une nouvelle image avec des dimensions données dans une liste
			this.listAppleImg.add(GameView.imageCreation("/apple_img.png", 35, 35));
			this.listPearImg.add(GameView.imageCreation("/pear_img.png", 35, 25));
			this.listPlumImg.add(GameView.imageCreation("/Plum_img.png", 38, 38));
			this.listCherryImg.add(GameView.imageCreation("/cherry_img.png", 35, 35));
		}
	}
	
	//fonction permettant de placer les fruits "dans les arbres"
	public static void setFruitStructure(VBox vBox, List<ImageView> listFruitImg) {
		//création de 3 Hbox
		HBox hBoxTop = new HBox(3);
	    HBox hBoxMid = new HBox(4);
	    HBox hBoxBot = new HBox(3);
	    
	    //on précise leur taille et on les ajoute dans la VBox en paramètre
	    hBoxTop.setPrefHeight(10);
	    hBoxTop.setPrefWidth(10);
	    vBox.getChildren().add(hBoxTop);
	    
	    hBoxMid.setPrefHeight(10);
	    hBoxMid.setPrefWidth(10);
	    vBox.getChildren().add(hBoxMid);
	    
	    hBoxBot.setPrefHeight(10);
	    hBoxBot.setPrefWidth(10);
	    vBox.getChildren().add(hBoxBot);
	    
	    //permet de rajouter de l'espace horizontalement entre chaque fruit
	    vBox.setSpacing(10);
	    //permet de rajouter de l'espace verticalement entre chaque fruit
	    vBox.setPadding(new Insets(0, 0, 40, 0));
	    
	    //ajoute et centre 3 fruits de la liste dans la première HBox
	 	hBoxTop.getChildren().add(listFruitImg.get(0));
	    hBoxTop.getChildren().add(listFruitImg.get(1));
	    hBoxTop.getChildren().add(listFruitImg.get(2));
	    hBoxTop.setAlignment(Pos.CENTER);
	    hBoxTop.setSpacing(30);
	    
	    //ajoute et centre 4 fruits dans la deuxième hbox
	    hBoxMid.getChildren().add(listFruitImg.get(3));
	    hBoxMid.getChildren().add(listFruitImg.get(4));
	    hBoxMid.getChildren().add(listFruitImg.get(5));
	    hBoxMid.getChildren().add(listFruitImg.get(6));
	    hBoxMid.setAlignment(Pos.CENTER);
	    hBoxMid.setSpacing(20);
	    
	    //ajoute et centre 3 fruits dans la dernière hbox
	    hBoxBot.getChildren().add(listFruitImg.get(7));
	    hBoxBot.getChildren().add(listFruitImg.get(8));
	    hBoxBot.getChildren().add(listFruitImg.get(9));
	    hBoxBot.setAlignment(Pos.CENTER);
	    hBoxBot.setSpacing(20);
}
	
	//fonctions permettant de renvoyer les différentes listes d'images de fruits
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
