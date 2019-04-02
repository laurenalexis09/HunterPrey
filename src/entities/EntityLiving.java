package entities;

import level.Level;
import powerups.Powerup;
import utilities.MathUtility;

public abstract class EntityLiving extends Entity{

	boolean isHurt = false;
	int hurtCooldown = 5;
	int currentHurt = 0;
	
	public double health = 100;
	public	double maxHealth = health;
	
	public double speed;

	public double attackDamage = 10;

	public EntityLiving(Level levelIn) {
		super(levelIn);
	}

	public void update() {
		if(health<=0) {
			setDead();
			return;
		}
		if(this.canPickUpPowerup())
			pickUpNearbyPowerups();
		manageHealth();
		if(isHurt)
			updateHurt();
	}
	
	private void manageHealth() {
		if(health>maxHealth)
			health=maxHealth;
	}

	private void pickUpNearbyPowerups() {
		for(int i=0;i<level.powerups.size();i++) {
			Powerup power = level.powerups.get(i);
			if(MathUtility.getDistance(x,y,power.x,power.y)<.05)
				power.applyPowerupToEntity(this);
		}
	}
	
	public void addHealth(double amount) {
		this.health += amount;
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
	
	public boolean canPickUpPowerup() {
		return true;
	}

}
