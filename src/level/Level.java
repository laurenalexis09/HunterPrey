package level;

import java.util.LinkedList;

import biome.Biome;
import entities.Hunter;
import entities.Portal;
import entities.Prey;
import entities.RandomHunter;
import entities.TrackerHunter;
import powerups.HealthPowerup;
import powerups.InvincibilityPowerup;
import powerups.Powerup;
import utilities.MathUtility;

public class Level {

	public LevelConfiguration config;

	public LinkedList<Powerup> powerups = new LinkedList<>();
	public Hunter[] hunters;
	public Prey[] prey = new Prey[1];
	public Biome biome;

	public Portal nextLevelPortal;

	public int levelTicks = 0;
	public int portalSpawnTicks;

	public boolean portalSpawned = false;

	public boolean levelCompleted = false;

	public Level(LevelConfiguration config) {
		this.config = config;
		biome = config.levelBiome;
		this.portalSpawnTicks = config.timeTillPortalSpawn;
		hunters = new Hunter[config.hunterAmount];
		spawnPrey();
		spawnHunters(config.hunterSpeed);
	}

	public void update() {
		biome.update();
		trySpawnPowerup();
		for(int i =0; i < prey.length; i++){
			if(prey[i].isAlive())
				prey[i].update();
		}
		for(int i =0; i < hunters.length; i++){
			hunters[i].update();
		}
		levelTicks++;
		if(levelTicks==portalSpawnTicks) {
			portalSpawned=true;
			spawnPortal();
		}
		cleanupDeadEntities();
	}

	private void cleanupDeadEntities() {
		for (int i = powerups.size()-1; i>=0; i--){
			if(!powerups.get(i).isAlive())
				powerups.remove(i);
		}

	}

	private void trySpawnPowerup() {
		if(portalSpawned)
			return;
		if(Math.random()<.01) {
			spawnRandomPowerup();
		}
	}

	private void spawnRandomPowerup() {
		if(Math.random()<.5)
			powerups.add(new HealthPowerup(this,Math.random(),Math.random()));
		else
			powerups.add(new InvincibilityPowerup(this,Math.random(),Math.random()));
	}

	private void spawnHunters(double speed) {
		hunters[0] = new TrackerHunter(this,Math.random(),Math.random()); 
		for(int i = 1; i < hunters.length; i++)
			hunters[i]= new RandomHunter(this,Math.random(),Math.random()); 
	}

	private void spawnPrey() {
		for(int i = 0; i < prey.length; i++)
			prey[i]= new Prey(this,Math.random(), Math.random());
	}

	public boolean isAtLeastOnePreyAlive() {//if we decide to add the option for more than one prey to exist on the board at a time (planning for the future)
		for(Prey current: prey)
			if(current.isAlive())
				return true;
		return false;
	}

	public Biome getCurrentBiome() {
		return biome;
	}

	public Prey[] getPreyArray() {
		return prey;
	}

	public void spawnPortal() {
		nextLevelPortal = new Portal(this,Math.random(),Math.random());
	}

	public void completeLevel() {
		levelCompleted = true;
	}

	public Prey getClosestPreyToLocation(double x,double y) {
		double distance = 2;
		double tempDistance;
		Prey closest = null;
		for(int i=0;i<prey.length;i++) {
			tempDistance = MathUtility.getDistance(x, y, prey[i].x, prey[i].y);
			if(tempDistance<distance) {
				closest = prey[i];
				distance = tempDistance;
			}
		}
		return closest;
	}

}