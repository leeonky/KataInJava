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

	@Test
	public void one_alive_cell_with_two_alive_cell_shall_alive_in_next_generation() {
		Game game = new Game(3, 1);
		game.setAlive(new Point(1, 1));
		game.setAlive(new Point(2, 1));
		game.setAlive(new Point(3, 1));

		game.generate();

		assertEquals(new HashSet<>(Arrays.asList(new Point(2, 1))), game.alives());
	}
}
