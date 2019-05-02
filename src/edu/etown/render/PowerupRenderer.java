package edu.etown.render;

import edu.etown.powerups.ConfusionPowerup;
import edu.etown.powerups.HealthPowerup;
import edu.etown.powerups.InvincibilityPowerup;
import edu.etown.powerups.Powerup;
import edu.etown.utilities.StdDraw;

public class PowerupRenderer {

	public void render(Powerup power) {
		if(power instanceof InvincibilityPowerup) {
			StdDraw.setPenColor(254,203,0);
			StdDraw.filledCircle(power.x, power.y, 0.02);
			StdDraw.setPenColor(0,0,255);
			StdDraw.filledEllipse(power.x, power.y+0.0043, 0.009, 0.014);
			StdDraw.setPenColor(254,203,0);
			StdDraw.filledCircle(power.x-0.0035, power.y+0.0033, 0.003);
			StdDraw.filledCircle(power.x+0.0035, power.y+0.0033, 0.003);
			StdDraw.filledRectangle(power.x, power.y+0.01, 0.0098,0.006);
			StdDraw.filledRectangle( power.x, power.y+0.017, 0.0055, 0.002);
		}
		else if(power instanceof HealthPowerup) {
			StdDraw.setPenColor(StdDraw.BOOK_BLUE);
			StdDraw.filledCircle(power.x, power.y, 0.02);
			StdDraw.setPenColor(255,0,0);
			StdDraw.filledRectangle(power.x, power.y, 0.005, 0.009);
			StdDraw.filledRectangle(power.x, power.y, 0.009, 0.005);
			StdDraw.setPenColor(150,0,0);
			StdDraw.filledRectangle(power.x, power.y, 0.003, 0.007);
			StdDraw.filledRectangle(power.x, power.y, 0.007, 0.003);
		}
		else if(power instanceof ConfusionPowerup) {
			StdDraw.setPenColor(StdDraw.BOOK_BLUE);
			StdDraw.filledCircle(power.x, power.y, 0.02);
			StdDraw.setPenRadius(0.01);
			StdDraw.setPenColor(StdDraw.YELLOW);
			StdDraw.line(power.x-0.007, power.y, power.x+0.007, power.y);
			StdDraw.line(power.x-0.007, power.y, power.x-0.003, power.y+0.006);
			StdDraw.line(power.x-0.007, power.y, power.x-0.003, power.y-0.006);
		}
	}
}
