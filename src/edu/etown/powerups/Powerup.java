package edu.etown.powerups;

import java.awt.Color;

import edu.etown.entities.Entity;
import edu.etown.entities.EntityLiving;
import edu.etown.level.Level;

public abstract class Powerup extends Entity{
	
	public Color color;
	public String name;
	public PowerupEffect effect;

	public Powerup(Level levelIn) {
		super(levelIn);
	}

	@Override
	public void update() {
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void applyPowerupToEntity(EntityLiving entity);
	
	public boolean isPowerupInstant() {
		return false;
	}

}
