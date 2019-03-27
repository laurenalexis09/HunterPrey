package biome;

import shapes.StrobeCircle;
import utilities.ColorUtilities;

public class RandomBiome extends Biome{

	RandomBiome() {
		super(ColorUtilities.getRandomColor());
		biomeColor = ColorUtilities.getRandomColor();
	}
}
