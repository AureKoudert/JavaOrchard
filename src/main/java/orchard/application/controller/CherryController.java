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
	
	//création de CherryController 
	public CherryController(Game treeList, TreeView treeView, BasketView basketView ) {
		this.treeList = treeList;
		this.treeView = treeView;
		this.basketView = basketView;
	}
		
	
	@Override
	public void handle(MouseEvent event) {
		//si le compteur est égal à 2
		if (treeList.getCounter() == 2) {
			System.out.println("No");
		}
		else {
			//si l'arbre n'est pas vide
			if (treeList.getTreeList().get(1).getFruitNb() != 0) {
				//il retire graphiquement le dernier fruti de la liste de fruit en enlevant sa visibilité
				treeView.getListCherryImg().get(treeList.getTreeList().get(1).getFruitNb()-1).setVisible(false);
				//retire le dernier fruit du deuxième arbre de la liste (cerisier)
				treeList.getTreeList().get(1).removeFruit();
				//met à jour le label sur le panier donnant le nombre de cerise
				basketView.setLabelCherry("Cherry : "+ (10 - treeList.getTreeList().get(1).getFruitNb()));	
				//ajoute 1 au compteur
				treeList.addOneToCounter(); 
			}
		}
	}
	
	
}

