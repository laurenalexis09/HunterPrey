package entities;
import java.awt.Color;

import javax.swing.*;

import biome.Biome;
import utilities.StdDraw;
public class Hunter {

	private double x;
	private double y;
	private double speed;
	private Biome biome;
	
	Color color1 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)); 

	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}

	public double getRadius(){
		return .02;
	}
	
	public Hunter(double x, double y, double speed,Biome biome){
		this.x=x;
		this.y=y;
		this.speed = speed;
		this.biome = biome;
	}
	
	public void draw(){
		if (biome.getColor() == 1) {
			if(Prey.isAlive()== true) {
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
			else {
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
		}
		else if (biome.getColor() == 2){
			if(Prey.isAlive()== true) {
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
			else {
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
				StdDraw.text(x+0.05, y+0.05, "Yummy! 😋 ");
			}
		}		
		else if (biome.getColor() == 3 ){
			if(Prey.isAlive()== true) {
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
			else {
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
				StdDraw.text(x+0.05, y+0.05, "Yummy! 😋 ");
			}
		}		

		if (biome.getColor() == 4) {
			if(Prey.isAlive()== true) {
				
				
				
				
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
			else {
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
				StdDraw.text(x+0.05, y+0.05, "Yummy! 😋 ");
			}
		}
		
	}

	public void update (double time, Prey[] prey){
		Prey closest = null;
		double closestDistance = Double.POSITIVE_INFINITY;

		for ( int i = 0; i < prey.length; i++){
			if( Prey.isAlive()){
				double deltaX = prey[i].getX()-x;
				double deltaY = prey[i].getY()-y;
				double distance = Math.sqrt(deltaX*deltaX + deltaY*deltaY);
				if (distance < closestDistance){
					closestDistance = distance;
					closest = prey[i];
				}
			}

		}

		if( closest != null){

			double angle = Math.atan2(closest.getY()-y, closest.getX()-x );
			x += speed*time*Math.cos(angle);
			y += speed*time*Math.sin(angle);

			if(closestDistance <= closest.getRadius() + getRadius() ){
				closest.kill();
				
				UIManager.put("OptionPane.okButtonText", "Thanks!");
				JOptionPane.showMessageDialog(null, "Thanks for playing!", "I hope you had fun!", 2);
				
			



			if ( x + getRadius() > 1)
				x = 1 - getRadius();
			if (x - getRadius () < 0)
				x=0+ getRadius();
			if (y + getRadius()> 1)
				y = 1 - getRadius();
			if (y - getRadius()< 0)
				y = 0 + getRadius();

			}
		}

	}

}