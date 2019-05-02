package edu.etown.entities;
import java.awt.Color;

import edu.etown.level.Level;
import edu.etown.utilities.ColorUtilities;
import edu.etown.utilities.MathUtility;
import edu.etown.utilities.StdDraw;

public class Prey extends EntityLiving{

	public Color color = ColorUtilities.getRandomColor();

	public double xVelocity;
	public double yVelocity;

	public Prey(Level levelIn, double x, double y){
		super(levelIn);
		this.setPosition(x,y);
		this.speed = .04;
	}

	public double getRadius(){
		return .01;
	}

	public void update(){
		super.update();
		double mouseX = StdDraw.mouseX();
		double mouseY = StdDraw.mouseY();
		if( mouseX > 0 && mouseX < 1 && mouseY > 0 && mouseY < 1 )
		{ 
			if( mouseX > x )
				xVelocity += 0.025;
			else
				xVelocity -= 0.025;

			if( mouseY > y )
				yVelocity += 0.025;
			else
				yVelocity -= 0.025;

			xVelocity = Math.max( xVelocity, -0.3 );
			xVelocity = Math.min( xVelocity, 0.3 );

			yVelocity = Math.max( yVelocity, -0.3 );
			yVelocity = Math.min( yVelocity, 0.3 );
		}			

		x = x + xVelocity*speed;
		y = y + yVelocity*speed;

		if ( x + getRadius() > 1)
			x = 1 - getRadius();
		if (x - getRadius () < 0)
			x=0+ getRadius(); 
		if (y + getRadius()> 1)
			y = 1 - getRadius();
		if (y - getRadius()< 0)
			y = 0 + getRadius();
		
		if(level.portalSpawned)
			if(MathUtility.getDistance(x,y,level.nextLevelPortal.x,level.nextLevelPortal.y)<.05)
				level.nextLevelPortal.activatePortal();
	}	
}