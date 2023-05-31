package orchard.application;


import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import orchard.application.view.GameEndView;
import orchard.application.view.GameView;

public class Crow {
	
	
	//création d'une liste de booléen permettant de déterminer si une piece est placée ou non.
	public static boolean listCrowPieces[] = { false, false, false, false, false, false, false, false, false};
	
	
	
	public void placingCrow(GridPane gridPane, Stage stage) {
		
		//ajoute à l'attribut piece un entier aléatoire entre 0 et 8
		int piece = Dice.generateInt(0, 9);
		
		//boucle permettant de regénérer un nombre aléatoire si la piece générée est posée mais qu'il existe une autre piece non posée
		while (listCrowPieces[piece] == true && (listCrowPieces[0] == false || listCrowPieces[1] == false || listCrowPieces[2] == false || listCrowPieces[3] == false || listCrowPieces[4] == false || listCrowPieces[5] == false || listCrowPieces[6] == false || listCrowPieces[7] == false || listCrowPieces[8] == false)) {
			//regénération
			piece = Dice.generateInt(0, 9);
			
		}
		//si la piece n'est pas posée
		if (listCrowPieces[piece] == false) {
			//si c''est la première pièce alors l'image de corbeau sera créer et ajoutée à la gridPane
			if (piece == 0) {
				ImageView pieceCrow = GameView.imageCreation("crow/00.png", 100, 100);
				gridPane.add(pieceCrow, 0, 0);
			}
			//cas de la deuxième pièce
			else if(piece == 1) {
				ImageView pieceCrow = GameView.imageCreation("crow/01.png", 100, 100);
				gridPane.add(pieceCrow, 0, 1);
			}
			//cas de la troisième pièce

			else if(piece == 2) {
				ImageView pieceCrow = GameView.imageCreation("crow/02.png", 100, 100);
				gridPane.add(pieceCrow, 0, 2);
			}
			//cas de la quatrième pièce

			else if(piece == 3) {
				ImageView pieceCrow = GameView.imageCreation("crow/10.png", 100, 100);
				gridPane.add(pieceCrow, 1, 0);
			}
			else if(piece == 4) {
				ImageView pieceCrow = GameView.imageCreation("crow/11.png", 100, 100);
				gridPane.add(pieceCrow, 1, 1);
			}
			//cas de la cinquième pièce

			else if(piece == 5) {
				ImageView pieceCrow = GameView.imageCreation("crow/12.png", 100, 100);
				gridPane.add(pieceCrow, 1, 2);
			}
			//cas de la sixième pièce

			else if(piece == 6) {
				ImageView pieceCrow = GameView.imageCreation("crow/20.png", 100, 100);
				gridPane.add(pieceCrow, 2, 0);
			}
			//cas de la septième pièce

			else if(piece == 7) {
				ImageView pieceCrow = GameView.imageCreation("crow/21.png", 100, 100);
				gridPane.add(pieceCrow, 2, 1);
			}
			//cas de la huitième pièce

			else if(piece == 8){
				ImageView pieceCrow = GameView.imageCreation("crow/22.png", 100, 100);
				gridPane.add(pieceCrow, 2, 2);
			}
			else {
				System.out.println("problem");
			}
			listCrowPieces[piece] = true;
			
			//si toutes les pieces sont placées la partie est perdue, lancement de la fenetre défaite
			if (listCrowPieces[0] == true && listCrowPieces[1] == true && listCrowPieces[2] == true && listCrowPieces[3] == true && listCrowPieces[4] == true && listCrowPieces[5] == true && listCrowPieces[6] == true && listCrowPieces[7] == true && listCrowPieces[8] == true) {
				System.out.println("fin");
				GameEndView.gameLose(stage);
			}
			
		}
		
	}

}
