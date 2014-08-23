package sagg25.level.tile;

import sagg25.Screen;
import sagg25.Graphics.Sprite;

public class GrassTile extends Tile {

	public GrassTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x <<4 , y <<4 , this);

	}

}
