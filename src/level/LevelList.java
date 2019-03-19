package level;

public class LevelList {

	public static LevelConfiguration[] levels = new LevelConfiguration[] {
			new LevelConfiguration(2,.1,200),
			new LevelConfiguration(3,.1,200),
			new LevelConfiguration(3,.51,200)
	};
	
	public static LevelConfiguration getLevelConfiguration(int number) {
		return levels[number];
	}
	
	public static int getTotalLevels() {
		return levels.length;
	}

}
