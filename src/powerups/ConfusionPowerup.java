package powerups;

import entities.EntityLiving;
import level.Level;

public class ConfusionPowerup extends Powerup{

	public ConfusionPowerup(Level levelIn, double x, double y) {
		super(levelIn);
		this.setPosition(x, y);
		this.name = "confusion";
		this.effect = new ConfusionPowerupEffect();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyPowerupToEntity(EntityLiving entity) {
		this.setDead();
		System.out.println("Entity: ConfusionPowerup.java, spawned");
	}

}
