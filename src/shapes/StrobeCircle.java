package shapes;

import java.awt.Color;

import utilities.ColorUtilities;

public class StrobeCircle extends Circle{

	public StrobeCircle(double x,double y,Color color) {
		super(x,y,color);
	}
	
	public void update() {
		this.color = ColorUtilities.getRandomColor();
	}
	
}
