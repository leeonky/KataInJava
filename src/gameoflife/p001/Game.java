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
		HashSet<Point> nextAlives = new HashSet<>();
		if (alives.contains(target) && canSurviveInNextGeneration(target)) {
			nextAlives = new HashSet<Point>(Arrays.asList(target));
			alives = nextAlives;
		} else {
			alives = nextAlives;
		}
	}

	private boolean canSurviveInNextGeneration(Point target) {
		return alives.contains(target.getLeft()) && alives.contains(target.getRight());
	}

	public Set<Point> alives() {
		return alives;
	}

}
