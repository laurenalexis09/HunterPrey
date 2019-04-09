package biome;
import java.awt.Color;

import shapes.Circle;

public abstract class Biome {
	public Color circleColor;
	public Color biomeColor;
	public Circle[] circles = new Circle[20];
	Biome(Color circleColor){
		this.circleColor = circleColor;
		spawnCircles();
	}
	
	public void spawnCircles() {
		for(int i=0;i<circles.length;i++)
			circles[i] = new Circle(Math.random(),Math.random(),circleColor);
	}
	
	public static Biome getBiome(String input) {
		if(input.equalsIgnoreCase("Forest")){
			return new ForestBiome();
		}

		if(input.equalsIgnoreCase("Arctic")){
			return new ArcticBiome();
		}

		if(input.equalsIgnoreCase("Desert")){
			return new DesertBiome();
		}

		if(input.equalsIgnoreCase("Random")){
			return new RandomBiome();
		}
		return new RandomBiome();//too lazy to input a biome? strobe lights it is then.
	}
	
	public void update() {
	}
	
}
