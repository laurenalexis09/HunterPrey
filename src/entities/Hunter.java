package entities;
import java.awt.Color;

import utilities.ColorUtilities;
import world.World;
public class Hunter extends Entity{
	
	private double speed;
	
	public Color color1 = ColorUtilities.getRandomColor(); 

	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}

	public double getRadius(){
		return .02;
	}
	
	public Hunter(World worldIn, double x, double y, double speed){
		super(worldIn);
		this.setPosition(x, y);
		this.speed = speed;
	}

	public void update(){
		double time = 0.04;
		Prey[] prey = world.getPreyArray();
		Prey closest = null;
		double closestDistance = Double.POSITIVE_INFINITY;

		for ( int i = 0; i < prey.length; i++){
			if( prey[i].isAlive()){
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