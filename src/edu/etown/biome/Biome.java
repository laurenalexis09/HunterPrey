package edu.etown.biome;
import java.awt.Color;

public abstract class Biome {
	public Color circleColor;
	public Color biomeColor;
	Biome(Color circleColor){
		this.circleColor = circleColor;
	}
	
	public static Biome getBiome(String input) {
		if(input.equalsIgnoreCase("Forest")){
			return new ForestBiome();
			
		}

		if(input.equalsIgnoreCase("Arctic")){
			return new ArcticBiome();
		}
		
		if(input.equalsIgnoreCase("Mars")){
			return new MarsBiome();
		}

		if(input.equalsIgnoreCase("Random")){
			return new RandomBiome();
		}
		return new RandomBiome();//too lazy to input a biome? strobe lights it is then.
	}
	
	public void update() {
	}
	
}
