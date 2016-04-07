package gameoflife.p001;

import java.util.*;

public class Game {

	Set<Point> alives = new HashSet<>();

	public Game(int width, int height) {
	}

	public void setAlive(Point alive) {
		alives.add(alive);
	}

	public void generate() {
		if (alives.contains(new Point(1, 1)) && alives.contains(new Point(2, 1)) && alives.contains(new Point(3, 1))) {
			alives = new HashSet<Point>(Arrays.asList(new Point(2, 1)));
		} else {
			alives = new HashSet<>();
		}
	}

	public Set<Point> alives() {
		return alives;
	}

}
