package main;

import biome.Biome;
import level.Difficulty;
import level.Level;
import level.LevelList;
import menus.GameOverMenu;
import render.LevelRenderer;

public class HunterPrey {

	Level level;
	LevelRenderer renderer;

	public static HunterPrey hunterprey;//currently unused but acts as game instance singleton

	//boolean gamePaused = false;
	boolean gameRunning = true;

	int currentLevel = 0;
	Biome biome;
	Difficulty dif;

	public HunterPrey(Biome biome,Difficulty dif){
		this.biome = biome;
		this.dif = dif;
		hunterprey = this;
		level = new Level(LevelList.levels[currentLevel],biome);
		renderer = new LevelRenderer(level);
	}

	public void run() {
		while(gameRunning) {
			runGameLoop();
			if(shouldGameEnd()) {
				endGame();
			}
			if(level.levelTicks>=level.portalSpawnTicks) {
				currentLevel++;
				if(currentLevel==LevelList.getTotalLevels()) {
					endGame();
					break;
				}
				level = new Level(LevelList.levels[currentLevel],biome);
				renderer.setLevel(level);
			}
		}
	}

	private void runGameLoop() {
		level.update();
		renderer.render();
	}

	public static HunterPrey getInstance() {
		return hunterprey;
	}

	public boolean shouldGameEnd() {
		return !level.isAtLeastOnePreyAlive();
	}

	public void endGame() {
		new GameOverMenu();
		gameRunning = false;
	}

}


