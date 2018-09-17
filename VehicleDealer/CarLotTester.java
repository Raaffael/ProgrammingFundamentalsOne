
public class CarLotTester {

	public static void main(String[] args) {
		CarLot myLot = new CarLot("Downtown", listOfVehicles());
		System.out.println(myLot.location() == "Downtown");
		System.out.println(myLot.Vehicles().length == listOfVehicles().length);

	}

	private static Vehicle[] listOfVehicles() {
		Vehicle car1 = new Vehicle("make", "model", 65.00f, 0);
		return new Vehicle[] {car1, car1, car1};
		
	}

}
