package edu.etown.entities;

import edu.etown.level.Level;
import edu.etown.utilities.MathUtility;

public class RandomHunter extends Hunter{

	double targetX,targetY;

	public RandomHunter(Level levelIn, double x, double y) {
		super(levelIn, x, y);
		generateNewTargetCoords();
	}

	public void update(){
		super.update();
		if(MathUtility.getDistance(targetX, targetY, this.x, this.y)<.01) {
			generateNewTargetCoords();
		}
		double time = 0.04;
		double angle = Math.atan2(targetY-y, targetX-x);
		Prey closest = level.getClosestPreyToLocation(x, y);
		if(closest.hasConfusionActive()) {
			x += speed*time*Math.cos(angle)*-1;
			y += speed*time*Math.sin(angle)*-1;
		}
		else {
			x += speed*time*Math.cos(angle);
			y += speed*time*Math.sin(angle);
		}
		if ( x + getRadius() > 1)
			x = 1 - getRadius();
		if (x - getRadius () < 0)
			x=0+ getRadius();
		if (y + getRadius()> 1)
			y = 1 - getRadius();
		if (y - getRadius()< 0)
			y = 0 + getRadius();
	}

	public void generateNewTargetCoords() {
		targetX = MathUtility.clamp(getRadius(), 1-getRadius(),Math.random());
		targetY = MathUtility.clamp(getRadius(), 1-getRadius(),Math.random());
	}

}
