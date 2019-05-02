package edu.etown.entities;

import edu.etown.level.Level;

import edu.etown.sounds.SoundProcessor;

public abstract class Entity{
	public double x;
	public double y;
	public Level level;
	
	public boolean alive = true;
	
	public Entity(Level levelIn) {
		this.level = levelIn;
	}
	
	public void setPosition(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setDead() {
		SoundProcessor.playSound("./src/death.wav");
		alive = false;
	}
	
	public boolean isAlive(){
		return alive;
	}
	
	public abstract void update();
	
}
