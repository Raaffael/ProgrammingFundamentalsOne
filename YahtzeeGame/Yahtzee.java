import java.util.ArrayList;
import java.util.Arrays;



public class Yahtzee {


	private boolean isNotOver;
	private int turnsLeft;
	private int rollsLeft;
	private boolean inATurn;
	private ArrayList<Die> dice;
	private YahtzeeScoreCard scoreCard;

	public Yahtzee() {
		this.isNotOver = true;
		this.turnsLeft = 13;
		this.rollsLeft = 0;
		this.inATurn = false;
		this.dice = new ArrayList<Die>();
		this.scoreCard = new YahtzeeScoreCard();
	}

	public boolean isNotOver() {
		return (this.turnsLeft != 0);
	}

	public void startTurn() {
		this.inATurn = true;
		this.turnsLeft--;
		this.rollsLeft = 3;
		this.dice.clear();
		this.roll();
	}

	public int rollsLeft() {
		return this.rollsLeft;
	}

	public void roll() {
		while (this.dice.size() < 5)
			this.dice.add(new Die());
		this.rollsLeft--;
	}
	
	public boolean inATurn() {
		return this.inATurn;
	}
	
	public void pickScore(int row) {
		this.scoreCard.rows(this.dice)[row].recordScore();
		this.inATurn = false;
	}

	public ArrayList<Die> dice() {
		return this.dice;
	}
	
	public void eliminateDie(String remove){
	      ArrayList<Die> newDice = new ArrayList<Die>();
	      String[]removes = remove.split(" ");
	      for(int i=0; i<dice.size();i++){
	        String human = Integer.toString(i+1);
	        if(!Arrays.asList(removes).contains(human)){
	          newDice.add(dice.get(i));
	        }
	      }
	      
	      this.dice = newDice;
	    }


	public int turnsLeft() {
		return this.turnsLeft;
	}

	public YahtzeeScoreCard scoreCard() {
		return this.scoreCard;
	}
}