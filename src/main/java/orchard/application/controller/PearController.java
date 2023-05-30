package orchard.application.controller;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import orchard.application.Game;
import orchard.application.view.BasketView;
import orchard.application.view.TreeView;

public class PearController implements EventHandler<MouseEvent>{
	
	private Game treeList;
	private TreeView treeView;
	private BasketView basketView;
	
	public PearController(Game treeList, TreeView treeView, BasketView basketView ) {
		this.treeList = treeList;
		this.treeView = treeView;
		this.basketView = basketView;
		
	}
	
	@Override
	public void handle(MouseEvent event) {
		if (treeList.getTreeList().get(2).getFruitNb() != 0) {
			treeView.getListPearImg().get(treeList.getTreeList().get(2).getFruitNb()-1).setVisible(false);
			treeList.getTreeList().get(2).removeFruit();
			basketView.setLabelPear("Pear : "+ (10 - treeList.getTreeList().get(2).getFruitNb()));						
		}
		
	}
	
	
}
