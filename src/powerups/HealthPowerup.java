package powerups;

import java.awt.Color;

import entities.EntityLiving;
import level.Level;

public class HealthPowerup extends Powerup{
	
	private int healthBoost = 50;

	public HealthPowerup(Level levelIn, double x, double y) {
		super(levelIn);
		this.setPosition(x, y);
		this.setColor(new Color(255,0,0));
	}
	
	public void applyPowerupToEntity(EntityLiving entity){
		entity.addHealth(healthBoost);
		this.setDead();
	}
	
	public boolean isPowerupInstant() {
		return true;
	}
	
}
