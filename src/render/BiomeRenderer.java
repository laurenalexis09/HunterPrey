package render;

import biome.Biome;
import biome.RandomBiome;
import utilities.StdDraw;

public class BiomeRenderer {

	private CircleRenderer circles = new CircleRenderer();

	public void render(Biome biome) {
		StdDraw.setPenColor(biome.biomeColor);
		StdDraw.filledSquare(5, 5, 5);
		if(biome instanceof RandomBiome) {
			System.out.println("true");
			for (int i = 0; i < biome.circles.length; i++){
				circles.renderCircleWithRandomColor(biome.circles[i]);
			}
		}
		else {
			for (int i = 0; i < biome.circles.length; i++){
				circles.renderCircleWithCorrectColor(biome.circles[i]);
			}
		}
	}

}
