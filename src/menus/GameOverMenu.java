package menus;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import entities.EndGameButton;
import menus.NewGameButton;
import main.HunterPrey;
import utilities.MathUtility;
import utilities.StdDraw;

public class GameOverMenu {
	
	public static int instanceCode = 0;
	
	public GameOverMenu() {
		
		NewGameButton button = new NewGameButton();
		button.setX(0.25);
		button.setY(0.25);
		button.setRadius(0.07);
		button.setFontSize(10);
		EndGameButton button2 = new EndGameButton();
		button2.setX(0.75);
		button2.setY(0.25);
		
		do {

			button.update();
			button2.update();

			StdDraw.enableDoubleBuffering();

			DrawBackground();

			Font font1 = new Font("Helvetica", Font.BOLD, 60);
			StdDraw.setFont(font1);
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.text(0.5, 0.80, "Game Over!");
			StdDraw.setPenColor(128,166,206);
			StdDraw.text(0.502, 0.8002, "Game Over!");
			StdDraw.setPenColor(StdDraw.WHITE);
			Font font2 = new Font("Helvetica", Font.ITALIC, 30);
			StdDraw.setFont(font2);
			StdDraw.text(0.5, 0.73, "Thanks for playing");
			StdDraw.setPenColor(128,166,206);
			StdDraw.text(0.502, 0.7302, "Thanks for playing");

			DrawBigBear(0.50, 0.50, 0.15);

			button.draw();
			button2.draw();


			StdDraw.show();


			StdDraw.clear();

			if(StdDraw.isMousePressed()) {
				double distance = button.getRadius();
				double dis = MathUtility.getDistance(StdDraw.mouseX(), StdDraw.mouseY(), button.x, button.y);
				double dis2 = MathUtility.getDistance(StdDraw.mouseX(), StdDraw.mouseY(), button2.x, button2.y);
				if(dis <= distance ) {
					break;
				}
				if(dis2 <= distance) {
					StdDraw.frame.dispose();
					return;
				}
			}

		}while(true);
		new HunterPrey().run();
	}

	public static void DrawBigBear(double x, double y, double radius) {
		StdDraw.setPenColor(165, 42, 42);
		StdDraw.filledCircle(x-.075, y+.075, (radius/1.7));
		StdDraw.filledCircle(x+.075, y+.075, (radius/1.7));
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x-.075, y+0.075, (radius/2));
		StdDraw.filledCircle(x+.075, y+0.075, radius/2);
		StdDraw.setPenColor(165, 42, 42);
		StdDraw.filledCircle(x, y, (radius));
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x+.075, y, (radius/3));
		StdDraw.filledCircle(x-.075, y, radius/3);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.0008);
		StdDraw.circle(x+.075, y, radius/3);
		StdDraw.circle(x-.075, y, radius/3);
		StdDraw.setPenRadius(0.008);
		//StdDraw.line(x-0.09, y+0.08, x-0.03, y+0.02);
		//StdDraw.line(x+0.03, y+0.02, x+0.09, y+0.08);
		StdDraw.setPenRadius();
		StdDraw.filledCircle(x, y-0.05, radius/5);
		StdDraw.filledCircle(x+.075, y, radius/5);
		StdDraw.filledCircle(x-.075, y, radius/5);
		StdDraw.setPenRadius(0.008);
		//StdDraw.line(x-.1, y-0.09, x+0.1, y-0.09);
		StdDraw.arc(x, y-0.06, 0.06, 180, 0);
	}
	

