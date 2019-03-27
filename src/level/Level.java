package level;

import biome.Biome;
import entities.Hunter;
import entities.Prey;

public class Level {
	
	public Hunter[] hunters;
	public Prey[] prey = new Prey[1];
	public Biome biome;
	
	public int levelTicks = 0;
	public int portalSpawnTicks;
	
	boolean portalSpawned = false;

	public Level(LevelConfiguration config) {
		biome = config.levelBiome;
		this.portalSpawnTicks = config.timeTillPortalSpawn;
		hunters = new Hunter[config.hunterAmount];
		spawnHunters(config.hunterSpeed);
		spawnPrey();
	}

	public void update() {
		biome.update();
		for(int i =0; i < prey.length; i++){
			if(prey[i].isAlive())
				prey[i].update();
		}
		for(int i =0; i < hunters.length; i++){
			hunters[i].update();
		}
		levelTicks++;
	}

	private void spawnHunters(double speed) {
		for(int i = 0; i < hunters.length; i++)
			hunters[i]= new Hunter(this,Math.random(),Math.random(),speed); 
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
	
}