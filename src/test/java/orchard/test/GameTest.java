package orchard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import orchard.application.Game;

public class GameTest {
	
	
	
	
	@Test
	public void addOneToCounterTest() {
		Game game = new Game();
		game.addOneToCounter();
		assertEquals(1, game.getCounter());
	}
	
	
	@Test
	public void setCounterToTwoTest() {
		Game game = new Game();
		game.setCountertoTwo();
		assertEquals(2, game.getCounter());
	}
	
	@Test
	public void resetCounterTest() {
		Game game = new Game();
		game.resetCounter();
		assertEquals(0, game.getCounter());
	}
}

