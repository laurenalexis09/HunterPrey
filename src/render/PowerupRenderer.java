package render;

import powerups.ConfusionPowerup;
import powerups.HealthPowerup;
import powerups.InvincibilityPowerup;
import powerups.Powerup;
import utilities.StdDraw;

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
		}
	}
}
