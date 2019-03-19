import java.awt.Color;

public class Prey {

	Color colors = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
	
	private double x;
	private double y;
	private static boolean alive;
	private double xVelocity;
	private double yVelocity;
	double radius = 0.01;

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


	public Prey( double x, double y ){
		this.x = x;
		this.y = y;
		alive = true;
	}

	public void update (double time, double mouseX, double mouseY){
		if(alive){
			if( mouseX > 0 && mouseX < 1 && mouseY > 0 && mouseY < 1 )
			{ 
				if( mouseX > x )
					setxVelocity(getxVelocity() + 0.015);
				else
					setxVelocity(getxVelocity() - 0.015);

				if( mouseY > y )
					yVelocity += 0.015;
				else
					yVelocity -= 0.015;

				setxVelocity(Math.max( getxVelocity(), -0.3 ));
				setxVelocity(Math.min( getxVelocity(), 0.3 ));

				yVelocity = Math.max( yVelocity, -0.3 );
				yVelocity = Math.min( yVelocity, 0.3 );
			}			

			x = x + getxVelocity()*time;
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

			StdDraw.setPenColor(225, 200, 220);
			StdDraw.setPenRadius(0.003);
			StdDraw.filledCircle(x-.006, y+0.009, radius/1.5); //left ear outer
			StdDraw.filledCircle(x+.006, y+0.009, radius/1.5); //right ear outer
			StdDraw.setPenRadius(0.001);
			StdDraw.setPenColor();
			StdDraw.filledCircle(x-.006, y+0.009, radius/2.5); //left ear inner
			StdDraw.filledCircle(x+.006, y+0.009, radius/2.5); //right ear inner
			StdDraw.setPenRadius();
			StdDraw.setPenColor(225, 200, 220);
			StdDraw.filledCircle(x, y, radius);
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(x+.005, y, radius/3); //white part of left eye
			StdDraw.filledCircle(x-.005, y, radius/3); //white part of right eye
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(x+.005, y, radius/5); //black part of left eye
			StdDraw.filledCircle(x-.005, y, radius/5); //black part of right eye
			StdDraw.filledCircle(x, y - 0.002, radius/6); //nose
			StdDraw.line(x-0.004, y-0.0055, x+0.004, y-0.0055);	//mouth
			

		}

	}

	public double getxVelocity() {
		return xVelocity;
	}

	public void setxVelocity(double xVelocity) {
		this.xVelocity = xVelocity;
	}
	
static void end() {
		
		int options = (int)(Math.random())*4+1;

		switch(options) {

		case 1:
			new ButtonPractice();
			break;
			
		//case 2:
			

		}
		
	}

}

