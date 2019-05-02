package edu.etown.entities;

import edu.etown.level.Level;

public class TrackerHunter extends Hunter{

	public TrackerHunter(Level levelIn, double x, double y) {
		super(levelIn, x, y);
	}

	public void update(){
		super.update();
		double time = 0.04;
		Prey closest = level.getClosestPreyToLocation(this.x, this.y);
		if( closest != null){
			double angle = Math.atan2(closest.y-y, closest.x-x);
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
	}

}

