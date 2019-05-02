package edu.etown.entities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import edu.etown.level.Level;
import edu.etown.powerups.Powerup;
import edu.etown.powerups.PowerupEffect;
import edu.etown.utilities.MathUtility;

public abstract class EntityLiving extends Entity{

	boolean isHurt = false;
	boolean canBeDamaged = true;
	int hurtCooldown = 5;
	int currentHurt = 0;

	public double health = 100;
	public	double maxHealth = health;

	public double speed;

	public double attackDamage = 10;

	HashMap<String,PowerupEffect> activePowerups = new HashMap<>();

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
		checkForExpiredPowerups();
	}
	
	private void checkForExpiredPowerups() {
		@SuppressWarnings("rawtypes")
		Iterator temp = activePowerups.entrySet().iterator();
		while (temp.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry)temp.next();
			activePowerups.get(pair.getKey()).update();
			if(activePowerups.get(pair.getKey()).expired)
				activePowerups.remove(pair.getKey());
		}
	}

	private void manageHealth() {
		if(health>maxHealth)
			health=maxHealth;
	}

	private void pickUpNearbyPowerups() {
		for(int i=0;i<level.powerups.size();i++) {
			Powerup power = level.powerups.get(i);
			if(MathUtility.getDistance(x,y,power.x,power.y)<.05) {
				if(!power.isPowerupInstant())
					activePowerups.put(power.name,power.effect);
				power.applyPowerupToEntity(this);
				System.out.println("entities: EntityLiving.java, picked up powerup " + power.name);
			}
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
		if(!canBeDamaged || isHurt || activePowerups.containsKey("invincibility")) {
			System.out.println("entities: EntityLiving.java, didn't take damage");
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
	}
	
	public boolean hasConfusionActive() {
		if(activePowerups.containsKey("confusion")) {
			return true;
		}
		return false;
	}

	public boolean canPickUpPowerup() {
		return true;
	}

}