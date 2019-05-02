package edu.etown.biome;

import edu.etown.utilities.ColorUtilities;

public class RandomBiome extends Biome{

	RandomBiome() {
		super(ColorUtilities.getRandomColor());
		biomeColor = ColorUtilities.getRandomColor();
	}
}
