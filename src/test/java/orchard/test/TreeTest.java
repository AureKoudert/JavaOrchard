package orchard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import orchard.application.Tree;




public class TreeTest {
	
	@Test
	public void removeFruitTest() {
		Tree tree = new Tree("appleTree","green","apple",10);
		tree.removeFruit();
		assertEquals(9, tree.getFruitNb());
		
		Tree treeFruitNbEqual0 = new Tree("appleTree","green","apple",0);
		treeFruitNbEqual0.removeFruit();
		assertEquals(0,treeFruitNbEqual0.getFruitNb());
	}
	
	@Test
	public void getTreeNameTest() {
		Tree  tree = new Tree("Bernard","green","apple",10);
		assertEquals("Bernard",tree.getTreeName());
	}
	
	@Test
	public void getColorTest() {
		Tree  tree = new Tree("Bernard","yellow","apple",10);
		assertEquals("yellow",tree.getColor());
	}

}
