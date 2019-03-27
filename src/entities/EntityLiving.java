package entities;

import level.Level;

public abstract class EntityLiving extends Entity{

	boolean isHurt = false;
	int hurtCooldown = 5;
	int currentHurt = 0;
	
	public double health = 100;
	public	double maxHealth = health;

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
		if(isHurt)
			updateHurt();
	}
	
	private void updateHurt() {
		currentHurt--;
		if(currentHurt==0)
			isHurt = false;
	}

	public void attemptDamageFromSource(EntityLiving source) {
		if(!canBeDamaged() || isHurt) {
			return;
		}
		else {
			damageFromSource(source.attackDamage);
		}
	}

	public void damageFromSource(double damage) {
		this.health-=damage;
		this.isHurt = true;
		this.currentHurt = hurtCooldown;
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
