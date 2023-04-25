package orchard.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import orchard.application.Dice;
import orchard.application.Side;

public class DiceTest {
	
	@Test
	public void genererIntTest() {
		Dice dice = new Dice();
		Side generation = dice.roll();
		assertAll(
				() -> assertEquals(generation,(Side.GREEN)),
				() -> assertEquals(generation,(Side.RED)),
				() -> assertEquals(generation,(Side.BLUE)),
				() -> assertEquals(generation,(Side.YELLOW))
		);
		
		
	}

}
