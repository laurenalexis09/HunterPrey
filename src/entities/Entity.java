package entities;

import level.Level;

public abstract class Entity implements Updateable{
	public double x;
	public double y;
	public Level level;
	
	public Entity(Level levelIn) {
		this.level = levelIn;
	}
	
	public void setPosition(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void update();
	
}
