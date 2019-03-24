package render;

import entities.Prey;
import utilities.StdDraw;

public class HealthBarRenderer {

	public void Render(Prey prey) {
		double health = prey.health;
		double maxHealth = prey.maxHealth;
		
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(0, 0, 1f/4, 0.025);
		StdDraw.setPenColor(0, 255, 0);
		StdDraw.filledRectangle(0, 0, (health/maxHealth)/4, 0.025);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.textLeft(0, 0.01, "Health: "+health);
		
		
		
	}
	
}
