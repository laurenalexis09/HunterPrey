package powerups;

import java.util.Timer;

import entities.EntityLiving;
import level.Level;



public class InvincibilityPowerup extends Powerup {
	

	public InvincibilityPowerup(Level levelIn, double x, double y) {
		super(levelIn);
		this.setPosition(x, y);
	}
	
	public void applyPowerupToEntity(EntityLiving entity) {
		entity.invincible();
		this.setDead();
		
	}
	

}
