package gameoflife.p001;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generation {
	public Set<Point> alives;

	public Generation(Set<Point> alives) {
		this.alives = alives;
	}

	private boolean isAlive(Point target) {
		return alives.contains(target);
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

	public void addAlives(Point alive) {
		alives.add(alive);
	}

	public Generation generate(Area area) {
		return new Generation(Stream
				.concat(allDeadNeighours().filter(p -> canAliveFromDeadInNextGeneration(p)),
						alives.stream().filter(p -> canSurviveInNextGeneration(p)))
				.filter(p -> p.isIn(area)).collect(Collectors.toSet()));
	}
}