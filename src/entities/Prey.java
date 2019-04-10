package entities;
import java.awt.Color;

import level.Level;
import powerups.Powerup;
import utilities.ColorUtilities;
import utilities.MathUtility;
import utilities.StdDraw;

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

		x = x + xVelocity*speed;
		y = y + yVelocity*speed;

		if( y < 0 )		
			y = 1;					
		else if( y > 1 )
			y = 0;

		if( x < 0 )
			x = 1;
		else if( x > 1 )		
			x = 0;
		if(level.portalSpawned)
			if(MathUtility.getDistance(x,y,level.nextLevelPortal.x,level.nextLevelPortal.y)<.05)
				level.nextLevelPortal.activatePortal();
	}	
}