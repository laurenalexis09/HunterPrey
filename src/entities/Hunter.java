package entities;
import java.awt.Color;

import level.Level;
import utilities.ColorUtilities;
public class Hunter extends EntityLiving{
	
	public Color color1 = ColorUtilities.getRandomColor(); 

	public double getRadius(){
		return .02;
	}
	
	public Hunter(Level levelIn, double x, double y){
		super(levelIn);
		this.setPosition(x, y);
		this.speed = levelIn.config.hunterSpeed;
	}

	public void update(){
		super.update();
		double time = 0.04;
		Prey[] prey = level.getPreyArray();
		Prey closest = null;
		double closestDistance = Double.POSITIVE_INFINITY;

		for ( int i = 0; i < prey.length; i++){
			if( prey[i].isAlive()){
				double deltaX = prey[i].x-this.x;
				double deltaY = prey[i].y-this.y;
				double distance = Math.sqrt(deltaX*deltaX + deltaY*deltaY);
				if (distance < closestDistance){
					closestDistance = distance;
					closest = prey[i];
				}
			}

		}

		if( closest != null){

			double angle = Math.atan2(closest.y-y, closest.x-x);
			x += speed*time*Math.cos(angle);
			y += speed*time*Math.sin(angle);

			if(closestDistance <= closest.getRadius() + getRadius() ){
				closest.attemptDamageFromSource(this);

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
	
	public boolean canBeDamaged() {
		return false;
	}
	
	public boolean canPickUpPowerup() {
		return false;
	}

}