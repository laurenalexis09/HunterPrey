package entities;
import java.awt.Color;

import level.Level;
import utilities.ColorUtilities;
import utilities.MathUtility;
public abstract class Hunter extends EntityLiving{
	
	public Color color1 = ColorUtilities.getRandomColor(); 

	public double getRadius(){
		return .02;
	}
	
	public Hunter(Level levelIn, double x, double y){
		super(levelIn);
		this.setPosition(x, y);
		this.speed = levelIn.config.hunterSpeed;
	}

	public void update() {
		super.update();
		Prey[] prey = level.getPreyArray();
		for(int i=0;i<prey.length;i++) {
			if(MathUtility.getDistance(prey[i].x, prey[i].y, this.x, this.y) <= prey[i].getRadius() + getRadius())
				prey[i].attemptDamageFromSource(this);
		}
	}
	
	public boolean canBeDamaged() {
		return false;
	}
	
	public boolean canPickUpPowerup() {
		return false;
	}

}