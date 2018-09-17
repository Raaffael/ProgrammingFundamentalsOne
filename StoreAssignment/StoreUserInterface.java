import java.util.Scanner;
import java.text.NumberFormat;

public class StoreUserInterface {
	private static NumberFormat formatter = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShoppingCart myCart = new ShoppingCart();
		Store myStore = Repository.getStore();
		System.out.println("What is your name?");
		String customerName = scan.nextLine();
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("Your cart balance is " + formatter.format(myCart.balanceDue()));
			displayListOfAisles(myStore.Aisles());
			System.out.println("Please pick an Aisle or enter \"return\" to exit the store.");
			String choice = scan.nextLine();
			if (choice.equals("return")) {
				
				keepGoing = false;
				
			}
			else {
				int aisleNum = Integer.parseInt(choice) - 1;
				if (aisleNum >= 0 && aisleNum <= myStore.Aisles().length - 1) {
					Aisle chosenAisle = myStore.Aisles()[aisleNum];
					displayProductList(chosenAisle.products());
					System.out.println("Please pick a product:");
					String productChosen = scan.nextLine();
					int productNumber = Integer.parseInt(productChosen) - 1;
					if (productNumber >= 0 && productNumber <= chosenAisle.products().length - 1) {
						System.out.println("How many would you like to buy?");
						String quantityNeeded = scan.nextLine();
						int qty = Integer.parseInt(quantityNeeded);
						if(myCart.addProduct(chosenAisle.products()[productNumber], qty))
							System.out.println(qty + " of " + chosenAisle.products()[productNumber].description() + " added to your cart.");
						else
							System.out.println("Sorry, we don't have that many.");
					}
					
					
				}
			}
		}
		scan.close();
		System.out.println("Thank you for shopping " + customerName);
		System.out.println("Your total is " + formatter.format(myCart.balanceDue()));
	}
	private static void displayProductList(Product[] listOfProducts) {
		System.out.print(rightPad("Option", 6) + "\t");
		System.out.print(rightPad("SKU", 4) + "\t");
		System.out.print(rightPad("Description", 11) + "\t");
		System.out.print(rightPad("Price", 5) + "\t");
		System.out.println(rightPad("Qty", 5));

		System.out.println("------\t----\t-----------\t-----\t---");
		int i = 1;
		for (Product item : listOfProducts) {
			System.out.print(i + "\t");
			System.out.print(rightPad(item.sku(), 4) + "\t");
			System.out.print(rightPad(item.description(), 12)+ "\t");
			System.out.print(rightPad(formatter.format(item.price()), 6) + "\t");
			System.out.println(rightPad(item.quantity(), 5));
			i++;
			
		}
		
	}


	public static String rightPad(String phrase, int finalLength) {
		if (phrase.length() >= finalLength)
			return phrase.substring(0, finalLength);
		String spaces = "";
		for(int i = 0; i < finalLength - phrase.length(); i++)
			spaces += " ";
		return phrase + spaces;
	}

	public static String rightPad(int number, int finalLength) {
		return rightPad(Integer.toString(number), finalLength);
	}
	private static void displayListOfAisles(Aisle[] lsOfAi) {
		for(int i = 0; i < lsOfAi.length; i++) {
			System.out.print((i+1) + " - ");
			System.out.println(lsOfAi[i].aisleDescription());
			
		}
	}
	
}
