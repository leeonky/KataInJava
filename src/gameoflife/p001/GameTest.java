package gameoflife.p001;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void one_alive_cell_then_dead() {
		Game game = new Game(1, 1);
		game.addAlive(new Point(1, 1));

		game.generate();

		assertEquals(new HashSet<>(Arrays.asList()), game.alives());
	}

	@Test
	public void one_alive_cell_with_two_left_right_alive_cell_shall_alive_in_next_generation() {
		Game game = new Game(3, 1);
		game.addAlive(new Point(1, 1));
		game.addAlive(new Point(2, 1));
		game.addAlive(new Point(3, 1));

		game.generate();

		assertEquals(new HashSet<>(Arrays.asList(new Point(2, 1))), game.alives());
	}

	@Test
	public void one_alive_cell_with_two_top_bottom_alive_cell_shall_alive_in_next_generation() {
		Game game = new Game(1, 3);
		game.addAlive(new Point(1, 1));
		game.addAlive(new Point(1, 2));
		game.addAlive(new Point(1, 3));

		game.generate();

		assertEquals(new HashSet<>(Arrays.asList(new Point(1, 2))), game.alives());
	}

	@Test
	public void one_alive_cell_with_two_top_left_right_bottom_alive_cell_shall_alive_in_next_generation() {
		Game game = new Game(3, 3);
		game.addAlive(new Point(1, 1));
		game.addAlive(new Point(2, 2));
		game.addAlive(new Point(3, 3));

		game.generate();

		assertEquals(new HashSet<>(Arrays.asList(new Point(2, 2))), game.alives());
	}

	@Test
	public void one_alive_cell_with_two_top_right_left_bottom_alive_cell_shall_alive_in_next_generation() {
		Game game = new Game(3, 3);
		game.addAlive(new Point(3, 1));
		game.addAlive(new Point(2, 2));
		game.addAlive(new Point(1, 3));

		game.generate();

		assertEquals(new HashSet<>(Arrays.asList(new Point(2, 2))), game.alives());
	}

	@Test
	public void one_alive_cell_with_three_alive_cells_shall_alive_in_next_generation() {
		Game game = new Game(2, 2);
		game.addAlive(new Point(1, 1));
		game.addAlive(new Point(1, 2));
		game.addAlive(new Point(2, 1));
		game.addAlive(new Point(2, 2));

		game.generate();

		assertEquals(new HashSet<>(Arrays.asList(new Point(1, 1), new Point(1, 2), new Point(2, 1), new Point(2, 2))),
				game.alives());
	}

	@Test
	public void one_dead_cell_with_three_alive_cells_shall_alive_in_next_generation() {
		Game game = new Game(2, 3);
		game.addAlive(new Point(1, 1));
		game.addAlive(new Point(2, 2));
		game.addAlive(new Point(1, 3));

		game.generate();

		assertEquals(new HashSet<>(Arrays.asList(new Point(1, 2), new Point(2, 2))), game.alives());
	}
}
