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

	public static Sprite playerF = new Sprite(32, 0, 5, SpriteSheet.tiles);
	public static Sprite playerD = new Sprite(32, 2, 5, SpriteSheet.tiles);
	public static Sprite playerS = new Sprite(32, 1, 5, SpriteSheet.tiles);
	
	public static Sprite playerF1 = new Sprite(32, 0, 6, SpriteSheet.tiles);
	public static Sprite playerF2 = new Sprite(32, 0, 7, SpriteSheet.tiles);
	public static Sprite playerD1 = new Sprite(32, 2, 6, SpriteSheet.tiles);
	public static Sprite playerD2 = new Sprite(32, 2, 7, SpriteSheet.tiles);
	public static Sprite playerS1 = new Sprite(32, 1, 6, SpriteSheet.tiles);
	public static Sprite playerS2 = new Sprite(32, 1, 7, SpriteSheet.tiles);
	
	
	
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
