package edu.etown.render;

import edu.etown.shapes.Circle;
import edu.etown.utilities.StdDraw;

public class CircleRenderer {

	public void render(Circle circle) {
		double x = circle.x;
		double y = circle.y;
		double radius = circle.getRadius();
		StdDraw.setPenColor(circle.color);
		StdDraw.filledCircle(x, y, radius);
	}
	
}
