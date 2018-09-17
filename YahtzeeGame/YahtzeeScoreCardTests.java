import java.util.ArrayList;

public class YahtzeeScoreCardTests {

	public static void main(String[] args) {
		sumOfTests();
		sameDiceTests();
		inOrderTests();
		rowTests();
		recordTests();
		printScoreCard();
	}

	private static void printScoreCard() {
		System.out.println("Print Score Card");
		YahtzeeScoreCard scoreCard = new YahtzeeScoreCard();
		ArrayList<Die> dice = makeSomeDice(new int [] {1,2,3,4,1});
		
		scoreCard.rows(dice)[3].recordScore();
		
		
		YahtzeeScoreCardRow[] rows = scoreCard.rows(dice);
		for (int i = 0; i<scoreCard.rows(dice).length;i++) {
			if (rows[i].isScored()) {
				System.out.println("    " + rows[i].label + "\t" + rows[i].score());
			}else {
				System.out.println((i+1) + ".   " + rows[i].label + "\t(" + rows[i].score() + ")");;
			}
			
		}
		
	}

	private static void recordTests() {
		System.out.println("RecordedTests");
		YahtzeeScoreCard scoreCard = new YahtzeeScoreCard();
		ArrayList<Die> dice = makeSomeDice(new int [] {1,2,3,4,1});
		
		scoreCard.rows(dice)[0].recordScore();
		System.out.println(scoreCard.rows(dice)[0].score() == 2);
		System.out.println(scoreCard.rows(dice)[0].isScored() == true);
		
		dice = makeSomeDice(new int[] {4,4,4,4,3});
		scoreCard.rows(dice)[3].recordScore();
		System.out.println(scoreCard.rows(dice)[3].isScored() == true);
		System.out.println(scoreCard.rows(dice)[3].score() == 16);
		System.out.println(scoreCard.rows(dice)[0].score() == 2);
	
			
				
		
	}

	private static void rowTests() {
		System.out.println("rowTests");
		YahtzeeScoreCard scoreCard = new YahtzeeScoreCard();
		System.out.println(scoreCard.rows().length == 13);
		ArrayList<Die> dice = makeSomeDice(new int [] {1,2,3,4,1});
		System.out.println(scoreCard.rows(dice)[0].label.trim().equals("Aces"));
		System.out.println(scoreCard.rows(dice)[11].label == "Yahtzee");
		
		System.out.println(scoreCard.rows(dice)[0].isScored() == false);
		System.out.println(scoreCard.rows(dice)[11].isScored() == false);
		
		System.out.println(scoreCard.rows(dice)[0].score() == 2);
		System.out.println(scoreCard.rows(dice)[11].score() == 0);
		System.out.println(scoreCard.rows(dice)[9].score() == 30);
	}

	private static void inOrderTests() {
		System.out.println("inOrderTest");
		YahtzeeScoreCard scoreCard = new YahtzeeScoreCard();
		ArrayList<Die> dice = makeSomeDice(new int [] {1,1,3,2,2});
		System.out.println(scoreCard.inOrder(dice, 3) == true);
		System.out.println(scoreCard.inOrder(dice, 4) == false);
		
	}

	private static void sameDiceTests() {
		System.out.println("SameDiceTest");
		YahtzeeScoreCard scoreCard = new YahtzeeScoreCard();
		ArrayList<Die> dice = makeSomeDice(new int [] {4,3,4,3,4});
		System.out.println(scoreCard.sameDice(dice, 1) == true);
		System.out.println(scoreCard.sameDice(dice, 2) == true);
		System.out.println(scoreCard.sameDice(dice, 3) == true);
		System.out.println(scoreCard.sameDice(dice, 4) == false);
		dice = makeSomeDice(new int[] {5,5,5,5,5});
		System.out.println(scoreCard.sameDice(dice, 5) == true);
	}

	private static void sumOfTests() {
		System.out.println("SumOfTests");
		ArrayList<Die> dice = makeSomeDice(new int[] {5,3,1,1,4});
		YahtzeeScoreCard scoreCard = new YahtzeeScoreCard();
		System.out.println(scoreCard.sumOf(dice,1) == 2);
		System.out.println(scoreCard.sumOf(dice,2) == 0);
		System.out.println(scoreCard.sumOf(dice,5) == 5);
		System.out.println(scoreCard.sumOf(dice) == 14);

	}

	private static ArrayList<Die> makeSomeDice(int[] values) {
		ArrayList<Die> dice = new ArrayList<Die>();
		for (int i : values) 
			dice.add(new Die(i));
		return dice;
	

	}
}
