package entities;

import level.Level;
import utilities.MathUtility;

public class RandomRadiusHunter extends Hunter{

	double targetX,targetY;

	public RandomRadiusHunter(Level levelIn, double x, double y) {
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
		Prey closest = level.getClosestPreyToLocation(this.x, this.y);
		do {
			targetX = closest.x+Math.random()/4f-1/8f;
			targetY = closest.y+Math.random()/4f-1/8f;
		}while(targetX<0+getRadius() || targetY<0+getRadius()|| targetX>1-getRadius() || targetY>1-getRadius());
	}

}
