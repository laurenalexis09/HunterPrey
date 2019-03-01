package biome;
import shapes.Circle;

public abstract class Biome {
	int color;
	Circle[] circles = new Circle[5];
	Biome(int color){
		this.color=color;
		spawnCircles();
	}
	
	public void spawnCircles() {
		for(int i=0;i<circles.length;i++)
			circles[i] = new Circle(Math.random(),Math.random(),color);
	}
	
	public int getColor() {
		return color;
	}
	
	public void draw() {
		for (int i = 0; i < circles.length; i++){
			circles[i].draw();
			
		}
	}
	
	public static Biome getBiome(String input) {
		if(input.equalsIgnoreCase("Forest")){
			return new ForestBiome(2);
		}

		if(input.equalsIgnoreCase("Arctic")){
			return new ArcticBiome(1);
		}

		if(input.equalsIgnoreCase("Mars")){
			return new MarsBiome(3);
		}

		if(input.equalsIgnoreCase("Random")){
			return new RandomBiome(4);
		}
		return new RandomBiome(4);//too lazy to input a biome? strobe lights it is then.
	}
	
}
