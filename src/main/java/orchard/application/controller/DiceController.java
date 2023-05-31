package orchard.application.controller;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import orchard.application.Crow;
import orchard.application.Dice;
import orchard.application.Game;
import orchard.application.Side;
import orchard.application.view.BasketView;
import orchard.application.view.GameEndView;
import orchard.application.view.GameView;
import orchard.application.view.TreeView;
import orchard.application.view.UIView;

public class DiceController implements EventHandler<MouseEvent>{
	
	private Dice dice = new Dice();
	private Game treeList;
	private TreeView treeView;
	private UIView uiView;
	private BasketView basketView;
	private GameView gameView;
	private GridPane gridPane;
	private Stage stage;
	private GridPane gridPaneRoot;


	Crow crow = new Crow();
	
	//création de la classe DiceController.
	public DiceController( Game treeList, TreeView treeView, UIView uiView, BasketView basketView, GameView gameView, GridPane gridPane, Stage stage, GridPane gridPaneRoot) {
		this.treeList = treeList;
		this.treeView = treeView;
		this.uiView = uiView;
		this.basketView = basketView;
		this.gameView = gameView;
		this.gridPane = gridPane;
		this.stage = stage;
		this.gridPaneRoot = gridPaneRoot;

	}
	
	
	@Override
	public void handle(MouseEvent event) {
			//permet de rénitialiser le compteur
			treeList.resetCounter();
		
			//cas ou tous les nombres de fruits de tous les arbres sont égales à 0 (donc victoire)
			if ((treeList.getTreeList().get(0).getFruitNb() == 0) && (treeList.getTreeList().get(1).getFruitNb() == 0) && (treeList.getTreeList().get(2).getFruitNb() == 0) && (treeList.getTreeList().get(3).getFruitNb() == 0)) {
				//appel de la fonction gameWin
				GameEndView.gameWin(stage);;
			}
			else {
				//met les fruits de l'UI invisible
				uiView.setFruitInvisible();
				//met le label (demandant de choisir 2 fruits) invisibles
				uiView.setLabelBasketSideVisibility(false);
				//ajoute 1 au nombre de tour
				uiView.incrementLabelRound();
				
				//lance le dé
				Side side = dice.roll();
				//affiche la face sur laquelle on est tombé dans la console
				System.out.println(side);
				
				//cas de la face verte
				if  (side == Side.GREEN) {
					//met le label affichant la face à jour
					uiView.setLabelColor(side.toString(), 33, 217, 0, 0, 0, 0);
					//si le nombre de fruit de l'arbre vert n'est pas égal à 0
					if (treeList.getTreeList().get(0).getFruitNb() != 0) {
						//retire la visibilité de la dernière image de pomme de la liste
						treeView.getListAppleImg().get(treeList.getTreeList().get(0).getFruitNb()-1).setVisible(false);
						//retire l'image de la liste
						treeList.getTreeList().get(0).removeFruit();
						//met à jour le label du panier avec le nombre de pomme
						basketView.setLabelApple("Apple : "+ (10 - treeList.getTreeList().get(0).getFruitNb()));	
						
					}
				}
				//cas face bleue
				else if (side == Side.BLUE) {
					uiView.setLabelColor(side.toString(), 93, 0, 255, 0, 0, 0);
					if (treeList.getTreeList().get(3).getFruitNb() != 0) {
						treeView.getListPlumImg().get(treeList.getTreeList().get(3).getFruitNb()-1).setVisible(false);
						treeList.getTreeList().get(3).removeFruit();
						basketView.setLabelPlum("Plum : "+ (10 - treeList.getTreeList().get(3).getFruitNb()));
						
					}	
				}
				//cas face rouge
				else if (side == Side.RED) {
					uiView.setLabelColor(side.toString(), 180, 18, 4, 0, 0, 0);
					if (treeList.getTreeList().get(1).getFruitNb() != 0) {
						treeView.getListCherryImg().get(treeList.getTreeList().get(1).getFruitNb()-1).setVisible(false);
						treeList.getTreeList().get(1).removeFruit();
						basketView.setLabelCherry("Cherry : "+ (10 - treeList.getTreeList().get(1).getFruitNb()));	
						
					}
				}
				//cas face jaune
				else if (side == side.YELLOW) {
					uiView.setLabelColor(side.toString(), 255, 230, 0, 0, 0, 0);
					if (treeList.getTreeList().get(2).getFruitNb() != 0) {
						treeView.getListPearImg().get(treeList.getTreeList().get(2).getFruitNb()-1).setVisible(false);
						treeList.getTreeList().get(2).removeFruit();
						basketView.setLabelPear("Pear : "+ (10 - treeList.getTreeList().get(2).getFruitNb()));			
					
					}
				}
				//cas face corbeau
				else if (side == side.CROW){	
					uiView.setLabelColor(side.toString(), 0, 0, 0, 255, 255, 255);
					//appel la fonction placingCrow permettant de placer une pièce aléatoire du corbeau
					crow.placingCrow(gridPane, stage);
				}
				//cas de la face basket
				else if (side == side.BASKET){
					//renitialise le counter (permettant de limiter le choix de fruit à 2)
					treeList.resetCounter();
					//met à jour le label permettant d'afficher la face
					uiView.setLabelColor(side.toString(), 255, 255, 255, 0, 0, 0);
					//affiche le label permettant de dire à l'utilisateur de saisir 2 fruits
					uiView.setLabelBasketSideVisibility(true);
					// appel la fonction setFruitVisibile permettant d'afficher les fruits dans l'UI
					uiView.setFruitVisible(gridPaneRoot, treeList);
				}
				
				else {
					System.out.println("Problem.");
				}
	
		}
		
		
		
	}
}
