package render;

import shapes.Circle;
import utilities.ColorUtilities;
import utilities.StdDraw;

public class CircleRenderer {

	public void renderCircleWithCorrectColor(Circle circle) {
		double x = circle.getX();
		double y = circle.getY();
		double radius = circle.getRadius();
		StdDraw.setPenColor(circle.color);
		StdDraw.filledCircle(x, y, radius);
	}
	
	public void renderCircleWithRandomColor(Circle circle) {
		double x = circle.getX();
		double y = circle.getY();
		double radius = circle.getRadius();
		StdDraw.setPenColor(ColorUtilities.getRandomColor());
		StdDraw.filledCircle(x, y, radius);
	}
	
}
