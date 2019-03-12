package biome;

import shapes.StrobeCircle;
import utilities.ColorUtilities;

public class RandomBiome extends Biome{

	RandomBiome() {
		super(ColorUtilities.getRandomColor());
		biomeColor = ColorUtilities.getRandomColor();
	}
	
	public void update() {
		for(int i=0;i<circles.length;i++)
			((StrobeCircle) circles[i]).update();
	}
	
	public void spawnCircles() {
		for(int i=0;i<circles.length;i++)
			circles[i] = new StrobeCircle(Math.random(),Math.random(),circleColor);
	}

}
