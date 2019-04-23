package main;

import level.Level;
import level.LevelList;
import menus.GameOverMenu;
import render.LevelRenderer;

public class HunterPrey {

	public Level level;
	public LevelRenderer renderer;

	public static HunterPrey hunterprey;//currently unused but acts as game instance singleton

	//boolean gamePaused = false;
	GameState state = GameState.RUNNING;

	public int currentLevel = 0;


	public HunterPrey(){
		hunterprey = this;
		level = new Level(LevelList.levels[currentLevel]);
		renderer = new LevelRenderer(level);
	}

	public void run() {
		while(state==GameState.RUNNING) {
			runGameLoop();
			if(shouldGameEnd()) {
				endGame();
			}
			if(level.levelCompleted) {
				currentLevel++;
				if(currentLevel==LevelList.getTotalLevels()) {
					endGame();
				}
				level = new Level(LevelList.levels[currentLevel]);
				renderer.setLevel(level);
			}
			try {
				Thread.sleep((long) (1000/30f));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void resetGame() {
		currentLevel = 0;
		level = new Level(LevelList.levels[currentLevel]);
		renderer = new LevelRenderer(level);
		state = GameState.RUNNING;
		run();
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
		new GameOverMenu(this);
		state = GameState.OVER;
	}
	
	public enum GameState{
		RUNNING,PAUSED,OVER,QUIT
	}

}


