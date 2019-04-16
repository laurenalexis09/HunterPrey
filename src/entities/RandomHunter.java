package entities;

import level.Level;
import utilities.MathUtility;

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
		x += speed*time*Math.cos(angle);
		y += speed*time*Math.sin(angle);
	}
	
	public void generateNewTargetCoords() {
		Prey closest = level.getClosestPreyToLocation(this.x, this.y);
		do {
		targetX = closest.x+Math.random()/4f-1/8f;
		targetY = closest.y+Math.random()/4f-1/8f;
		if(targetX<0 || targetY<0 || targetX>1 || targetY>1)
		System.out.println(targetX + " " + targetY);
		}while(targetX<0 || targetY<0 || targetX>1 || targetY>1);
	}

}
