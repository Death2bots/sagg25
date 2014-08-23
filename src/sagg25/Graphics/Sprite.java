package sagg25.Graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;

	public static Sprite GRASS = new Sprite(16, 0, 0, SpriteSheet.tiles);
	public static Sprite STONE = new Sprite(16, 1, 0, SpriteSheet.tiles);
	public static Sprite VOID = new Sprite(16, 2, 0, SpriteSheet.tiles);
	public static Sprite SAND = new Sprite(16, 3, 0, SpriteSheet.tiles);
	
	public static Sprite player0 = new Sprite(16, 0, 10, SpriteSheet.tiles);
	public static Sprite player1 = new Sprite(16, 1, 10, SpriteSheet.tiles);
	public static Sprite player2 = new Sprite(16, 0, 11, SpriteSheet.tiles);
	public static Sprite player3 = new Sprite(16, 1, 11, SpriteSheet.tiles);
	
	public Sprite(int size, int x, int y, SpriteSheet sheet) {

		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();

	}

	private void load() {

		for (int y = 0; y < SIZE; y++)
			for (int x = 0; x < SIZE; x++)
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
	}
}
