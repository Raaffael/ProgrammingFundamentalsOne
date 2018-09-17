import java.util.Scanner;
import java.text.NumberFormat;

public class DealerUI {
	private static NumberFormat formatter = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShoppingCart myCart = new ShoppingCart();
		Dealership myDealer = Repository.getDealership();
		boolean keepGoing = true;
		System.out.println("What is your name?");
		String customerName = scan.nextLine();
		System.out.println("Hello " + customerName + " welcome to Jony Cars");
		while (keepGoing) {
			System.out.println("Your shopping cart balance is: " + formatter.format(myCart.balanceDue()));
			displayListOfCarLots(myDealer.CarLots());
			System.out.println("Please pick a Car Lot.");
			String choice = scan.nextLine();
			if (choice.equals("return")) {
				keepGoing = false;
			}
			else {
				int lotNumber = Integer.parseInt(choice) - 1;
				if (lotNumber >= 0 &&lotNumber <= myDealer.CarLots().length -1) {
					CarLot chosenLot = myDealer.CarLots()[lotNumber];
					displayListOfVehicles(myDealer.CarLots()[lotNumber].Vehicles());
					System.out.println("Please pick a car:");
					String vehicleChoice = scan.nextLine();
					int vehicleNumber = Integer.parseInt(vehicleChoice) - 1;
					if (vehicleNumber >= 0 &&vehicleNumber <= chosenLot.Vehicles().length -1) {
						System.out.println("How many do you wish to buy?");
						String quantityChoice = scan.nextLine();
						int qty = Integer.parseInt(quantityChoice);
						//myCart.addVehicle(chosenLot.Vehicles()[vehicleNumber], qty);
						if (myCart.addVehicle(chosenLot.Vehicles()[vehicleNumber], qty)) 
							System.out.println(qty + " added to your cart.");
						else
							System.out.println("Sorry. We don't have that many.");
						
					}
				}
			}
		}
		scan.close();
		System.out.println("Thank you for shopping. Your balance is " + formatter.format(myCart.balanceDue()));
	}

	
	private static void displayListOfCarLots(CarLot[] lots) {
		for (int i = 0; i < lots.length; i++) {
			System.out.print((i+1) + " - ");
			System.out.println(lots[i].location());
		}
		
	}
	
	private static void displayListOfVehicles(Vehicle[] listOfVehicles) {
		System.out.print(rightPad("Option\t",6) + "\t");
		System.out.print(rightPad("Make\t",12) + "\t");
		System.out.print(rightPad("Model\t",12) + "\t");
		System.out.print(rightPad("Price\t",12) + "\t");
		System.out.println(rightPad("Qty\t",5) + "\t");


		//System.out.println(rightPad("", 6, "-") + "\t");
		System.out.println("---\t----\t-----\t-----\t----");
		int i = 1;
		for (Vehicle car : listOfVehicles) {
			System.out.print(i + "\t");
			System.out.print(rightPad(car.make(), 12) + "\t");
			System.out.print(rightPad(car.model(), 12)+ "\t");
			System.out.print(rightPad(formatter.format(car.price()), 12) + "\t");
			System.out.println(rightPad(car.quantity(), 5));
			i++;
			
		}
		
	}


	public static String rightPad(String phrase, int finalLength) {
		if (phrase.length() >= finalLength)
			return phrase.substring(0, finalLength);
		String spaces = "";
		for(int i = 0; i < finalLength - phrase.length(); i++)
			spaces += " ";
		//else
			//make it longer
		return phrase + spaces;
	}
	//public static String rightPad()


	public static String rightPad(int number, int finalLength) {
		// TODO Auto-generated method stub
		return rightPad(Integer.toString(number), finalLength);
	}
	
}
