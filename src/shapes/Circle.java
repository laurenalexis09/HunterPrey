package shapes;
import java.awt.Color;

public class Circle extends Shape{
	private double radius;

	public Circle(double x,double y,Color color){
		setPosition(x,y);
		setColor(color);
		radius = Math.random()*.07;
	}

	public double getRadius(){
		return radius;
	}
}