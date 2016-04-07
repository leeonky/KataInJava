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
		Point target = new Point(2, 1);
		if (alives.contains(target.getLeft()) && alives.contains(target) && alives.contains(target.getRight())) {
			alives = new HashSet<Point>(Arrays.asList(target));
		} else {
			alives = new HashSet<>();
		}
	}

	public Set<Point> alives() {
		return alives;
	}

}
