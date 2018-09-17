
public class Repository {
	public static Store getStore() {
		return new Store("El Compa", listOfAisles());
	}
	private static Aisle[] listOfAisles() {
		Aisle column1 = new Aisle(1, "Food", getProductList("Food"));
		Aisle column2 = new Aisle(2, "Cleaning Supplies", getProductList("Cleaning Supplies"));
		Aisle column3 = new Aisle(3, "Drinks", getProductList("Drinks"));
		Aisle column4 = new Aisle(4, "Bakery", getProductList("Bakery"));
		return new Aisle[] {column1, column2, column3, column4};
	}
	public static Product[] getProductList(String listOfProduct) {
		if (listOfProduct.equals("Food")) {
			Product item1 = new Product("1001", "Tamales", 10.55f, 15);
			Product item2 = new Product("1002", "Menudo", 30.5f, 13);
			Product item3 = new Product("1003", "Flautas", 7.5f, 7);
			return new Product[] {item1, item2, item3};
		}
		if (listOfProduct.equals("Cleaning Supplies")) {
			Product item1 = new Product("2001", "Habon Zote", 9.55f, 11);
			Product item2 = new Product("2002", "Pinol", 25.5f, 97);
			Product item3 = new Product("2003", "Mop", 70.5f, 96);
			return new Product[] {item1, item2, item3};
		}
		if (listOfProduct.equals("Drinks")) {
			Product item1 = new Product("3001", "Manzanita", 10.75f, 10);
			Product item2 = new Product("3002", "Coke", 10.55f, 50);
			Product item3 = new Product("3003", "Fanta", 10.60f, 30);
			return new Product[] {item1, item2, item3};
		}
		if (listOfProduct.equals("Bakery")) {
			Product item1 = new Product("4001", "Pan Dulce", 7.35f, 40);
			Product item2 = new Product("4002", "Empanadas", 15.00f, 21);
			Product item3 = new Product("4003", "Pan Blanco", 3.20f, 20);
			return new Product[] {item1, item2, item3};
		}
		return new Product[0];
	}
	
}
