import java.util.ArrayList;

public class YahtzeeScoreCard {
	private YahtzeeScoreCardRow[] rows;
	
	public YahtzeeScoreCard() {
		this.rows = new YahtzeeScoreCardRow[13];
		rows[0] = new YahtzeeScoreCardRow("Aces         ");
		rows[1] = new YahtzeeScoreCardRow("Twos         ");
		rows[2] = new YahtzeeScoreCardRow("Threes      ");
		rows[3] = new YahtzeeScoreCardRow("Fours        ");
		rows[4] = new YahtzeeScoreCardRow("Fives        ");
		rows[5] = new YahtzeeScoreCardRow("Sixes        ");
		rows[6] = new YahtzeeScoreCardRow("3 of a kind      ");
		rows[7] = new YahtzeeScoreCardRow("4 of a kind      ");
		rows[8] = new YahtzeeScoreCardRow("full house      ");
		rows[9] = new YahtzeeScoreCardRow("sm straight");
		rows[10] = new YahtzeeScoreCardRow("lg straight");
		rows[11] = new YahtzeeScoreCardRow("Yahtzee      ");
		rows[12] = new YahtzeeScoreCardRow("chance      ");
		
	}

	public int sumOf(ArrayList<Die> dice, int toMatch) {
		int total=0;
		for (Die die:dice) {
			if (die.sideUp == toMatch|| toMatch == -1)
				total+= die.sideUp;
		}
		return total;
	}

	public int sumOf(ArrayList<Die> dice) {
		return sumOf(dice, -1);
	}

	public boolean sameDice(ArrayList<Die> dice, int ofAKind) {
		for(int i = 1; i<=6;i++) {
			if (sumOf(dice,i) >= i * ofAKind)
				return true;
		}
		return false;
	}

	public boolean inOrder(ArrayList<Die> dice, int toMatch) {
		for (int i = 1; i + toMatch -1 <=6;i++) {
			boolean found = true;
			for (int j = i; j<i + toMatch;j++) {
				if (sumOf(dice, j) < j)
					found = false;
			}
			if (found)
				return true;
		}
		return false;
	}

	public YahtzeeScoreCardRow[] rows() {
		return this.rows;
	}

	public YahtzeeScoreCardRow[] rows(ArrayList<Die> dice) {
		calculatePotentialScores(dice);
		return this.rows;
	}

	private void calculatePotentialScores(ArrayList<Die> dice) {
		this.rows[0].setScore(sumOf(dice, 1));
		this.rows[1].setScore(sumOf(dice, 2));
		this.rows[2].setScore(sumOf(dice, 3));
		this.rows[3].setScore(sumOf(dice, 4));
		this.rows[4].setScore(sumOf(dice, 5));
		this.rows[5].setScore(sumOf(dice, 6));
		
		
		
		this.rows[6].setScore(sameDice(dice, 3) ? sumOf(dice) : 0);
		this.rows[7].setScore(sameDice(dice, 4) ? sumOf(dice) : 0);
		this.rows[8].setScore((sameDice(dice, 3) && sameDice(dice, 2)) ? 25 : 0);
		this.rows[9].setScore(inOrder(dice, 4) ? 30 : 0);
		this.rows[10].setScore(inOrder(dice, 5) ? 40 : 0);
		this.rows[11].setScore(sameDice(dice, 5) ? 50 : 0);
		this.rows[12].setScore(sumOf(dice));
		
		
	}

	public int finalScore() {
		int finalScore = 0;
		int top = sumRows(0, 5);
		int bottom = sumRows(6, 12);
		if (top >= 63)
			return top + 35 + bottom;
		return top + bottom;
	}

	private int sumRows(int from, int to) {
		int accum = 0;
		for (int i = from; i <= to; i++)
			accum += rows[i].score();
		return accum;
	}

}