public static void DrawBackground() {

	StdDraw.setPenColor(new Color(8,25,47));
	StdDraw.filledRectangle(0.830, 0.5, 0.168, 1);

	StdDraw.setPenColor(new Color(255,255,255));
	StdDraw.setPenRadius(0.004);
	StdDraw.point(.95, .90);
	StdDraw.point(.90, .64);
	StdDraw.point(.83, .71);
	StdDraw.point(.71, .53);
	StdDraw.point(.69, .95);

	StdDraw.setPenColor(StdDraw.RED);
	StdDraw.filledCircle(.825, -0.5, 1);
	StdDraw.setPenColor(new Color(137,0,0));
	StdDraw.filledEllipse(0.75, 0.45, 0.03, 0.02);
	StdDraw.filledEllipse(0.67, 0.05, 0.15, 0.07);
	StdDraw.filledEllipse(0.93, 0.27, 0.05, 0.03);
	StdDraw.setPenColor(new Color(80,0,0));
	StdDraw.filledEllipse(0.75, 0.4444, 0.024, 0.015);
	StdDraw.filledEllipse(0.67, 0.04, 0.14, 0.06);
	StdDraw.filledEllipse(0.93, 0.26, 0.04, 0.02);



	StdDraw.setPenColor(StdDraw.BOOK_BLUE);
	StdDraw.filledRectangle(0.5, 0.5, 0.165, 1);
	StdDraw.setPenColor(new Color(30,51,2));
	StdDraw.filledRectangle(0.5, 0, 0.165, 0.45);

	StdDraw.setPenColor(StdDraw.YELLOW);
	StdDraw.filledCircle(0.30, 0.95, 0.25);

	StdDraw.setPenColor(new Color(0,82,33));
	StdDraw.filledCircle(0.44, 0.450, 0.04);
	StdDraw.filledCircle(0.46, 0.470, 0.04);
	StdDraw.filledCircle(0.42, 0.460, 0.04);
	StdDraw.filledCircle(0.40, 0.450, 0.04);
	StdDraw.filledCircle(0.38, 0.470, 0.04);
	StdDraw.filledCircle(0.42, 0.450, 0.04);
	StdDraw.filledCircle(0.49, 0.460, 0.04);
	StdDraw.filledCircle(0.51, 0.450, 0.04);
	StdDraw.filledCircle(0.53, 0.470, 0.04);
	StdDraw.filledCircle(0.55, 0.430, 0.04);
	StdDraw.filledCircle(0.57, 0.450, 0.04);
	StdDraw.filledCircle(0.59, 0.450, 0.04);
	StdDraw.filledCircle(0.61, 0.460, 0.04);
	StdDraw.filledCircle(0.63, 0.450, 0.04);

	StdDraw.setPenColor(new Color(59,48,56));
	StdDraw.filledRectangle(0.43, 0.27, 0.04, 0.075);
	StdDraw.filledRectangle(0.57, 0.27, 0.04, 0.075);

	StdDraw.setPenColor(new Color(26,102,46));
	StdDraw.filledCircle(0.44, 0.420, 0.04);
	StdDraw.filledCircle(0.46, 0.410, 0.04);
	StdDraw.filledCircle(0.42, 0.430, 0.04);
	StdDraw.filledCircle(0.40, 0.420, 0.04);
	StdDraw.filledCircle(0.38, 0.410, 0.04);
	StdDraw.filledCircle(0.42, 0.390, 0.04);
	StdDraw.filledCircle(0.49, 0.430, 0.04);
	StdDraw.filledCircle(0.51, 0.420, 0.04);
	StdDraw.filledCircle(0.53, 0.410, 0.04);
	StdDraw.filledCircle(0.55, 0.390, 0.04);
	StdDraw.filledCircle(0.57, 0.380, 0.04);
	StdDraw.filledCircle(0.59, 0.420, 0.04);
	StdDraw.filledCircle(0.61, 0.420, 0.04);
	StdDraw.filledCircle(0.63, 0.390, 0.04);

	StdDraw.setPenColor(new Color(80,61,53));
	StdDraw.filledRectangle(0.40, 0.27, 0.04, 0.15);
	StdDraw.filledRectangle(0.59, 0.27, 0.04, 0.15);

	StdDraw.setPenColor(new Color(42,111,55));
	StdDraw.filledCircle(0.44, 0.350, 0.04);
	StdDraw.filledCircle(0.46, 0.380, 0.04);
	StdDraw.filledCircle(0.42, 0.370, 0.04);
	StdDraw.filledCircle(0.40, 0.390, 0.04);
	StdDraw.filledCircle(0.38, 0.380, 0.04);
	StdDraw.filledCircle(0.42, 0.350, 0.04);
	StdDraw.filledCircle(0.49, 0.340, 0.04);
	StdDraw.filledCircle(0.51, 0.360, 0.04);
	StdDraw.filledCircle(0.53, 0.340, 0.04);
	StdDraw.filledCircle(0.55, 0.390, 0.04);
	StdDraw.filledCircle(0.57, 0.340, 0.04);
	StdDraw.filledCircle(0.59, 0.360, 0.04);
	StdDraw.filledCircle(0.61, 0.390, 0.04);
	StdDraw.filledCircle(0.63, 0.380, 0.04);

	StdDraw.setPenColor(new Color(108,76,66));
	StdDraw.filledRectangle(0.35, 0.08, 0.04, 0.30);
	StdDraw.filledRectangle(0.625, 0.08, 0.04, 0.30);

	StdDraw.setPenColor(new Color(81,137,82));
	StdDraw.filledCircle(0.44, 0.360, 0.04);
	StdDraw.filledCircle(0.46, 0.350, 0.04);
	StdDraw.filledCircle(0.41, 0.340, 0.04);
	StdDraw.filledCircle(0.40, 0.360, 0.04);
	StdDraw.filledCircle(0.39, 0.360, 0.04);
	StdDraw.filledCircle(0.38, 0.350, 0.04);
	StdDraw.filledCircle(0.40, 0.330, 0.04);
	StdDraw.filledCircle(0.38, 0.320, 0.04);
	StdDraw.filledCircle(0.42, 0.330, 0.04);
	StdDraw.filledCircle(0.49, 0.310, 0.04);
	StdDraw.filledCircle(0.51, 0.350, 0.04);
	StdDraw.filledCircle(0.53, 0.330, 0.04);
	StdDraw.filledCircle(0.55, 0.340, 0.04);
	StdDraw.filledCircle(0.57, 0.310, 0.04);
	StdDraw.filledCircle(0.57, 0.320, 0.04);
	StdDraw.filledCircle(0.59, 0.330, 0.04);
	StdDraw.filledCircle(0.61, 0.320, 0.04);
	StdDraw.filledCircle(0.63, 0.350, 0.04);
	StdDraw.filledCircle(0.631, 0.340, 0.04);
	StdDraw.filledCircle(0.631, 0.330, 0.04);


	StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
	StdDraw.setPenRadius();
	StdDraw.filledRectangle(0.165, 0.5, 0.165, 1);

	StdDraw.setPenColor(StdDraw.YELLOW);
	StdDraw.filledCircle(0.165, 0.5, 0.1);

	StdDraw.setPenColor(new Color(8,96,168));
	StdDraw.filledRectangle(.165, .25, .165, .25);

	StdDraw.setPenColor(new Color(242,242,248));
	StdDraw.filledRectangle(.165, .35, .165, .15);

	StdDraw.setPenColor(new Color(217,229,240));
	StdDraw.filledRectangle(.165, .25, .165, .05);

	StdDraw.setPenColor(new Color(191,209,229));
	StdDraw.line(0.01, 0.2, 0.01, 0.3);
	StdDraw.line(0.03, 0.2, 0.03, 0.3);
	StdDraw.line(0.05, 0.2, 0.05, 0.3);
	StdDraw.line(0.07, 0.2, 0.07, 0.3);
	StdDraw.line(0.09, 0.2, 0.09, 0.3);
	StdDraw.line(0.11, 0.2, 0.11, 0.3);
	StdDraw.line(0.13, 0.2, 0.13, 0.3);
	StdDraw.line(0.15, 0.2, 0.15, 0.3);
	StdDraw.line(0.17, 0.2, 0.17, 0.3);
	StdDraw.line(0.19, 0.2, 0.19, 0.3);

	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.setPenRadius(0.01);
	StdDraw.line(1.0/3.0, 0, 1.0/3.0, 1);
	StdDraw.line(1.0/1.5, 0, 1.0/1.5, 1);
	StdDraw.line(0, 0, 0, 1);
	StdDraw.line(1, 0, 1, 1);
	StdDraw.line(0, 1, 1, 1);
	StdDraw.line(0, 0, 1, 0);
	//StdDraw.line(0, 0.2, 0.66, 0.2);
}

}
