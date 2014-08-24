package sagg25.level.tile;

import sagg25.Screen;
import sagg25.Graphics.Sprite;

public class FlowerTile2 extends Tile {

	public FlowerTile2(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x <<4 , y <<4 , this);

	}

}
