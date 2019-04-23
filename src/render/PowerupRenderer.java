package render;

import java.awt.Color;

import powerups.InvincibilityPowerup;
import powerups.Powerup;
import utilities.StdDraw;

public class PowerupRenderer {

	public void render(Powerup power) {
		StdDraw.setPenColor(new Color(108, 47, 0));
		StdDraw.filledSquare(power.x, power.y+0.05, 0.007);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(power.x, power.y+0.01, 0.005, 0.03);
		StdDraw.filledRectangle(power.x, power.y+0.04, 0.01, 0.005);
		StdDraw.setPenColor(power.color);
		StdDraw.filledRectangle(power.x, power.y+0.005, 0.005, 0.02);
		StdDraw.filledCircle(power.x, power.y, 0.02);
		StdDraw.setPenColor();
		StdDraw.line(power.x-0.02, power.y, power.x-0.003, power.y);
		StdDraw.line(power.x-0.019, power.y+0.008, power.x-0.003, power.y+0.008);
		StdDraw.line(power.x-0.019, power.y-0.008, power.x-0.003, power.y-0.008);
	}
}
