package biome;

import utilities.ColorUtilities;

public class RandomBiome extends Biome{

	RandomBiome() {
		super(ColorUtilities.getRandomColor());
		biomeColor = ColorUtilities.getRandomColor();
	}

}
