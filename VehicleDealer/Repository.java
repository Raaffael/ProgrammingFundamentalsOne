
public class Repository {
	public static Dealership getDealership() {
		return new Dealership("NeelyCars", listOfCarLots());
	}

	private static CarLot[] listOfCarLots() {
		CarLot lot1 = new CarLot("Downtown", getListOfCars("Downtown"));
		CarLot lot2 = new CarLot("Northwest", getListOfCars("Northwest"));
		return new CarLot[] {lot1, lot2};	
	}
	private static Vehicle[] getListOfCars(String location) {
		if (location.equals("Downtown")) {
			Vehicle car1 = new Vehicle("Honda", "Civic", 2356.87f, 30);
			Vehicle car2 = new Vehicle("Honda", "Pilot", 12753.98f, 5);
			Vehicle car3 = new Vehicle("Honda", "CRV", 8904.90f, 3);
			Vehicle car4 = new Vehicle("Honda", "Accord", 7546.98f, 25);
			return new Vehicle[] {car1, car2, car3, car4};
		}
		if (location.equals("Northwest")) {
			Vehicle car1 = new Vehicle("Chevrolet", "Malibu", 2356.87f, 1);
			Vehicle car2 = new Vehicle("Chevrolet", "Impala", 12753.98f, 20);
			Vehicle car3 = new Vehicle("Chevrolet", "Corvette", 108904.90f, 2);
			Vehicle car4 = new Vehicle("Chevrolet", "Silverado", 7546.98f, 15);
			return new Vehicle[] {car1, car2, car3, car4};
		}
		return new Vehicle[0];

	}

}
