
public class Store {
	private String storeName;
	private Aisle[] listOfAisles;
	
	public Store(String storeName, Aisle[] listOfAisles) {
		this.storeName = storeName;
		this.listOfAisles = listOfAisles;
	}
	public String storeName() {
		return this.storeName;
	}
	public Aisle[] Aisles() {
		return this.listOfAisles;
	}

}
