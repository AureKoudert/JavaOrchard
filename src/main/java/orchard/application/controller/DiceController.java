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
		if ((treeList.getTreeList().get(0).getFruitNb() == 0) && (treeList.getTreeList().get(1).getFruitNb() == 0) && (treeList.getTreeList().get(2).getFruitNb() == 0) && (treeList.getTreeList().get(3).getFruitNb() == 0)) {
			GameEndView.gameWin(stage);;
		}
		else {
			uiView.setFruitInvisible();
			uiView.setLabelBasketSideVisibility(false);
			uiView.incrementLabelRound();
			Side side = dice.roll();
			
			if  (side == Side.GREEN) {
				if (treeList.getTreeList().get(0).getFruitNb() != 0) {
					treeView.getListAppleImg().get(treeList.getTreeList().get(0).getFruitNb()-1).setVisible(false);
					treeList.getTreeList().get(0).removeFruit();
					basketView.setLabelApple("Apple : "+ (10 - treeList.getTreeList().get(0).getFruitNb()));	
					uiView.setLabelColor(side.toString(), 33, 217, 0, 0, 0, 0);
					
					
				}
			}
			else if (side == Side.BLUE) {
				if (treeList.getTreeList().get(3).getFruitNb() != 0) {
					treeView.getListPlumImg().get(treeList.getTreeList().get(3).getFruitNb()-1).setVisible(false);
					treeList.getTreeList().get(3).removeFruit();
					basketView.setLabelPlum("Plum : "+ (10 - treeList.getTreeList().get(3).getFruitNb()));
					uiView.setLabelColor(side.toString(), 93, 0, 255, 0, 0, 0);
				}	
			}
				
			else if (side == Side.RED) {
				if (treeList.getTreeList().get(1).getFruitNb() != 0) {
					treeView.getListCherryImg().get(treeList.getTreeList().get(1).getFruitNb()-1).setVisible(false);
					treeList.getTreeList().get(1).removeFruit();
					basketView.setLabelCherry("Cherry : "+ (10 - treeList.getTreeList().get(1).getFruitNb()));	
					uiView.setLabelColor(side.toString(), 180, 18, 4, 0, 0, 0);
				}
			}
				
			else if (side == side.YELLOW) {
				if (treeList.getTreeList().get(2).getFruitNb() != 0) {
					treeView.getListPearImg().get(treeList.getTreeList().get(2).getFruitNb()-1).setVisible(false);
					treeList.getTreeList().get(2).removeFruit();
					basketView.setLabelPear("Pear : "+ (10 - treeList.getTreeList().get(2).getFruitNb()));			
					uiView.setLabelColor(side.toString(), 255, 230, 0, 0, 0, 0);
				
				}
			}
			else if (side == side.CROW){	
				uiView.setLabelColor(side.toString(), 0, 0, 0, 255, 255, 255);
				crow.placingCrow(gridPane, stage);
			}
			else if (side == side.BASKET){
				uiView.setLabelColor(side.toString(), 255, 255, 255, 0, 0, 0);
				uiView.setLabelBasketSideVisibility(true);
				uiView.setFruitVisible(gridPaneRoot, treeList);
				
		
			}
			
			else {
				System.out.println("Problem.");
			}
		
	}

	}
}
