package edu.etown.entities;

import java.awt.Color;

import edu.etown.level.Level;

public class Portal extends Entity{
	
	public Color color = new Color(0,0,0);

	public Portal(Level levelIn,double x,double y) {
		super(levelIn);
		this.setPosition(x, y);
	}

	@Override
	public void update() {
	}
	
	public void activatePortal() {
		level.completeLevel();
	}

}
