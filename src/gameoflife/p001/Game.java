package gameoflife.p001;

import java.util.*;
import java.util.stream.Collectors;

public class Game {

	Set<Point> alives = new HashSet<>();

	public Game(int width, int height) {
	}

	public void setAlive(Point alive) {
		alives.add(alive);
	}

	public void generate() {
		alives = alives.stream().filter(this::canSurviveInNextGeneration).collect(Collectors.toSet());
	}

	private boolean canSurviveInNextGeneration(Point target) {
		return alives.contains(target.getLeft()) && alives.contains(target.getRight());
	}

	public Set<Point> alives() {
		return alives;
	}

}
