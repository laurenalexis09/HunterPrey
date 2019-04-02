package render;

import powerups.Powerup;
import utilities.StdDraw;

public class PowerupRenderer {

	public void render(Powerup power) {
		StdDraw.setPenColor(power.color);
		StdDraw.filledCircle(power.x, power.y, 0.02);
	}
}
