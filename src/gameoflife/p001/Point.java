package gameoflife.p001;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Point {

	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + y;
		result = prime * result + x;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (y != other.y)
			return false;
		if (x != other.x)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public Stream<Point> getNeighours() {
		List<Point> neighours = new ArrayList<>();
		for (int x = -1; x <= 1; x++)
			for (int y = -1; y <= 1; y++)
				neighours.add(new Point(x + this.x, y + this.y));
		return neighours.stream().filter(p -> !this.equals(p));
	}

	public boolean isIn(Area area) {
		return area.contains(x, y);
	}
}
