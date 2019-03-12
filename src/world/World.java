package world;

import biome.Biome;
import entities.Difficulty;
import entities.Hunter;
import entities.Prey;

public class World {

	public Hunter[] hunters = new Hunter[1];
	public Prey[] prey = new Prey[1];
	public Biome biome;
	Difficulty dif;

	public World(Biome biome,Difficulty dif) {
		this.biome = biome;
		this.dif = dif;	
		spawnHunters();
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

	}

	private void spawnHunters() {
		for(int i = 0; i < hunters.length; i++)
			hunters[i]= new Hunter(this,Math.random(),Math.random(),dif.getSpeed()); 
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








