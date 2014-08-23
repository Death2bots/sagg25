package sagg25.level.tile;

import sagg25.Screen;
import sagg25.Graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
		}
	
	public boolean solid() {
		return false;
	}
	
}
