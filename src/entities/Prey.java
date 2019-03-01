package entities;
import java.awt.Color;

import biome.Biome;
import utilities.StdDraw;

public class Prey {

	Color colors = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
	
	private double x;
	private double y;
	private static boolean alive = true;
	private double xVelocity;
	private double yVelocity;
	Biome biome;

	public Prey( double x, double y, Biome biome){
		this.x = x;
		this.y = y;
		this.biome = biome;
	}
	
	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}
	public static boolean isAlive(){
		return alive;
	}

	public double getRadius(){
		return .01;
	}

	public boolean kill(){
		return alive = false;
	}

	public void update (double time, double mouseX, double mouseY){
		if(alive){
			if( mouseX > 0 && mouseX < 1 && mouseY > 0 && mouseY < 1 )
			{ 
				if( mouseX > x )
					xVelocity += 0.015;
				else
					xVelocity -= 0.015;

				if( mouseY > y )
					yVelocity += 0.015;
				else
					yVelocity -= 0.015;

				xVelocity = Math.max( xVelocity, -0.3 );
				xVelocity = Math.min( xVelocity, 0.3 );

				yVelocity = Math.max( yVelocity, -0.3 );
				yVelocity = Math.min( yVelocity, 0.3 );
			}			

			x = x + xVelocity*time;
			y = y + yVelocity*time;

			if( y < 0 )		
				y = 1;					
			else if( y > 1 )
				y = 0;

			if( x < 0 )
				x = 1;
			else if( x > 1 )		
				x = 0;
		}


	}	


	public void draw(){
		if(alive){
			if(biome.getColor() == 1) {
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

			else if (biome.getColor() == 2){
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

			else if(biome.getColor() == 3){
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
			
			else if(biome.getColor() == 4){
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

}

