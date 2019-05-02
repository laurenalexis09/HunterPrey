package edu.etown.utilities;

import java.awt.Color;

public class ColorUtilities {

	
	public static Color getRandomColor() {
		return new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
	}
}
