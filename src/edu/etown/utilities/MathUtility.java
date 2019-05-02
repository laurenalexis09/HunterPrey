package edu.etown.utilities;

public class MathUtility {

	public static double getDistance(double x1,double y1,double x2,double y2) {
		double distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
		return distance;
	}
	
	//had to make my own clamp function, thanks java
	public static double clamp(double min,double max,double value) {
		if(value<min)
			return min;
		else if(value>max)
			return max;
		else return value;
	}
}
