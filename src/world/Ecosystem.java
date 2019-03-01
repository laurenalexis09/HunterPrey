package world;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import biome.Biome;
import entities.Difficulty;
import entities.Hunter;
import entities.Prey;
import utilities.StdDraw;

public class Ecosystem {

	static Color colors = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
	Hunter[] hunters = new Hunter[1];
	Prey[] prey = new Prey[1];
	Biome biome;
	Difficulty dif;

	public Ecosystem(Biome biome,Difficulty dif) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		this.biome = biome;
		this.dif = dif;
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());	
		spawnHunters();
		spawnPrey();
		
		StdDraw.enableDoubleBuffering();

		while(true){
			for(int i =0; i < prey.length; i++){
				prey[i].update(0.04 , StdDraw.mouseX(), StdDraw.mouseY() );

			}
			for(int i =0; i < hunters.length; i++){
				hunters[i].update(0.04, prey);
			}

			StdDraw.clear();

			StdDraw.setPenColor(8, 146, 208);

			if(biome.getColor() == 1) {
				StdDraw.setPenColor(230,255,255);
				StdDraw.filledSquare(5, 5, 5);
			}
			else if(biome.getColor() == 2) {
				StdDraw.setPenColor(34, 139, 34);
				StdDraw.filledSquare(5, 5, 5);
			}
			else if(biome.getColor() == 3) {
				StdDraw.setPenColor(188, 42, 58);
				StdDraw.filledSquare(5, 5, 5);
			}
			else if(biome.getColor() == 4) {
				StdDraw.setPenColor(colors);
				StdDraw.filledSquare(5, 5, 5);
			}

			biome.draw();

			for(int i = 0; i < hunters.length; i++){
				hunters[i].draw();
			}
			for (int i = 0; i < prey.length; i++){
				prey[i].draw();
			}

			StdDraw.show();
			StdDraw.pause(40);
		}	
	}

	private void spawnHunters() {
		for(int i = 0; i < hunters.length; i++)
			hunters[i]= new Hunter(Math.random(),Math.random(),dif.getSpeed(),biome); 
	}

	private void spawnPrey() {
		for(int i = 0; i < prey.length; i++)
			prey[i]= new Prey(Math.random(), Math.random(),biome);
	}

}








