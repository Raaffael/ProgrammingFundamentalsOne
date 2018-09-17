import java.util.ArrayList;
import java.util.Scanner;

public class YahtzeeUI {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean gameIsRunning = true;
		while (gameIsRunning) {
			Yahtzee theGame = new Yahtzee();
			while (theGame.isNotOver()) {
				turn(theGame);
				System.out.println();
			}
			score(theGame);
			System.out.println("Final Score is " + theGame.scoreCard().finalScore());
			gameIsRunning = playAgain();
		}
		System.out.println("GAME OVER");
		scan.close();
	}
	
	public static boolean rollAgain() {

		return (ask(scan, "Are you ready to roll again?")).toUpperCase().equals("Y");
	}

	public static String ask(Scanner scan, String prompt) {
		System.out.println(prompt);
		String answer = scan.nextLine();
		return answer;
	}

	private static void showDice(Yahtzee theGame) {
		for (Die aDie : theGame.dice()) 
			System.out.print(aDie.sideUp + "\t");
		System.out.println();
	}

	private static void score(Yahtzee theGame) {
		YahtzeeScoreCardRow[] rows = theGame.scoreCard().rows(theGame.dice());
		for (int i = 0; i<rows.length;i++) {
			if (rows[i].isScored()) {
				System.out.println("    " + rows[i].label + "\t" + rows[i].score());
			}else {
				System.out.println((i+1) + ".   " + rows[i].label + "\t(" + rows[i].score() + ")");;
			}
			
		}
	}

	private static void showOptions(Yahtzee theGame) {
		int row = 0;
		do{
			String choice = ask(scan, "  Please pick a row to score:");
			row = Integer.parseInt(choice) - 1;
			theGame.pickScore(row);
		} while(!theGame.scoreCard().rows(theGame.dice())[row].isScored());
			theGame.pickScore(row);
	}


	private static boolean playAgain() {
		return (ask(scan, "Play Again?")).toUpperCase().equals("Y");
	}

	private static void turn(Yahtzee theGame) {
		System.out.println(theGame.turnsLeft() + " turns left.");
		theGame.startTurn();
		while (theGame.inATurn()) {
			ask(scan, "Are you ready to roll?").toUpperCase().equals("Y");
			score(theGame);
			showDice(theGame);
			if (theGame.rollsLeft() > 0)
				showOptions(theGame);
			else
				showOptions(theGame);
		}
	}

}