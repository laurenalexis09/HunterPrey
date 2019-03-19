package level;

public enum Difficulty {
	EASY (1),
	MEDIUM(2),
	HARD(3);
	
	int difficultyFactor;
	Difficulty(int dif) {
		this.difficultyFactor = dif;
		//this.hunterAmount = diff*1.5;
		//this.speed = diff *.1;
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
