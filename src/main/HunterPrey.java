package main;

import biome.Biome;
import entities.Difficulty;
import menus.GameOverMenu;
import render.WorldRenderer;
import world.World;

public class HunterPrey {

	World world;
	WorldRenderer renderer;
	
	public static HunterPrey hunterprey;

	boolean gamePaused = false;

	public HunterPrey(Biome biome,Difficulty dif){
		hunterprey = this;
		world = new World(biome,dif);
		renderer = new WorldRenderer(world);
	}

	public void run() {
		while(true) {
			while(!gamePaused) {
				runGameLoop();
				if(!world.isAtLeastOnePreyAlive()) {
					new GameOverMenu();
					gamePaused = true;
				}
			}
		}
	}

	private void runGameLoop() {
		world.update();
		renderer.render();
	}
	
	public static HunterPrey getInstance() {
		return hunterprey;
	}

}


