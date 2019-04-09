package level;

import biome.Biome;

public class LevelList {
	public static LevelConfiguration[] levels = new LevelConfiguration[] {
			new LevelConfiguration(2,.15,200, Biome.getBiome("Forest")),
			new LevelConfiguration(3,.25,200, Biome.getBiome("Forest")),
			new LevelConfiguration(3,.25,200, Biome.getBiome("Forest")),
			new LevelConfiguration(3,.25,200, Biome.getBiome("Desert")),
			new LevelConfiguration(4,.30,200, Biome.getBiome("Desert")),
			new LevelConfiguration(4,.30,200, Biome.getBiome("Desert")),
			new LevelConfiguration(5,.30,200, Biome.getBiome("Arctic")),
			new LevelConfiguration(5,.30,200, Biome.getBiome("Arctic")),
			new LevelConfiguration(6,.30,200, Biome.getBiome("Arctic")),
			new LevelConfiguration(6,.30,200, Biome.getBiome("Ocean")),
			new LevelConfiguration(6,.30,200, Biome.getBiome("Ocean")),
			new LevelConfiguration(7,.30,200, Biome.getBiome("Ocean"))
	};
	
	public static LevelConfiguration getLevelConfiguration(int number) {
		return levels[number];
	}
	
	public static int getTotalLevels() {
		return levels.length;
	}

}
