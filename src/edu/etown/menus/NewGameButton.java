package edu.etown.menus;

import java.awt.Font;

import edu.etown.utilities.StdDraw;

public class NewGameButton {

	public double x = 0.94;
	public double y = 0.06;
	public double radius = 0.05;
	public int fontSize = 9;
	public String text = "New Game";

	public NewGameButton() {
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
	 
	 public int getFontSize() {
		 return fontSize;
	 }
	 
	 public void setFontSize(int fontSize) {
		 this.fontSize = fontSize;
	 }
	 
	 
	 public String getText() {
		return text;
		 
	 }
	 
	 public void setText(String text) {
		 this.text = text;
	 }
	 

	public void draw() {

		if(x >= 1) {
			x = 0.9;
		}

		if(y >= 1) {
			y = 0.9;
		}

		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledCircle(x, y, radius);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.setFont(new Font("Helvetica", Font.ROMAN_BASELINE, fontSize));
		StdDraw.text(x, y, text);

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
