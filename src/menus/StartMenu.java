package menus;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import main.HunterPrey;
import utilities.MathUtility;
import utilities.StdDraw;

public class StartMenu {
	Color color1 = new Color(126, 160, 255);

	public StartMenu(){	
		
		NewGameButton button = new NewGameButton();
		button.setX(0.94);
		button.setY(0.06);

		button = new NewGameButton();


		do {

			button.update();

			StdDraw.enableDoubleBuffering();

			DrawBackground();

			Font font1 = new Font("Helvetica", Font.BOLD, 60);
			StdDraw.setFont(font1);
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.text(0.5, 0.75, "Survive!");
			StdDraw.setPenColor(128,166,206);
			StdDraw.text(0.502, 0.7502, "Survive!");
			StdDraw.setPenColor(StdDraw.WHITE);
			Font font2 = new Font("Helvetica", Font.ITALIC, 40);
			StdDraw.setFont(font2);
			StdDraw.text(0.5, 0.65, "A hunter prey game");
			StdDraw.setPenColor(128,166,206);
			StdDraw.text(0.502, 0.6502, "A hunter prey game");

			MartianBear(0.89, 0.47, .02);
			MartianPrey(0.77, 0.31, .01);

			ForestBear(0.41, 0.50, .02);
			ForestPrey(0.51, 0.24, .01);

			ArcticBear(0.21, 0.40, .02);
			ArcticPrey(0.11, 0.45, .01);

			DrawBigBear(0.33, 0.16, 0.15);
			DrawBigBun(1/1.5, 0.13, 0.12);



			button.draw();


			StdDraw.show();

			StdDraw.clear();

			if(StdDraw.isMousePressed()) {
				double distance = button.getRadius();
				double dis = MathUtility.getDistance(StdDraw.mouseX(), StdDraw.mouseY(), button.x, button.y);
				if(dis <= distance ) {
					break;
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
		StdDraw.line(x-0.09, y+0.08, x-0.03, y+0.02);
		StdDraw.line(x+0.03, y+0.02, x+0.09, y+0.08);
		StdDraw.setPenRadius();
		StdDraw.filledCircle(x, y-0.05, radius/5);
		StdDraw.filledCircle(x+.075, y, radius/5);
		StdDraw.filledCircle(x-.075, y, radius/5);
		StdDraw.setPenRadius(0.008);
		StdDraw.line(x-.1, y-0.09, x+0.1, y-0.09);
	}

	public static void DrawBigBun(double x, double y, double radius) {
		StdDraw.setPenColor(225, 200, 220);
		StdDraw.setPenRadius(0.05);
		StdDraw.line(x-.05, y, x-.05, y+0.20); //left ear outer
		StdDraw.line(x+.05, y, x+.05, y+0.20); //right ear outer
		StdDraw.setPenRadius(0.03);
		StdDraw.setPenColor(128,128,128);
		StdDraw.line(x-.05, y, x-.05, y+0.18); //left ear inner
		StdDraw.line(x+.05, y, x+.05, y+0.18); //right ear inner
		StdDraw.setPenRadius();
		StdDraw.setPenColor(225, 200, 220);
		StdDraw.filledCircle(x, y, radius); //head 
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x+.05, y, radius/3); //white part of left eye
		StdDraw.filledCircle(x-.05, y, radius/3); //white part of right eye
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x+.05, y, radius/5); //black part of left eye
		StdDraw.filledCircle(x-.05, y, radius/5); //black part of right eye
		StdDraw.filledCircle(x, y - 0.035, radius/6); //nose
		StdDraw.setPenRadius(0.008);
		StdDraw.line(x+.03, y+0.06, x+0.09, y+0.04);
		StdDraw.line(x-.09, y+0.04, x-0.03, y+0.06);
		StdDraw.line(x-0.04, y-0.060, x+0.04, y-0.060);	//mouth
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

	public static void MartianBear(double x, double y, double radius) {

		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledCircle(x-.01, y+0.01, (radius/1.7));
		StdDraw.filledCircle(x+.01, y+0.01, (radius/1.7));
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x-.01, y+0.01, (radius/2));
		StdDraw.filledCircle(x+.01, y+0.01, radius/2);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledCircle(x, y, (radius));
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x+.01, y, (radius/3));
		StdDraw.filledCircle(x-.01, y, radius/3);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.0008);
		StdDraw.circle(x+.01, y, radius/3);
		StdDraw.circle(x-.01, y, radius/3);
		StdDraw.setPenRadius();
		StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
		StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
		StdDraw.setPenRadius();
		StdDraw.filledCircle(x, y-0.005, radius/5);
		StdDraw.filledCircle(x+.01, y, radius/5);
		StdDraw.filledCircle(x-.01, y, radius/5);
		StdDraw.line(x-.01, y-0.01, x+0.01, y-0.01);
		StdDraw.filledCircle(x+.01, y, radius/5);
		StdDraw.filledCircle(x-.01, y, radius/5);
	}

	public static void MartianPrey(double x, double y, double radius) {
		StdDraw.setPenColor(50, 205, 50);
		StdDraw.setPenRadius(0.007);
		StdDraw.line(x-.005, y, x-.005, y+0.015); //left ear outer
		StdDraw.line(x+.005, y, x+.005, y+0.015); //right ear outer
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor();
		StdDraw.line(x-.005, y, x-.005, y+0.015); //left ear inner
		StdDraw.line(x+.005, y, x+.005, y+0.015); //right ear inner
		StdDraw.setPenRadius();
		StdDraw.setPenColor(50, 205, 50);
		StdDraw.filledCircle(x, y, radius); //head 
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x+.005, y, radius/3); //white part of left eye
		StdDraw.filledCircle(x-.005, y, radius/3); //white part of right eye
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x+.005, y, radius/5); //black part of left eye
		StdDraw.filledCircle(x-.005, y, radius/5); //black part of right eye
		StdDraw.filledCircle(x, y - 0.002, radius/6); //nose
		StdDraw.line(x-0.004, y-0.0055, x+0.004, y-0.0055);	//mouth
	}

	public static void ForestBear(double x, double y, double radius) {

		StdDraw.setPenColor(165, 42, 42);
		StdDraw.filledCircle(x-.01, y+0.01, (radius/1.7));
		StdDraw.filledCircle(x+.01, y+0.01, (radius/1.7));
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x-.01, y+0.01, (radius/2));
		StdDraw.filledCircle(x+.01, y+0.01, radius/2);
		StdDraw.setPenColor(165, 42, 42);
		StdDraw.filledCircle(x, y, (radius));
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x+.01, y, (radius/3));
		StdDraw.filledCircle(x-.01, y, radius/3);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.0008);
		StdDraw.circle(x+.01, y, radius/3);
		StdDraw.circle(x-.01, y, radius/3);
		StdDraw.setPenRadius();
		StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
		StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
		StdDraw.setPenRadius();
		StdDraw.filledCircle(x, y-0.005, radius/5);
		StdDraw.filledCircle(x+.01, y, radius/5);
		StdDraw.filledCircle(x-.01, y, radius/5);
		StdDraw.line(x-.01, y-0.01, x+0.01, y-0.01);
		StdDraw.filledCircle(x+.01, y, radius/5);
		StdDraw.filledCircle(x-.01, y, radius/5);
	}

	public static void ForestPrey(double x, double y, double radius) {
		StdDraw.setPenColor(225, 200, 220);
		StdDraw.setPenRadius(0.007);
		StdDraw.line(x-.005, y, x-.005, y+0.015); //left ear outer
		StdDraw.line(x+.005, y, x+.005, y+0.015); //right ear outer
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor();
		StdDraw.line(x-.005, y, x-.005, y+0.015); //left ear inner
		StdDraw.line(x+.005, y, x+.005, y+0.015); //right ear inner
		StdDraw.setPenRadius();
		StdDraw.setPenColor(225, 200, 220);
		StdDraw.filledCircle(x, y, radius); //head 
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x+.005, y, radius/3); //white part of left eye
		StdDraw.filledCircle(x-.005, y, radius/3); //white part of right eye
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x+.005, y, radius/5); //black part of left eye
		StdDraw.filledCircle(x-.005, y, radius/5); //black part of right eye
		StdDraw.filledCircle(x, y - 0.002, radius/6); //nose
		StdDraw.line(x-0.004, y-0.0055, x+0.004, y-0.0055);	//mouth
	}

	public static void ArcticBear(double x, double y, double radius) {

		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x-.01, y+0.01, (radius/1.7));
		StdDraw.filledCircle(x+.01, y+0.01, (radius/1.7));
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x-.01, y+0.01, (radius/2));
		StdDraw.filledCircle(x+.01, y+0.01, radius/2);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x, y, (radius));
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x+.01, y, (radius/3));
		StdDraw.filledCircle(x-.01, y, radius/3);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.0008);
		StdDraw.circle(x+.01, y, radius/3);
		StdDraw.circle(x-.01, y, radius/3);
		StdDraw.setPenRadius();
		StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
		StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
		StdDraw.setPenRadius();
		StdDraw.filledCircle(x, y-0.005, radius/5);
		StdDraw.filledCircle(x+.01, y, radius/5);
		StdDraw.filledCircle(x-.01, y, radius/5);
		StdDraw.line(x-.01, y-0.01, x+0.01, y-0.01);
		StdDraw.filledCircle(x+.01, y, radius/5);
		StdDraw.filledCircle(x-.01, y, radius/5);
	}

	public static void ArcticPrey(double x, double y, double radius) {
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		StdDraw.setPenRadius(0.007);
		StdDraw.line(x-.005, y, x-.005, y+0.015); //left ear outer
		StdDraw.line(x+.005, y, x+.005, y+0.015); //right ear outer
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor();
		StdDraw.line(x-.005, y, x-.005, y+0.015); //left ear inner
		StdDraw.line(x+.005, y, x+.005, y+0.015); //right ear inner
		StdDraw.setPenRadius();
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		StdDraw.filledCircle(x, y, radius); //head 
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x+.005, y, radius/3); //white part of left eye
		StdDraw.filledCircle(x-.005, y, radius/3); //white part of right eye
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x+.005, y, radius/5); //black part of left eye
		StdDraw.filledCircle(x-.005, y, radius/5); //black part of right eye
		StdDraw.filledCircle(x, y - 0.002, radius/6); //nose
		StdDraw.line(x-0.004, y-0.0055, x+0.004, y-0.0055);	//mouth
	}

	public static void main(String[] args) {
		new StartMenu();
	}
	
}