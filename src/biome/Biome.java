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
			System.out.println("Forest Biome Spawned");
			return new ForestBiome();
			
		}

		if(input.equalsIgnoreCase("Arctic")){
			System.out.println("Arctic Biome Spawned");
			return new ArcticBiome();
		}
		
		if(input.equalsIgnoreCase("Mars")){
			System.out.println("Mars Biome Spawned");
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
