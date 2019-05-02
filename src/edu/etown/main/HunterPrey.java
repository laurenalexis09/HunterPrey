package edu.etown.main;

import edu.etown.level.Level;
import edu.etown.level.LevelList;
import edu.etown.menus.GameOverMenu;
import edu.etown.menus.Menu;
import edu.etown.menus.StartMenu;
import edu.etown.render.LevelRenderer;

public class HunterPrey {

	public Level level;
	public LevelRenderer renderer;

	public static HunterPrey hunterprey;//currently unused but acts as game instance singleton

	//boolean gamePaused = false;
	GameState state = GameState.INMENU;

	public static int currentLevel = 0;
	Menu currentMenu = new StartMenu(this);

	public HunterPrey(){
		hunterprey = this;
		level = new Level(LevelList.levels[currentLevel]);
		renderer = new LevelRenderer(level);
	}

	public void run() {
		while(true) {
			if(state==GameState.RUNNING) {
				runGameLoop();
				if(shouldGameEnd()) {
					endGame();
				}
				if(level.levelCompleted) {
					currentLevel++;
					if(currentLevel==LevelList.getTotalLevels()) {
						endGame();
					}
					else{
						level = new Level(LevelList.levels[currentLevel]);
						renderer.setLevel(level);
					}
				}
				try {
					Thread.sleep((long) (1000/30f));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(state==GameState.INMENU) {
				currentMenu.draw();
				try {
					Thread.sleep((long) (1000/30f));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(state==GameState.OVER)
				System.exit(0);
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
		currentMenu = new GameOverMenu(this);
		state = GameState.INMENU;
	}
	
	public void quitGame() {
		state = GameState.OVER;
	}

	public void changeMenu(Menu newMenu) {
		currentMenu = newMenu;
	}

	public enum GameState{
		RUNNING,INMENU,OVER
	}
	
	public static void main(String[] args) {
		new HunterPrey().run();
	}

}


