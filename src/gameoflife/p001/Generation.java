package gameoflife.p001;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generation {
	private Set<Point> alives;

	public Generation(Set<Point> alives) {
		this.alives = alives;
	}

	private boolean isAlive(Point target) {
		return alives.contains(target);
	}

	private boolean isDead(Point target) {
		return !isAlive(target);
	}

	private Stream<Point> allDeadNeighours() {
		return alives.stream().flatMap(p -> p.neighoursWhich(this::isDead));
	}

	private boolean canAliveFromDeadInNextGeneration(Point deadTarget) {
		return deadTarget.neighoursWhich(this::isAlive).count() == 3;
	}

	private boolean canSurviveInNextGeneration(Point target) {
		return target.neighoursWhich(this::isAlive).count() == 2 || target.neighoursWhich(this::isAlive).count() == 3;
	}

	public void addAlives(Point alive) {
		alives.add(alive);
	}

	public Generation generate(Area area) {
		return new Generation(Stream
				.concat(allDeadNeighours().filter(p -> canAliveFromDeadInNextGeneration(p)),
						alives.stream().filter(p -> canSurviveInNextGeneration(p)))
				.filter(p -> p.isIn(area)).collect(Collectors.toSet()));
	}

	public Set<Point> alives() {
		return alives;
	}
}