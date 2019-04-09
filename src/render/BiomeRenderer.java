package render;

import biome.Biome;
import utilities.StdDraw;

public class BiomeRenderer {

	private CircleRenderer circles = new CircleRenderer();

	public void render(Biome biome) {
		StdDraw.setPenColor(biome.biomeColor);
		StdDraw.filledSquare(5, 5, 5);
		
		for (int i = 0; i < biome.circles.length; i++){
			circles.render(biome.circles[i]);
		}

	}

}
