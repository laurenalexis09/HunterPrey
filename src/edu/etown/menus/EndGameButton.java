package edu.etown.menus;

import java.awt.Font;

import edu.etown.utilities.StdDraw;

public class EndGameButton {

	public double x;
	public double y;
	public double radius = 0.07;

	public EndGameButton() {
	}

	public void update() {

		if(x >= 1) {
			x = 0.9;
		}

		if(y >= 1) {
			y = 0.9;
		}

	}

	 public double getRadius() {
		return radius;
	}
	 
	 public void setRadius(double radius) {
		 this.radius = radius;
	 }

	public void draw() {

		if(x >= 1) {
			x = 0.9;
		}

		if(y >= 1) {
			y = 0.9;
		}

		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.filledCircle(x, y, radius);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.setFont(new Font("Helvetica", Font.ROMAN_BASELINE, 12));
		StdDraw.text(x, y, "Exit");

	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	


}
