
public class VehicleTester {

	public static void main(String[] args) {
		Vehicle myCar = new Vehicle("Honda", "Pilot", 2350.54f, 5);
		System.out.println(myCar.make() == "Honda");
		System.out.println(myCar.model() == "Pilot");
		System.out.println(myCar.price() == 2350.54f);
		System.out.println(myCar.quantity() == 5);
		
		System.out.println(myCar.hasEnoughQuantity(5) == true);
		System.out.println(myCar.hasEnoughQuantity(6) == false);
		
		System.out.println(myCar.removeQuantity(6) == false);
		System.out.println(myCar.quantity() == 5);
		
		System.out.println(myCar.removeQuantity(3) == true);
		System.out.println(myCar.quantity() == 2);
		
		Vehicle myCar2;
		myCar2 = myCar.clone(2);
		System.out.println(myCar2.make() == myCar.make());
		System.out.println(myCar2.model() == myCar.model());
		System.out.println(myCar2.price() == myCar.price());
		System.out.println(myCar2.quantity() == 2);
		//Assert myCar2 (make model price) == myCar1 (make model price)
		//Assert myCar2.quantity == 2
	}

}
