package entities;

public enum Difficulty {
	EASY (1),
	MEDIUM(2),
	HARD(3);
	
	int multi;
	double speed;
	Difficulty(int multi) {
		this.multi = multi;
		this.speed = multi *.1;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public static Difficulty getDifficulty(String input) {
		if(input.equalsIgnoreCase("easy")){
			return Difficulty.EASY;
		}
		
		if(input.equalsIgnoreCase("medium")){
			return Difficulty.MEDIUM;
		}
		
		if(input.equalsIgnoreCase("hard")){
			return Difficulty.HARD;
		}
		return Difficulty.HARD;//too lazy to input difficulty? the hardest one it is then.
	}
}
