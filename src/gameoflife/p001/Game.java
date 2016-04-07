package gameoflife.p001;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Game {

	private Set<Point> alives = new HashSet<>();
	private Area area;

	public Game(int width, int height) {
		this.area = new Area(1, 1, width, height);
	}

	public void addAlive(Point alive) {
		alives.add(alive);
	}

	public void generate() {
		alives = Stream
				.concat(allDeadNeighours().filter(this::canAliveFromDeadInNextGeneration),
						alives.stream().filter(this::canSurviveInNextGeneration))
				.filter(p -> p.isIn(area)).collect(Collectors.toSet());
	}

	private Stream<Point> allDeadNeighours() {
		return alives.stream().flatMap(Point::getNeighours).filter(p -> !isAlive(p));
	}

	private boolean canAliveFromDeadInNextGeneration(Point deadTarget) {
		return deadTarget.getNeighours().filter(this::isAlive).count() == 3;
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
