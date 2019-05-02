package edu.etown.shapes;

import java.awt.Color;

public class Shape {
	public double x;
	public double y;
	public Color color;
	
	public void setPosition(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
}
