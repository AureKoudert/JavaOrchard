package orchard.application;


import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import orchard.application.view.GameEndView;
import orchard.application.view.GameView;

public class Crow {
	
	
	
	public static boolean listCrowPieces[] = { false, false, false, false, false, false, false, false, false};
	
	
	
	public void placingCrow(GridPane gridPane, Stage stage) {
		
		int piece = Dice.generateInt(0, 9);
		
		while (listCrowPieces[piece] == true && (listCrowPieces[0] == false || listCrowPieces[1] == false || listCrowPieces[2] == false || listCrowPieces[3] == false || listCrowPieces[4] == false || listCrowPieces[5] == false || listCrowPieces[6] == false || listCrowPieces[7] == false || listCrowPieces[8] == false)) {
				piece = Dice.generateInt(0, 9);
			
		}
		if (listCrowPieces[piece] == false) {
			if (piece == 0) {
				ImageView pieceCrow = GameView.imageCreation("crow/00.png", 100, 100);
				gridPane.add(pieceCrow, 0, 0);
			}
			else if(piece == 1) {
				ImageView pieceCrow = GameView.imageCreation("crow/01.png", 100, 100);
				gridPane.add(pieceCrow, 0, 1);
			}
			else if(piece == 2) {
				ImageView pieceCrow = GameView.imageCreation("crow/02.png", 100, 100);
				gridPane.add(pieceCrow, 0, 2);
			}
			else if(piece == 3) {
				ImageView pieceCrow = GameView.imageCreation("crow/10.png", 100, 100);
				gridPane.add(pieceCrow, 1, 0);
			}
			else if(piece == 4) {
				ImageView pieceCrow = GameView.imageCreation("crow/11.png", 100, 100);
				gridPane.add(pieceCrow, 1, 1);
			}
			else if(piece == 5) {
				ImageView pieceCrow = GameView.imageCreation("crow/12.png", 100, 100);
				gridPane.add(pieceCrow, 1, 2);
			}
			else if(piece == 6) {
				ImageView pieceCrow = GameView.imageCreation("crow/20.png", 100, 100);
				gridPane.add(pieceCrow, 2, 0);
			}
			else if(piece == 7) {
				ImageView pieceCrow = GameView.imageCreation("crow/21.png", 100, 100);
				gridPane.add(pieceCrow, 2, 1);
			}
			else if(piece == 8){
				ImageView pieceCrow = GameView.imageCreation("crow/22.png", 100, 100);
				gridPane.add(pieceCrow, 2, 2);
			}
			else {
				System.out.println("problem");
			}
			listCrowPieces[piece] = true;
			
			if (listCrowPieces[0] == true && listCrowPieces[1] == true && listCrowPieces[2] == true && listCrowPieces[3] == true && listCrowPieces[4] == true && listCrowPieces[5] == true && listCrowPieces[6] == true && listCrowPieces[7] == true && listCrowPieces[8] == true) {
				System.out.println("fin");
				GameEndView.gameLose(stage);
			}
			
		}
		
	}

}
