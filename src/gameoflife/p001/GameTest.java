package gameoflife.p001;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void one_alive_cell_then_dead() {
		Game game = new Game(1, 1);
		game.setAlive(new Point(1, 1));

		game.generate();
		
		assertEquals(new HashSet<>(Arrays.asList()), game.alives());
	}

}
