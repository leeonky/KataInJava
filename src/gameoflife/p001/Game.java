package gameoflife.p001;

import java.util.*;
import java.util.stream.Collectors;

public class Game {

	Set<Point> alives = new HashSet<>();

	public Game(int width, int height) {
	}

	public void addAlive(Point alive) {
		alives.add(alive);
	}

	public void generate() {
		alives = alives.stream().filter(this::canSurviveInNextGeneration).collect(Collectors.toSet());
	}

	private boolean canSurviveInNextGeneration(Point target) {
		return isAlive(target.getLeft()) && isAlive(target.getRight());
	}

	private boolean isAlive(Point target) {
		return alives.contains(target);
	}

	public Set<Point> alives() {
		return alives;
	}

}
