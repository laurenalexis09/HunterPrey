package level;

public class LevelConfiguration{

	int hunterAmount;
	double hunterSpeed;
	int timeTillPortalSpawn;

	public LevelConfiguration(int hunterAmount,double speed,int timeTillPortalSpawn) {
		this.hunterAmount = hunterAmount;
		this.hunterSpeed=speed;
		this.timeTillPortalSpawn = timeTillPortalSpawn;
	}

}