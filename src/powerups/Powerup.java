package powerups;

import java.awt.Color;

import entities.Entity;
import entities.EntityLiving;
import level.Level;

public abstract class Powerup extends Entity{
	
	public Color color = new Color(255,0,0);

	public Powerup(Level levelIn) {
		super(levelIn);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract void applyPowerupToEntity(EntityLiving entity);
	
	public boolean isPowerupInstant() {
		return false;
	}

}
