
public class YahtzeeScoreCardRow {
	private boolean isScored;
	final String label;
	private int score;
	
	public YahtzeeScoreCardRow(String label) {
		this.label = label;
		this.isScored = false;
	}
	
	public boolean isScored() {
		return this.isScored;
	}

	public int score() {
		return this.score;
	}

	public void setScore(int score) {
		if (!this.isScored)
			this.score = score;
	}

	public void recordScore() {
		this.isScored = true;
		
	}
}
