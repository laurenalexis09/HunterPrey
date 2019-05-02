package render;

import entities.Portal;
import utilities.StdDraw;

public class PortalRenderer {

	public void render(Portal portal) {
		StdDraw.setPenColor(portal.color);
		StdDraw.filledCircle(portal.x, portal.y, 0.05);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.setPenRadius(.005);
		StdDraw.circle(portal.x, portal.y, 0.05);
	}
	
}
