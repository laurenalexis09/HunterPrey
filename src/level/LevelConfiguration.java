package level;

import biome.Biome;

public class LevelConfiguration{

	int hunterAmount;
	double hunterSpeed;
	int timeTillPortalSpawn;
	Biome levelBiome;

	public LevelConfiguration(int hunterAmount,double speed,int timeTillPortalSpawn, Biome levelBiome) {
		this.hunterAmount = hunterAmount;
		this.hunterSpeed=speed;
		this.timeTillPortalSpawn = timeTillPortalSpawn;
		this.levelBiome = levelBiome;
	}

}