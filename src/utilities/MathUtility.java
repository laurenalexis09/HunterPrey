package utilities;

public class MathUtility {

	public static double getDistance(double x1,double y1,double x2,double y2) {
		double distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
		return distance;
	}
}
