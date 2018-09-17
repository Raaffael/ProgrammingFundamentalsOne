
public class CarLot {
	private String location;
	private Vehicle[] listOfVehicles;

	public CarLot(String location, Vehicle[] listOfVehicles) {
		this.location = location;
		this.listOfVehicles = listOfVehicles;
	}

	public String location() {
		return this.location;
	}

	public Vehicle[] Vehicles() {
		return this.listOfVehicles;
	}

}
