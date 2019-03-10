package shapes;
import java.awt.Color;

public class Circle{
	private double x;
	private double y;
	public Color color;
	private double radius;

	public Circle(double x,double y,Color color){
		this.x = x;
		this.y = y;
		this.color = color;
		radius = Math.random()*.07;
	}
	
	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public double getRadius(){
		return radius;
	}
}