package menus;

import java.awt.Font;

import main.HunterPrey;
import utilities.MathUtility;
import utilities.StdDraw;

public class RulesMenu implements Menu{

	NewGameButton button = new NewGameButton();
	public static double bearRadius = 0.02;
	double i = -0.1;
	double j = 1.1;

	HunterPrey game;

	public RulesMenu(HunterPrey Game) {
		this.game = Game;
	}

	public static double getRadius() {
		return bearRadius;
	}

	public void draw() {
		StdDraw.clear();

		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.filledSquare(0.5, 0.5, 1);
		StdDraw.enableDoubleBuffering();



		ForestBear(i, 0.95, 0.02);
		ForestPrey(i+0.05,0.94, 0.01);
		i+=0.0001;
		if(i > 1.2) {
			i = -0.1;
		}

		RandomArcticBear(0.96, j, 0.02);
		ArcticPrey(0.96, j-0.05, 0.01);
		j-=0.0001;
		if(j<-0.3) {
			j = 1.1;
		}

		//StdDraw.pause(40);
		Font font1 = new Font("Helvetica", Font.BOLD, 60);
		StdDraw.setFont(font1);
		StdDraw.setPenColor(70,70,70);
		StdDraw.text(0.5, 0.90, "Rules");
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.text(0.504, 0.9004, "Rules");

		button.setX(0.95);
		button.setY(0.95);
		button.setRadius(0.05);
		button.setText("Play");
		button.setFontSize(10);
		button.draw();

		Font font3 = new Font("Helvetica", Font.BOLD, 30);
		StdDraw.setFont(font3);

		StdDraw.textLeft(0, 0.80, "Prey:");
		ForestPrey(0.03, 0.74, 0.01);
		MartianPrey(0.08, 0.74, 0.01);
		ArcticPrey(0.13, 0.74, 0.01);

		StdDraw.setPenColor(StdDraw.WHITE);
		Font font2 = new Font("Helvetica", Font.PLAIN, 15);
		StdDraw.setFont(font2);

		StdDraw.textLeft(0, 0.70, "This is you. You have 100 health. Use the mouse to move around.");

		StdDraw.setFont(font3);
		StdDraw.textLeft(0, 0.65, "Hunters:"); 
		ForestBear(0.03, 0.60, 0.02);
		MartianBear(0.08, 0.60, 0.02);
		ArcticBear(0.13, 0.60, 0.02);

		RandomForestBear(0.03, 0.55, 0.02);
		RandomMartianBear(0.08, 0.55, 0.02);
		RandomArcticBear(0.13, 0.55, 0.02);

		StdDraw.setFont(font2);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.textLeft(0, 0.50, "These are your enemies."); 
		StdDraw.textLeft(0, 0.47, "If you are hit by one, you lose 10 health. Avoid them."); 


		StdDraw.setFont(font3);
		StdDraw.textLeft(0, 0.42, "Powerups:");
		HealthPowerup(0.03, 0.37);
		InPowerup(0.08, 0.37);

		StdDraw.setFont(font2);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.textLeft(0, 0.32, "The health powerup restores lost health by 50 points."); 
		StdDraw.textLeft(0, 0.29, "The shield powerup gives you invincibility for 5 seconds.");

		StdDraw.setFont(font3);
		StdDraw.textLeft(0, 0.24, "Portal:");


		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0.05, 0.17, 0.05);
		StdDraw.setPenColor(255,255,255);
		StdDraw.circle(0.05, 0.17, 0.05);

		StdDraw.setFont(font2);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.textLeft(0, 0.10, "This is your end goal!"); 
		StdDraw.textLeft(0, 0.07, "Enter the portal to go onto the next level.");

		Font font4 = new Font("Helvetica", Font.ITALIC, 15);
		StdDraw.setFont(font4);
		StdDraw.textLeft(0, 0.02, "Your objective: Complete all levels without losing all of your health.");


		StdDraw.show();

		StdDraw.clear();
		if(StdDraw.isMousePressed()) {
			double distance = button.getRadius();
			double dis = MathUtility.getDistance(StdDraw.mouseX(), StdDraw.mouseY(), button.x, button.y);
			if(dis <= distance ) {
				game.resetGame();
			}
		}
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

