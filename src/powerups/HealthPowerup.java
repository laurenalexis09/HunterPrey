package powerups;

import entities.EntityLiving;
import level.Level;

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
		System.out.println("Entity:HealthPowerup.java, spawned");
	}
	
	public boolean isPowerupInstant() {
		return true;
	}
	
}
