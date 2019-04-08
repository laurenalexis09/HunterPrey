package level;

import biome.Biome;

public class LevelList {
	public static LevelConfiguration[] levels = new LevelConfiguration[] {
			new LevelConfiguration(2,.15,200, Biome.getBiome("Random")),
			new LevelConfiguration(3,.25,200, Biome.getBiome("Random")),
			new LevelConfiguration(3,.25,200, Biome.getBiome("Random")),
			new LevelConfiguration(4,.30,200, Biome.getBiome("Random")),
			new LevelConfiguration(4,.30,200, Biome.getBiome("Random")),
			new LevelConfiguration(5,.30,200, Biome.getBiome("Random")),
			new LevelConfiguration(5,.30,200, Biome.getBiome("Random")),
			new LevelConfiguration(6,.30,200, Biome.getBiome("Random")),
			new LevelConfiguration(6,.30,200, Biome.getBiome("Random")),
	};
	
	public static LevelConfiguration getLevelConfiguration(int number) {
		return levels[number];
	}
	
	public static int getTotalLevels() {
		return levels.length;
	}

}
