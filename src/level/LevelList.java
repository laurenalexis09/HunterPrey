package level;

import biome.Biome;
import biome.RandomBiome;

public class LevelList {
	public static LevelConfiguration[] levels = new LevelConfiguration[] {
			new LevelConfiguration(2,.1,200, Biome.getBiome("Random")),
			new LevelConfiguration(3,.1,200, Biome.getBiome("Random")),
			new LevelConfiguration(3,.51,200, Biome.getBiome("Random"))
	};
	
	public static LevelConfiguration getLevelConfiguration(int number) {
		return levels[number];
	}
	
	public static int getTotalLevels() {
		return levels.length;
	}

}
