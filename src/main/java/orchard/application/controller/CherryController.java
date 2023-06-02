package orchard.application.controller;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import orchard.application.Game;
import orchard.application.view.BasketView;
import orchard.application.view.TreeView;

public class CherryController implements EventHandler<MouseEvent>{
	
	private Game treeList;
	private TreeView treeView;
	private BasketView basketView;
	
	public CherryController(Game treeList, TreeView treeView, BasketView basketView ) {
		this.treeList = treeList;
		this.treeView = treeView;
		this.basketView = basketView;
	}
		
	
	@Override
	public void handle(MouseEvent event) {
		if (treeList.getCounter() == 2) {
			System.out.println("No");
		}
		else {
			if (treeList.getTreeList().get(1).getFruitNb() != 0) {
				treeView.getListCherryImg().get(treeList.getTreeList().get(1).getFruitNb()-1).setVisible(false);
				treeList.getTreeList().get(1).removeFruit();
				basketView.setLabelCherry("Cherry : "+ (10 - treeList.getTreeList().get(1).getFruitNb()));	
				treeList.addOneToCounter(); 
			}
		}
	}
	
	
}

