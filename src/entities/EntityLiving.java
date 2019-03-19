package entities;

import level.Level;

public abstract class EntityLiving extends Entity{
	
	boolean isHurt = false;
	double health = 100;
	
	public boolean alive = true;
	public double attackDamage = 10;

	public EntityLiving(Level levelIn) {
		super(levelIn);
	}
	
	public void update() {
		if(health<=0) {
			setDead();
			return;
		}
		isHurt = false;
	}
	
	public void attemptDamageFromSource(EntityLiving source) {
		if(!canBeDamaged()) {
			return;
		}
		else {
			damageFromSource(source.attackDamage);
		}
	}
	
	public void damageFromSource(double damage) {
		this.health-=damage;
		System.out.println("Remaining Health: " + health);
	}
	
	public boolean canBeDamaged() {
		return true;
	}
	
	public boolean isAlive(){
		return alive;
	}
	
	public boolean setDead(){
		return alive = false;
	}

}
