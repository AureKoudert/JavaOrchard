package orchard.application.controller;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import orchard.application.Dice;
import orchard.application.Game;
import orchard.application.Side;
import orchard.application.view.DiceView;
import orchard.application.view.TreeView;

public class DiceController implements EventHandler<MouseEvent>{
	
	private Dice dice = new Dice();
	private Button button;
	private Game treeList;
	private TreeView treeView;

	
	DiceView diceView = new DiceView();
	
	
	public DiceController(Button button, Game treeList, TreeView treeView) {
		this.button = button;
		this.treeList = treeList;
		this.treeView = treeView;
	
	}
	
	
	@Override
	public void handle(MouseEvent event) {
		diceView.setLabelColor("");
		Side side = dice.roll();
		diceView.setLabelColor(side.toString());
		if  (side == Side.GREEN) {
			if (treeList.getTreeList().get(0).getFruitNb() != 0) {
				treeView.getListAppleImg().get(treeList.getTreeList().get(0).getFruitNb()-1).setVisible(false);
				treeList.getTreeList().get(0).removeFruit();
				
			}
		}
		else if (side == Side.BLUE) {
			if (treeList.getTreeList().get(3).getFruitNb() != 0) {
				treeView.getListPlumImg().get(treeList.getTreeList().get(3).getFruitNb()-1).setVisible(false);
				treeList.getTreeList().get(3).removeFruit();
			}	
		}
			
		else if (side == Side.RED) {
			if (treeList.getTreeList().get(1).getFruitNb() != 0) {
				treeView.getListCherryImg().get(treeList.getTreeList().get(1).getFruitNb()-1).setVisible(false);
				treeList.getTreeList().get(1).removeFruit();
			}
		}
			
		else 
			if (treeList.getTreeList().get(2).getFruitNb() != 0) {
				treeView.getListPearImg().get(treeList.getTreeList().get(2).getFruitNb()-1).setVisible(false);
				treeList.getTreeList().get(2).removeFruit();
			};
		
		
	}

}
