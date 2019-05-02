package edu.etown.level;

import edu.etown.biome.Biome;

public class LevelList {
	public static LevelConfiguration[] levels = new LevelConfiguration[] {
			new LevelConfiguration(4,.24,200, Biome.getBiome("Forest")),
			new LevelConfiguration(5,.26,200, Biome.getBiome("Forest")),
			new LevelConfiguration(5,.28,200, Biome.getBiome("Forest")),
			new LevelConfiguration(5,.3,200, Biome.getBiome("Mars")),
			new LevelConfiguration(6,.32,200, Biome.getBiome("Mars")),
			new LevelConfiguration(6,.32,200, Biome.getBiome("Mars")),
			new LevelConfiguration(7,.32,200, Biome.getBiome("Arctic")),
			new LevelConfiguration(7,.33,200, Biome.getBiome("Arctic")),
			new LevelConfiguration(8,.33,200, Biome.getBiome("Arctic")),
			new LevelConfiguration(8,.33,200, Biome.getBiome("Random")),
			new LevelConfiguration(8,.34,200, Biome.getBiome("Random")),
			new LevelConfiguration(9,.34,200, Biome.getBiome("Random"))
	};
	
	public static LevelConfiguration getLevelConfiguration(int number) {
		return levels[number];
	}
	
	public static int getTotalLevels() {
		return levels.length;
	}

}
