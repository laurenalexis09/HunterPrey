package entities;
import java.awt.Color;

import utilities.ColorUtilities;
import utilities.StdDraw;
import world.World;

public class Prey extends Entity{

	public Color color = ColorUtilities.getRandomColor();

	public boolean alive = true;
	public double xVelocity;
	public double yVelocity;

	public Prey(World worldIn, double x, double y){
		super(worldIn);
		this.setPosition(x,y);
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}
	public boolean isAlive(){
		return alive;
	}

	public double getRadius(){
		return .01;
	}

	public boolean kill(){
		return alive = false;
	}

	public void update(){
		double time = 0.04;
		double mouseX = StdDraw.mouseX();
		double mouseY = StdDraw.mouseY();
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