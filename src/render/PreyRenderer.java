package render;

import java.awt.Color;

import biome.ArcticBiome;
import biome.Biome;
import biome.ForestBiome;
import biome.MarsBiome;
import biome.RandomBiome;
import entities.Prey;
import utilities.StdDraw;

public class PreyRenderer {

	public void render(Prey prey) {
		Biome biome = prey.world.getCurrentBiome();
		double x = prey.x;
		double y = prey.y;
		Color colors = prey.color;
		if(prey.alive){
			if(biome instanceof ArcticBiome) {
				StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
				StdDraw.setPenRadius(0.003);
				StdDraw.line(x-.005, y, x-.005, y+0.015);
				StdDraw.line(x+.005, y, x+.005, y+0.015);
				StdDraw.setPenRadius(0.001);
				StdDraw.setPenColor();
				StdDraw.line(x-.005, y, x-.005, y+0.015);
				StdDraw.line(x+.005, y, x+.005, y+0.015);
				StdDraw.setPenRadius();
				StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
				StdDraw.filledCircle(x, y, getRadius());
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledCircle(x+.005, y, getRadius()/3);
				StdDraw.filledCircle(x-.005, y, getRadius()/3);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(x+.005, y, getRadius()/5);
				StdDraw.filledCircle(x-.005, y, getRadius()/5);
				StdDraw.filledCircle(x, y - 0.002, getRadius()/6);
				StdDraw.line(x-0.004, y-0.0055, x+0.004, y-0.0055);
			}

			else if (biome instanceof ForestBiome){
				StdDraw.setPenColor(225, 200, 220);
				StdDraw.setPenRadius(0.003);
				StdDraw.line(x-.005, y, x-.005, y+0.015);
				StdDraw.line(x+.005, y, x+.005, y+0.015);
				StdDraw.setPenRadius(0.001);
				StdDraw.setPenColor();
				StdDraw.line(x-.005, y, x-.005, y+0.015);
				StdDraw.line(x+.005, y, x+.005, y+0.015);
				StdDraw.setPenRadius();
				StdDraw.setPenColor(225, 200, 220);
				StdDraw.filledCircle(x, y, getRadius());
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledCircle(x+.005, y, getRadius()/3);
				StdDraw.filledCircle(x-.005, y, getRadius()/3);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(x+.005, y, getRadius()/5);
				StdDraw.filledCircle(x-.005, y, getRadius()/5);
				StdDraw.filledCircle(x, y - 0.002, getRadius()/6);
				StdDraw.line(x-0.004, y-0.0055, x+0.004, y-0.0055);	
			}

			else if(biome instanceof MarsBiome){
				StdDraw.setPenColor(50, 205, 50);
				StdDraw.setPenRadius(0.003);
				StdDraw.line(x-.005, y, x-.005, y+0.015);
				StdDraw.line(x+.005, y, x+.005, y+0.015);
				StdDraw.setPenRadius(0.001);
				StdDraw.setPenColor();
				StdDraw.line(x-.005, y, x-.005, y+0.015);
				StdDraw.line(x+.005, y, x+.005, y+0.015);
				StdDraw.setPenRadius();
				StdDraw.setPenColor(50, 205, 50);
				StdDraw.filledCircle(x, y, getRadius());
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledCircle(x+.005, y, getRadius()/3);
				StdDraw.filledCircle(x-.005, y, getRadius()/3);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(x+.005, y, getRadius()/5);
				StdDraw.filledCircle(x-.005, y, getRadius()/5);
				StdDraw.filledCircle(x, y - 0.002, getRadius()/6);
				StdDraw.line(x-0.004, y-0.0055, x+0.004, y-0.0055);		
			}
			
			else if(biome instanceof RandomBiome){
				StdDraw.setPenColor(colors);
				StdDraw.setPenRadius(0.003);
				StdDraw.line(x-.005, y, x-.005, y+0.015);
				StdDraw.line(x+.005, y, x+.005, y+0.015);
				StdDraw.setPenRadius(0.001);
				StdDraw.setPenColor();
				StdDraw.line(x-.005, y, x-.005, y+0.015);
				StdDraw.line(x+.005, y, x+.005, y+0.015);
				StdDraw.setPenRadius();
				StdDraw.setPenColor(colors);
				StdDraw.filledCircle(x, y, getRadius());
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledCircle(x+.005, y, getRadius()/3);
				StdDraw.filledCircle(x-.005, y, getRadius()/3);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(x+.005, y, getRadius()/5);
				StdDraw.filledCircle(x-.005, y, getRadius()/5);
				StdDraw.filledCircle(x, y - 0.002, getRadius()/6);
				StdDraw.line(x-0.004, y-0.0055, x+0.004, y-0.0055);		
			}
		}
	}
	
	public double getRadius(){
		return .01;
	}
	
}
