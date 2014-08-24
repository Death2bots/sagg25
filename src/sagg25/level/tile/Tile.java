package sagg25.level.tile;

import sagg25.Screen;
import sagg25.Graphics.Sprite;

public class Tile {

	public int x, y;
	public Sprite sprite;

	public static Tile GRASS = new GrassTile(Sprite.GRASS);
	public static Tile FLOWER = new FlowerTile(Sprite.FLOWER);
	public static Tile FLOWER2 = new FlowerTile(Sprite.FLOWER2);
	public static Tile ROCK = new RockTile(Sprite.ROCK);
	public static Tile STONE = new StoneTile(Sprite.STONE);
	public static Tile VOID = new VoidTile(Sprite.VOID);
	public static Tile SAND = new SandTile(Sprite.SAND);
	public static Tile WATER = new WaterTile(Sprite.WATER);
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}

	public void render(int x, int y, Screen screen) {
	}

	public boolean solid() {
		return false;
	}

}
