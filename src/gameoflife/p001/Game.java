package gameoflife.p001;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Game {

	Set<Point> alives = new HashSet<>();
	private final int width;
	private final int height;

	public Game(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void addAlive(Point alive) {
		alives.add(alive);
	}

	public void generate() {
		Set<Point> newAlive = canAliveFromDeadInNextGeneration().collect(Collectors.toSet());
		alives = alives.stream().filter(this::canSurviveInNextGeneration).collect(Collectors.toSet());
		alives.addAll(newAlive);
		alives = alives.stream().filter(p -> p.x <= width && p.y <= height && p.x > 0 && p.y > 0)
				.collect(Collectors.toSet());
	}

	private Stream<Point> canAliveFromDeadInNextGeneration() {
		return alives.stream().flatMap(Point::getNeighours).filter(p -> !isAlive(p))
				.filter(p -> p.getNeighours().filter(this::isAlive).count() == 3);
	}

	private boolean canSurviveInNextGeneration(Point target) {
		return target.getNeighours().filter(this::isAlive).count() == 2
				|| target.getNeighours().filter(this::isAlive).count() == 3;
	}

	private boolean isAlive(Point target) {
		return alives.contains(target);
	}

	public Set<Point> alives() {
		return alives;
	}

}
