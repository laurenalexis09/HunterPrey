package edu.etown.powerups;

import edu.etown.entities.EntityLiving;
import edu.etown.level.Level;

public class HealthPowerup extends Powerup{
	
	private int healthBoost = 50;

	public HealthPowerup(Level levelIn, double x, double y) {
		super(levelIn);
		this.setPosition(x, y);
		this.name = "health";
	}
	
	public void applyPowerupToEntity(EntityLiving entity){
		entity.addHealth(healthBoost);
		this.setDead();
	}
	
	public boolean isPowerupInstant() {
		return true;
	}
	
}
