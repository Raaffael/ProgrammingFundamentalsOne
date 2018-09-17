
public class Product {
	private String sku;
	private String description;
	private float price;
	private int quantity;
	
	public Product(String sku, String description, float price, int quantity) {
		this.sku = sku;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	public String sku() {
		return this.sku;
	}
	public String description() {
		return this.description;
	}
	public float price() {
		return this.price;
	}
	public Product clone(int newQuantity) {
		Product clonedProduct = new Product(this.sku(), this.description(), this.price(), newQuantity);
		return clonedProduct;
	}
	public int quantity() {
		return this.quantity;
	}
	public boolean removeQuantity(int quantityToRemove) {
		if (this.hasEnoughQuantity(quantityToRemove)) {
			this.quantity -= quantityToRemove;
			return true;
		}
		return false;
	}
	private boolean hasEnoughQuantity(int quantityToCheck) {
		if (this.quantity() >= quantityToCheck)
			return true;
		return false;
	}

}
