package gameoflife.p001;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		return getNeighours(target).filter(this::isAlive).count() == 2;
	}

	private Stream<Point> getNeighours(Point target) {
		return Stream.of(target.getLeft(), target.getRight(), target.getTop(), target.getBottom());
	}

	private boolean isAlive(Point target) {
		return alives.contains(target);
	}

	public Set<Point> alives() {
		return alives;
	}

}
