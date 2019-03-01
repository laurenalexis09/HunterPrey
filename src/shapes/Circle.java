package shapes;
import utilities.StdDraw;

public class Circle {
	private double x;
	private double y;
	private double color;
	private double radius;

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public double getRadius(){
		return radius;
	}

	public Circle(double x, double y,double color){
		this.x=x;
		this.y=y;
		this.color=color;
		radius = Math.random()*.07;
	}


	public void draw(){

		if (color == 1) {
			StdDraw.setPenColor(StdDraw.BOOK_BLUE);
			StdDraw.filledCircle(x, y, radius);
		}

		if (color == 2) {
			StdDraw.setPenColor(0, 53, 0);
			StdDraw.filledCircle(x, y, radius);
		}
		if (color == 3) {
			StdDraw.setPenColor(153, 0, 0);
			StdDraw.filledCircle(x, y, radius);
		}
		if (color == 4) {
			StdDraw.setPenColor((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
			StdDraw.filledCircle(x, y, radius);
		}
	}
}
