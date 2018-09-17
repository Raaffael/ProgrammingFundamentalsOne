
public class Vehicle {

	private String make;
	private String model;
	private float price;
	private int quantity;

	public Vehicle(String make, String model, float price, int quantity) {
		this.make = make;
		this.model = model;
		this.price = price;
		this.quantity = quantity;
	}

	public String make() {
		return this.make;
	}

	public String model() {
		return this.model;
	}

	public float price() {
		return this.price;
	}

	public int quantity() {
		return this.quantity;
	}

	public Vehicle clone(int newQuantity) {
		Vehicle clonedCar = new Vehicle(this.make(), this.model(), this.price(), newQuantity);
		return clonedCar;
	}

	public boolean hasEnoughQuantity(int quantityToCheck) {
		if (this.quantity() >= quantityToCheck)
			return true;
		return false;
	}

	public boolean removeQuantity(int quantityToRemove) {
		if (this.hasEnoughQuantity(quantityToRemove)) {
		this.quantity -= quantityToRemove;
		return true;
		}
		return false;
	}

}
