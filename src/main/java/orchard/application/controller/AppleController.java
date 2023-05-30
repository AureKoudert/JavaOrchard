package orchard.application.controller;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import orchard.application.Game;
import orchard.application.view.BasketView;
import orchard.application.view.TreeView;

public class AppleController implements EventHandler<MouseEvent>{
	
	private Game treeList;
	private TreeView treeView;
	private BasketView basketView;
	
	public AppleController(Game treeList, TreeView treeView, BasketView basketView ) {
		this.treeList = treeList;
		this.treeView = treeView;
		this.basketView = basketView;
		
	}
	
	@Override
	public void handle(MouseEvent event) {
		if (treeList.getTreeList().get(0).getFruitNb() != 0) {
			treeView.getListAppleImg().get(treeList.getTreeList().get(0).getFruitNb()-1).setVisible(false);
			treeList.getTreeList().get(0).removeFruit();
			basketView.setLabelApple("Apple : "+ (10 - treeList.getTreeList().get(0).getFruitNb()));						
		}
		
	}
	
	
}
