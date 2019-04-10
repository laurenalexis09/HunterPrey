package render;

import entities.Portal;
import utilities.StdDraw;

public class PortalRenderer {

	public void render(Portal portal) {
		StdDraw.setPenColor(portal.color);
		StdDraw.filledCircle(portal.x, portal.y, 0.05);
	}
	
}
