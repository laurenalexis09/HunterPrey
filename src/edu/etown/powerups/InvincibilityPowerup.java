package edu.etown.powerups;

import edu.etown.entities.EntityLiving;
import edu.etown.level.Level;

public class InvincibilityPowerup extends Powerup {	

	public InvincibilityPowerup(Level levelIn, double x, double y) {
		super(levelIn);
		this.setPosition(x, y);
		this.name = "invincibility";
		this.effect = new PowerupEffectInvincibility();
	}
	
	public void applyPowerupToEntity(EntityLiving entity) {
		this.setDead();
	}
	

}
