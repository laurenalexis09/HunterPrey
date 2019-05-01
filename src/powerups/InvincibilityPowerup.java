package powerups;

import java.awt.Color;

import entities.EntityLiving;
import level.Level;

public class InvincibilityPowerup extends Powerup {	

	public InvincibilityPowerup(Level levelIn, double x, double y) {
		super(levelIn);
		this.setPosition(x, y);
		this.setColor(new Color(0,0,255));
		this.name = "invincibility";
		this.effect = new PowerupEffectInvincibility();
	}
	
	public void applyPowerupToEntity(EntityLiving entity) {
		this.setDead();
	}
	

}
