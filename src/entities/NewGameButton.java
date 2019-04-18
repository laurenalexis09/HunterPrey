package entities;

import java.awt.Font;

import utilities.StdDraw;

public class NewGameButton {

	public double x = 0.94;
	public double y = 0.06;

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
		return .03;
	}

	public void draw() {

		if(x >= 1) {
			x = 0.9;
		}

		if(y >= 1) {
			y = 0.9;
		}

		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledCircle(x, y, 0.05);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.setFont(new Font("Helvetica", Font.ROMAN_BASELINE, 9));
		StdDraw.text(x, y, "New Game");

	}
	

	


}
