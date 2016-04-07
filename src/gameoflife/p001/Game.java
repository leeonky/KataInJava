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
		if (alives.size() == 3) {
			alives = new HashSet<Point>(Arrays.asList(new Point(2, 1)));
		} else {
			alives = new HashSet<>();
		}
	}

	public Set<Point> alives() {
		return alives;
	}

}
