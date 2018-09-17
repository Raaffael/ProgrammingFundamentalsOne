
public class Aisle {
	private int aisleNumber;
	private String aisleDescription;
	private Product[] listOfProducts;
	
	public Aisle(int aisleNumber, String aisleDescription, Product[] listOfProducts) {
		this.aisleNumber = aisleNumber;
		this.aisleDescription = aisleDescription;
		this.listOfProducts = listOfProducts;
	}
	public int aisleNumber() {
		return this.aisleNumber;
	}
	public String aisleDescription() {
		return this.aisleDescription;
	}
	public Product[] products() {
		return this.listOfProducts;
	}

}
