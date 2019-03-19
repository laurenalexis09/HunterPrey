
public class Buttons {

	double x = Math.random()+0.1;
	double y = Math.random()+0.1;

	public Buttons() {
	}

	public void update(Prey prey[]) {

		if(x >= 1) {
			x = 0.9;
		}

		if(y >= 1) {
			y = 0.9;
		}

		Prey closest = null;
		double closestDistance = Double.POSITIVE_INFINITY;

		for ( int i = 0; i < prey.length; i++){
			if( Prey.isAlive()){
				double deltaX = prey[i].getX()-x;
				double deltaY = prey[i].getY()-y;
				double distance = Math.sqrt(deltaX*deltaX + deltaY*deltaY);
				if (distance < closestDistance){
					closestDistance = distance;
					closest = prey[i];
				}
			}

		}

		if(closestDistance <= closest.getRadius() + getRadius() ){
			Prey.end();
		}
	}

	private double getRadius() {
		return .02;
	}

	public void draw() {

		if(x >= 1) {
			x = 0.9;
		}

		if(y >= 1) {
			y = 0.9;
		}

		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledCircle(x, y, 0.02);

	}
	


}
