package gameoflife.p001;

public class Area {

	private final int width;
	private final int height;
	private final int x;
	private final int y;

	public Area(int x, int y, int width, int height) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	public boolean contains(int x, int y) {
		return x <= width && y <= height && x >= this.x && y >= this.y;
	}

}
