package gameoflife.p001;

import java.util.*;

public class Game {

	private Generation generation = new Generation(new HashSet<>());
	private final Area area;

	public Game(int width, int height) {
		this.area = new Area(1, 1, width, height);
	}

	public void addAlive(Point alive) {
		generation.addAlives(alive);
	}

	public void generate() {
		generation = generation.generate(area);
	}

	public Set<Point> alives() {
		return generation.alives();
	}

}