	public static void RandomMartianBear(double x, double y, double radius) {
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/1.7));
		StdDraw.filledCircle(x+.01, y+0.01, (getRadius()/1.7));
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/2));
		StdDraw.filledCircle(x+.01, y+0.01, getRadius()/2);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledCircle(x, y, (getRadius()));
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x+.01, y, (getRadius()/3));
		StdDraw.filledCircle(x-.01, y, getRadius()/3);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius();
		StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
		StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
		StdDraw.setPenRadius();
		StdDraw.filledCircle(x, y-0.005, getRadius()/5);
		StdDraw.filledCircle(x+.01, y, getRadius()/5);
		StdDraw.filledCircle(x-.01, y, getRadius()/5);
		StdDraw.filledCircle(x, y-0.01, getRadius()/3.5);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledRectangle(x, y-0.007, 0.006,0.003);
		StdDraw.setPenRadius(0.0009);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.point(x-0.003, y-0.01);
		StdDraw.point(x+0.003, y-0.01);
		StdDraw.setPenColor();
		StdDraw.setPenRadius(0.0008);
		StdDraw.circle(x+.01, y, getRadius()/3);
		StdDraw.circle(x-.01, y, getRadius()/3);
		StdDraw.filledCircle(x, y-0.005, getRadius()/5);
		StdDraw.filledCircle(x+.01, y, getRadius()/5);
		StdDraw.filledCircle(x-.01, y, getRadius()/5);
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

	public static void RandomForestBear(double x, double y, double radius) {
		StdDraw.setPenColor(165, 42, 42);
		StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/1.7));
		StdDraw.filledCircle(x+.01, y+0.01, (getRadius()/1.7));
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/2));
		StdDraw.filledCircle(x+.01, y+0.01, getRadius()/2);
		StdDraw.setPenColor(165, 42, 42);
		StdDraw.filledCircle(x, y, (getRadius()));
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x+.01, y, (getRadius()/3));
		StdDraw.filledCircle(x-.01, y, getRadius()/3);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius();
		StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
		StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
		StdDraw.setPenRadius();
		StdDraw.filledCircle(x, y-0.005, getRadius()/5);
		StdDraw.filledCircle(x+.01, y, getRadius()/5);
		StdDraw.filledCircle(x-.01, y, getRadius()/5);
		StdDraw.filledCircle(x, y-0.01, getRadius()/3.5);
		StdDraw.setPenColor(165, 42, 42);
		StdDraw.filledRectangle(x, y-0.007, 0.006,0.003);
		StdDraw.setPenRadius(0.0009);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.point(x-0.003, y-0.01);
		StdDraw.point(x+0.003, y-0.01);
		StdDraw.setPenColor();
		StdDraw.setPenRadius(0.0008);
		StdDraw.circle(x+.01, y, getRadius()/3);
		StdDraw.circle(x-.01, y, getRadius()/3);
		StdDraw.filledCircle(x, y-0.005, getRadius()/5);
		StdDraw.filledCircle(x+.01, y, getRadius()/5);
		StdDraw.filledCircle(x-.01, y, getRadius()/5);
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

	public static void RandomArcticBear(double x, double y, double radius) {
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/1.7));
		StdDraw.filledCircle(x+.01, y+0.01, (getRadius()/1.7));
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x-.01, y+0.01, (getRadius()/2));
		StdDraw.filledCircle(x+.01, y+0.01, getRadius()/2);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(x, y, (getRadius()));
		StdDraw.filledCircle(x+.01, y, (getRadius()/3));
		StdDraw.filledCircle(x-.01, y, getRadius()/3);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius();
		StdDraw.line(x-0.01, y+0.008, x-0.005, y+0.005);
		StdDraw.line(x+0.005, y+0.005, x+0.01, y+0.008);
		StdDraw.setPenRadius();
		StdDraw.filledCircle(x, y-0.005, getRadius()/5);
		StdDraw.filledCircle(x+.01, y, getRadius()/5);
		StdDraw.filledCircle(x-.01, y, getRadius()/5);
		StdDraw.filledCircle(x, y-0.01, getRadius()/3.5);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(x, y-0.007, 0.006,0.003);
		StdDraw.setPenRadius(0.0009);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.point(x-0.003, y-0.01);
		StdDraw.point(x+0.003, y-0.01);
		StdDraw.setPenColor();
		StdDraw.setPenRadius(0.0008);
		StdDraw.circle(x+.01, y, getRadius()/3);
		StdDraw.circle(x-.01, y, getRadius()/3);
		StdDraw.filledCircle(x, y-0.005, getRadius()/5);
		StdDraw.filledCircle(x+.01, y, getRadius()/5);
		StdDraw.filledCircle(x-.01, y, getRadius()/5);
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

	public static void HealthPowerup(double x, double y) {
		StdDraw.setPenColor(17,30,108);
		StdDraw.filledCircle(x, y, 0.02);
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(x, y, 0.005, 0.009);
		StdDraw.filledRectangle(x, y, 0.009, 0.005);
		StdDraw.setPenColor(150,0,0);
		StdDraw.filledRectangle(x, y, 0.003, 0.007);
		StdDraw.filledRectangle(x, y, 0.007, 0.003);
	}

	public static void InPowerup(double x, double y) {
		StdDraw.setPenColor(254,203,0);
		StdDraw.filledCircle(x, y, 0.02);
		StdDraw.setPenColor(0,0,255);
		StdDraw.filledEllipse(x, y+0.0043, 0.009, 0.014);
		StdDraw.setPenColor(254,203,0);
		StdDraw.filledCircle(x-0.0035, y+0.0033, 0.003);
		StdDraw.filledCircle(x+0.0035, y+0.0033, 0.003);
		StdDraw.filledRectangle(x, y+0.01, 0.0098,0.006);
		StdDraw.filledRectangle( x, y+0.017, 0.0055, 0.002);
	}
}
