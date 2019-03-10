package entities;

import world.World;

public abstract class Entity implements Updateable{
	public double x;
	public double y;
	public World world;
	
	public Entity(World worldIn) {
		this.world = worldIn;
	}
	
	public void setPosition(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void update();
	
}
