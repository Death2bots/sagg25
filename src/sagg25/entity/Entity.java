package sagg25.entity;

import java.util.Random;

import sagg25.Screen;
import sagg25.level.Level;

public class Entity {

	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public void update() {
		}

	public void render(Screen screen) {
		}
	
	public void remove() {
		//Remove from level
		removed = true;
	}
	
	public boolean  isRemoved() {
		return removed;
	}
		
}
