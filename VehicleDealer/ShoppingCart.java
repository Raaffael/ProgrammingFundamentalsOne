
public class ShoppingCart {

	private Vehicle[] Vehicles;
	private int numberOfCars;
	
	public ShoppingCart() {
		this.Vehicles = new Vehicle [20];
		numberOfCars = 0;
	}
	public Vehicle[] Vehicles() {
		return this.Vehicles;
	}
	public boolean addVehicle(Vehicle car, int quantity) {
		if(car.removeQuantity(quantity)) {
			this.Vehicles[numberOfCars] = car.clone(quantity);
			numberOfCars++;
			return true;
		}
		return false;
	}
	public float balanceDue() {
		float balanceDue = 0;
		for (int i = 0; i < numberOfCars; i++) {
			balanceDue += this.Vehicles[i].price() * this.Vehicles[i].quantity();
		}
		return balanceDue;
	}

}
