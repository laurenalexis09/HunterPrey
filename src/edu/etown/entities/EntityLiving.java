package edu.etown.entities;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;

import edu.etown.level.Level;
import edu.etown.powerups.Powerup;
import edu.etown.powerups.PowerupEffect;
import edu.etown.utilities.MathUtility;
import edu.etown.sounds.SoundProcessor;

public abstract class EntityLiving extends Entity{
	SoundProcessor soundProcessor = new SoundProcessor();
	boolean isHurt = false;
	boolean canBeDamaged = true;
	int hurtCooldown = 5;
	int currentHurt = 0;
	int randomSound;
	public double health = 100;
	public	double maxHealth = health;
	String[] sounds = new String[7];
	{
	sounds[0] = "/edu/etown/sounds/waha.wav";
	sounds[1] = "/edu/etown/sounds/yahoo.wav";
	sounds[2] = "/edu/etown/sounds/yippee.wav";
	sounds[3] = "/edu/etown/sounds/oof.wav";
	sounds[4] = "/edu/etown/sounds/doh.wav";
	sounds[5] = "/edu/etown/sounds/ungh.wav";
	sounds[6] = "/edu/etown/sounds/whoa.wav";
	}

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
			if(activePowerups.get(pair.getKey()).expired) {
				activePowerups.remove(pair.getKey());
				System.out.println("Entities: EntityLiving.java, powerup is removed");
			}
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
				randomSound = (int) Math.floor(Math.random() * 3); 
				soundProcessor.playSound(sounds[randomSound]);
				System.out.println("entities: EntityLiving.java, picked up powerup " + power.name);
			}
		}
	}

	public void addHealth(double amount) {
		this.health += amount;
		System.out.print("Entities: EntityLiving.java, health added");
	}

	private void updateHurt() {
		currentHurt--;
		if(currentHurt==0)
			isHurt = false;
	}

	public void attemptDamageFromSource(EntityLiving source) {
		
		if(!canBeDamaged || isHurt || activePowerups.containsKey("invincibility")) {
			System.out.println("entities: EntityLiving.java, didnt take damage");
			return;
		}
		else {
			damageFromSource(source.attackDamage);
			randomSound = (int) Math.floor(Math.random() * 4) + 3;
			soundProcessor.playSound(sounds[randomSound]);
			
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