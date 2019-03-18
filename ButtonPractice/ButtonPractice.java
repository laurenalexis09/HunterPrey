import java.awt.Color;

public class ButtonPractice {

	 static Color colors = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));

	
	public static void main(String[] args) {
		new ButtonPractice();

	}

	public ButtonPractice() {
		Prey[] prey = new Prey[1];
		Buttons button = new Buttons();

		for(int i = 0; i < prey.length; i++)
			prey[i]= new Prey(Math.random(), Math.random());
		
		for(int i = 0; i < prey.length; i++) {
			button = new Buttons();
		}

		while(true){
			for(int i =0; i < prey.length; i++){
				prey[i].update(0.04, StdDraw.mouseX(), StdDraw.mouseY() );
			}
			
			for(int i = 0; i < prey.length; i++) {
				button.update(prey);
			}
			
			StdDraw.setPenColor(8, 146, 208);
			
			StdDraw.setPenColor(colors);
			StdDraw.filledSquare(5, 5, 5);
			
			for (int i = 0; i < prey.length; i++){
				prey[i].draw();
			}
			
			for (int i = 0; i < prey.length; i++){
				button.draw();
			}
		
			StdDraw.show();
			StdDraw.pause(40);
			
			
		}
	}
	
}