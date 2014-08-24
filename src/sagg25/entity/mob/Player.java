package sagg25.entity.mob;

import sagg25.Screen;
import sagg25.Graphics.Sprite;
import sagg25.Input.Keyboard;

public class Player extends Mob {
	
	private Keyboard input;
	private Sprite sprite;
	private int anim = 0;
	private boolean walking = false;
	
	
	public Player(Keyboard input) {
		this.input = input;
	}
	
	public Player(int x, int y, Keyboard input) {
		this.x =x;
		this.y= y;
	}

	public void update() {
		int xa = 0, ya = 0;
		if (anim < 1337331) anim++; 
		else anim = 0;
		if(input.up) ya--;
		if(input.down) ya++;
		if(input.left) xa--;
		if(input.right) xa++;
		
		if (xa != 0 || ya != 0) {
			move(xa, ya);
		walking = true;
		
	} else {
		walking = false;
	}
}
	public void render(Screen screen) {
		int flip = 0;
		
		if ( dir ==0) { sprite = Sprite.playerF;
			if (walking) {
				if (anim % 20 > 10) {
					sprite = Sprite.playerF1;
				} else {
					sprite = Sprite.playerF2;
				}
			}
		}
		
		if ( dir ==2) { sprite = Sprite.playerD;
			if (walking) {
				if (anim % 20 > 10) {
					sprite = Sprite.playerD1;
				} else {
					sprite = Sprite.playerD2;
				}
			}
		}
		
		if ( dir ==1) { sprite = Sprite.playerS;
			if (walking) {
				if (anim % 20 > 10) {
					sprite = Sprite.playerS1;
				} else {
					sprite = Sprite.playerS2;
				}
			}
		}
			if (dir ==3) {
			  if (walking) {
				  sprite = Sprite.playerS;
					if(anim % 20 > 10) {
						sprite = Sprite.playerS1;
					} else {
						sprite = Sprite.playerS2;
					}
				}  
			  }
				
		if ( dir == 3) flip = 1;
			screen.renderPlayer(x - 16, y - 16 , sprite, flip);
		}
}
