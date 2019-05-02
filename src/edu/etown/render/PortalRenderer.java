package edu.etown.render;

import edu.etown.entities.Portal;
import edu.etown.utilities.StdDraw;

public class PortalRenderer {

	public void render(Portal portal) {
		StdDraw.setPenColor(portal.color);
		StdDraw.filledCircle(portal.x, portal.y, 0.05);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.circle(portal.x, portal.y, 0.05);
	}
	
}
