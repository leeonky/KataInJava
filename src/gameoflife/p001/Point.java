package gameoflife.p001;

import java.util.stream.Stream;

public class Point {

	final int x;
	final int y;

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

	Point getLeft() {
		return new Point(x - 1, y);
	}

	Point getRight() {
		return new Point(x + 1, y);
	}

	public Point getBottom() {
		return new Point(x, y + 1);
	}

	public Point getTop() {
		return new Point(x, y - 1);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	Stream<Point> getNeighours() {
		return Stream.of(getLeft(), getRight(), getTop(), getBottom(), new Point(x - 1, y - 1), new Point(x + 1, y + 1),
				new Point(x - 1, y + 1), new Point(x + 1, y - 1));
	}
}
