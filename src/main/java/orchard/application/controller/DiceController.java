package orchard.application.controller;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import orchard.application.Dice;
import orchard.application.Game;
import orchard.application.Side;
import orchard.application.view.UIView;
import orchard.application.view.DiceView;
import orchard.application.view.GameView;
import orchard.application.view.TreeView;

public class DiceController implements EventHandler<MouseEvent>{
	
	private Dice dice = new Dice();
	private Game treeList;
	private TreeView treeView;
	private DiceView diceView;
	private UIView basketView;
	private GameView gameView;

	

	
	
	public DiceController( Game treeList, TreeView treeView, DiceView diceView, UIView basketView, GameView gameView) {
		this.treeList = treeList;
		this.treeView = treeView;
		this.diceView = diceView;
		this.basketView = basketView;
		this.gameView = gameView;
	
	}
	
	
	@Override
	public void handle(MouseEvent event) {
		if ((treeList.getTreeList().get(0).getFruitNb() == 0) && (treeList.getTreeList().get(1).getFruitNb() == 0) && (treeList.getTreeList().get(2).getFruitNb() == 0) && (treeList.getTreeList().get(3).getFruitNb() == 0)) {
			System.out.println("End");
		}
		else {
			diceView.incrementLabelRound();
			Side side = dice.roll();
			
			if  (side == Side.GREEN) {
				if (treeList.getTreeList().get(0).getFruitNb() != 0) {
					treeView.getListAppleImg().get(treeList.getTreeList().get(0).getFruitNb()-1).setVisible(false);
					treeList.getTreeList().get(0).removeFruit();
					basketView.setLabelApple("Apple : "+ (10 - treeList.getTreeList().get(0).getFruitNb()));	
					diceView.setLabelColor(side.toString(), 33, 217, 0);
					
					
				}
			}
			else if (side == Side.BLUE) {
				if (treeList.getTreeList().get(3).getFruitNb() != 0) {
					treeView.getListPlumImg().get(treeList.getTreeList().get(3).getFruitNb()-1).setVisible(false);
					treeList.getTreeList().get(3).removeFruit();
					basketView.setLabelPlum("Plum : "+ (10 - treeList.getTreeList().get(3).getFruitNb()));
					diceView.setLabelColor(side.toString(), 93, 0, 255);
				}	
			}
				
			else if (side == Side.RED) {
				if (treeList.getTreeList().get(1).getFruitNb() != 0) {
					treeView.getListCherryImg().get(treeList.getTreeList().get(1).getFruitNb()-1).setVisible(false);
					treeList.getTreeList().get(1).removeFruit();
					basketView.setLabelCherry("Cherry : "+ (10 - treeList.getTreeList().get(1).getFruitNb()));	
					diceView.setLabelColor(side.toString(), 180, 18, 4);
				}
			}
				
			else 
				if (treeList.getTreeList().get(2).getFruitNb() != 0) {
					treeView.getListPearImg().get(treeList.getTreeList().get(2).getFruitNb()-1).setVisible(false);
					treeList.getTreeList().get(2).removeFruit();
					basketView.setLabelPear("Pear : "+ (10 - treeList.getTreeList().get(2).getFruitNb()));			
					diceView.setLabelColor(side.toString(), 255, 230, 0);
					
				};
		}
		
	}

}
