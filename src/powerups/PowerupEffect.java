package powerups;

public class PowerupEffect {
	
	int cooldown = 90;
	public int timeLimit = 0;
	
	public boolean expired = false;
	
	public void update() {
		if(timeLimit==cooldown)
			this.setExpired();
		timeLimit++;
	}

	public void setExpired() {
		this.expired = true;
	}
}
