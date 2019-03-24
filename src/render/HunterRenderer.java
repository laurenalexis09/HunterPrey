package render;

import java.awt.Color;

import biome.ArcticBiome;
import biome.Biome;
import biome.ForestBiome;
import biome.MarsBiome;
import biome.RandomBiome;
import entities.Hunter;
import utilities.StdDraw;

public class HunterRenderer {

	public void rendeWithPreyAlive(Hunter hunter) {
		Biome biome = hunter.level.getCurrentBiome();
		double x = hunter.x;
		double y = hunter.y;
		Color color1 = hunter.color1;
		if (biome instanceof ArcticBiome) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/1.7));
			StdDraw.filledCircle(x+.01, y+0.01, (getRadius()/1.7));
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/2));
			StdDraw.filledCircle(x+.01, y+0.01, getRadius()/2);
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x, y, (getRadius()));
			StdDraw.filledCircle(x+.01, y, (getRadius()/3));
			StdDraw.filledCircle(x-.01, y, getRadius()/3);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setPenRadius(0.0008);
			StdDraw.circle(x+.01, y, getRadius()/3);
			StdDraw.circle(x-.01, y, getRadius()/3);
			StdDraw.setPenRadius();
			StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
			StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
			StdDraw.setPenRadius();
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			StdDraw.line(x-.01, y-0.01, x+0.01, y-0.01);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
		}
		else if (biome instanceof ForestBiome){
			StdDraw.setPenColor(165, 42, 42);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/1.7));
			StdDraw.filledCircle(x+.01, y+0.01, (getRadius()/1.7));
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/2));
			StdDraw.filledCircle(x+.01, y+0.01, getRadius()/2);
			StdDraw.setPenColor(165, 42, 42);
			StdDraw.filledCircle(x, y, (getRadius()));
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x+.01, y, (getRadius()/3));
			StdDraw.filledCircle(x-.01, y, getRadius()/3);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setPenRadius(0.0008);
			StdDraw.circle(x+.01, y, getRadius()/3);
			StdDraw.circle(x-.01, y, getRadius()/3);
			StdDraw.setPenRadius();
			StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
			StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
			StdDraw.setPenRadius();
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			StdDraw.line(x-.01, y-0.01, x+0.01, y-0.01);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
		}
		else if (biome instanceof MarsBiome){
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/1.7));
			StdDraw.filledCircle(x+.01, y+0.01, (getRadius()/1.7));
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/2));
			StdDraw.filledCircle(x+.01, y+0.01, getRadius()/2);
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledCircle(x, y, (getRadius()));
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x+.01, y, (getRadius()/3));
			StdDraw.filledCircle(x-.01, y, getRadius()/3);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setPenRadius(0.0008);
			StdDraw.circle(x+.01, y, getRadius()/3);
			StdDraw.circle(x-.01, y, getRadius()/3);
			StdDraw.setPenRadius();
			StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
			StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
			StdDraw.setPenRadius();
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			StdDraw.line(x-.01, y-0.01, x+0.01, y-0.01);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
		}
		else if (biome instanceof RandomBiome) {
			StdDraw.setPenColor(color1);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/1.7));
			StdDraw.filledCircle(x+.01, y+0.01, (getRadius()/1.7));
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/2));
			StdDraw.filledCircle(x+.01, y+0.01, getRadius()/2);
			StdDraw.setPenColor(color1);
			StdDraw.filledCircle(x, y, (getRadius()));
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x+.01, y, (getRadius()/3));
			StdDraw.filledCircle(x-.01, y, getRadius()/3);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setPenRadius(0.0008);
			StdDraw.circle(x+.01, y, getRadius()/3);
			StdDraw.circle(x-.01, y, getRadius()/3);
			StdDraw.setPenRadius();
			StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
			StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
			StdDraw.setPenRadius();
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			StdDraw.line(x-.01, y-0.01, x+0.01, y-0.01);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
		}
	}

	public void renderWithNoPreyAlive(Hunter hunter) {
		Biome biome = hunter.level.getCurrentBiome();
		double x = hunter.x;
		double y = hunter.y;
		Color color1 = hunter.color1;
		if (biome instanceof ArcticBiome) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/1.7));
			StdDraw.filledCircle(x+.01, y+0.01, (getRadius()/1.7));
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/2));
			StdDraw.filledCircle(x+.01, y+0.01, getRadius()/2);
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x, y, (getRadius()));
			StdDraw.filledCircle(x+.01, y, (getRadius()/3));
			StdDraw.filledCircle(x-.01, y, getRadius()/3);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setPenRadius();
			StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
			StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
			StdDraw.setPenRadius();
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			StdDraw.filledCircle(x, y-0.01, getRadius()/3.5);
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x, y-0.007, getRadius()/3);
			StdDraw.setPenColor();
			StdDraw.setPenRadius(0.0008);
			StdDraw.circle(x+.01, y, getRadius()/3);
			StdDraw.circle(x-.01, y, getRadius()/3);
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			StdDraw.text(x+0.05, y+0.05, "Yummy! 😋 ");
		}
		else if (biome instanceof ForestBiome){
			StdDraw.setPenColor(165, 42, 42);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/1.7));
			StdDraw.filledCircle(x+.01, y+0.01, (getRadius()/1.7));
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/2));
			StdDraw.filledCircle(x+.01, y+0.01, getRadius()/2);
			StdDraw.setPenColor(165, 42, 42);
			StdDraw.filledCircle(x, y, (getRadius()));
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x+.01, y, (getRadius()/3));
			StdDraw.filledCircle(x-.01, y, getRadius()/3);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setPenRadius();
			StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
			StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
			StdDraw.setPenRadius();
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			StdDraw.filledCircle(x, y-0.01, getRadius()/3.5);
			StdDraw.setPenColor(165, 42, 42);
			StdDraw.filledCircle(x, y-0.007, getRadius()/3);
			StdDraw.setPenColor();
			StdDraw.setPenRadius(0.0008);
			StdDraw.circle(x+.01, y, getRadius()/3);
			StdDraw.circle(x-.01, y, getRadius()/3);
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			//StdDraw.text(x+0.05, y+0.05, "Yummy! 😋 ");
		}		
		else if (biome instanceof MarsBiome){
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/1.7));
			StdDraw.filledCircle(x+.01, y+0.01, (getRadius()/1.7));
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/2));
			StdDraw.filledCircle(x+.01, y+0.01, getRadius()/2);
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledCircle(x, y, (getRadius()));
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x+.01, y, (getRadius()/3));
			StdDraw.filledCircle(x-.01, y, getRadius()/3);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setPenRadius();
			StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
			StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
			StdDraw.setPenRadius();
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			StdDraw.filledCircle(x, y-0.01, getRadius()/3.5);
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledCircle(x, y-0.007, getRadius()/3);
			StdDraw.setPenColor();
			StdDraw.setPenRadius(0.0008);
			StdDraw.circle(x+.01, y, getRadius()/3);
			StdDraw.circle(x-.01, y, getRadius()/3);
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			//StdDraw.text(x+0.05, y+0.05, "Yummy! 😋 ");
		}		
		else if (biome instanceof RandomBiome) {
			StdDraw.setPenColor(color1);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/1.7));
			StdDraw.filledCircle(x+.01, y+0.01, (getRadius()/1.7));
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/2));
			StdDraw.filledCircle(x+.01, y+0.01, getRadius()/2);
			StdDraw.setPenColor(color1);
			StdDraw.filledCircle(x, y, (getRadius()));
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x+.01, y, (getRadius()/3));
			StdDraw.filledCircle(x-.01, y, getRadius()/3);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setPenRadius();
			StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
			StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
			StdDraw.setPenRadius();
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			StdDraw.filledCircle(x, y-0.01, getRadius()/3.5);
			StdDraw.setPenColor(color1);
			StdDraw.filledCircle(x, y-0.007, getRadius()/3);
			StdDraw.setPenColor();
			StdDraw.setPenRadius(0.0008);
			StdDraw.circle(x+.01, y, getRadius()/3);
			StdDraw.circle(x-.01, y, getRadius()/3);
			StdDraw.filledCircle(x, y-0.005, getRadius()/5);
			StdDraw.filledCircle(x+.01, y, getRadius()/5);
			StdDraw.filledCircle(x-.01, y, getRadius()/5);
			//StdDraw.text(x+0.05, y+0.05, "Yummy! 😋 ");
		}
	}

	public double getRadius(){
		return .02;
	}

}
