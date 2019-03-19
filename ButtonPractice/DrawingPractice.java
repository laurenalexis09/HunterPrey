
public class DrawingPractice {

	public static void main(String[] args) {
		double hunterRadius = 0.02;
		double preyRadius = 0.01;
		DrawBear(0.05, 0.10, hunterRadius);
		DrawBun(0.05, 0.05, preyRadius);
		DrawMouse(0.10, 0.05, preyRadius);
		
	}
	
public static void DrawBear(double x, double y, double radius) {
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

public static void DrawBun(double x, double y, double radius) {
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

public static void DrawMouse(double x, double y, double radius) {
	StdDraw.setPenColor(225, 200, 220);
	StdDraw.setPenRadius(0.003);
	StdDraw.filledCircle(x-.006, y+0.009, radius/1.5); //left ear outer
	StdDraw.filledCircle(x+.006, y+0.009, radius/1.5); //right ear outer
	StdDraw.setPenRadius(0.001);
	StdDraw.setPenColor();
	StdDraw.filledCircle(x-.006, y+0.009, radius/2.5); //left ear inner
	StdDraw.filledCircle(x+.006, y+0.009, radius/2.5); //right ear inner
	StdDraw.setPenRadius();
	StdDraw.setPenColor(225, 200, 220);
	StdDraw.filledCircle(x, y, radius);
	StdDraw.setPenColor(StdDraw.WHITE);
	StdDraw.filledCircle(x+.005, y, radius/3); //white part of left eye
	StdDraw.filledCircle(x-.005, y, radius/3); //white part of right eye
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.filledCircle(x+.005, y, radius/5); //black part of left eye
	StdDraw.filledCircle(x-.005, y, radius/5); //black part of right eye
	StdDraw.filledCircle(x, y - 0.002, radius/6); //nose
	StdDraw.line(x-0.004, y-0.0055, x+0.004, y-0.0055);	//mouth
	
}

}
