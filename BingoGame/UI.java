import java.util.Scanner;
public class UI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		BingoCard newCard = new BingoCard(); 
		BingoCard newCard2 = new BingoCard();
		MasterCard newCards = new MasterCard();
        newCard.printCard();
        newCard2.printCard();
        System.out.println("Welcome to Bingo!");
		System.out.println("Which set of rules would you like to use?");
		System.out.println("1. Four Corners");
		System.out.println("2. X");
		System.out.println("3. Z");
		System.out.println("4. Blackout");
		System.out.println("5. Small Box");
		System.out.println("6. Big Box");
		System.out.println("7. Straight Lines(Horizontal/Vertical/Diagonal)");
        int ruleChoice = sc.nextInt();
        int turn = 0;
        while(!newCard.checkBingo(ruleChoice)&&!newCard2.checkBingo(ruleChoice)){ 
        	int cardNumber = 1;	
            System.out.println("Press enter to draw the next number: "); 
            sc.nextLine();
            int input = newCards.number().get(turn)+1; 
            newCard.checkMatch(input);
            newCard2.checkMatch(input);
            System.out.println("Card: "+cardNumber++);
            newCard.printCard();
            System.out.println("Card: "+cardNumber++);
            newCard2.printCard();
            System.out.println("Number drawn: " + input);
            turn++;
        }
        sc.close();
    if(newCard.checkBingo(ruleChoice)==true)
    	System.out.println("Card 1 WINS!"); 
    if(newCard2.checkBingo(ruleChoice)==true)
    	System.out.println("Card 2 WINS!");

	}

}
