
public class ShoppingCartTester {

	public static void main(String[] args) {
		ShoppingCart myCart = new ShoppingCart();
		System.out.println(myCart.Vehicles().length == 20);
		Vehicle myCar = new Vehicle("Honda", "Pilot", 1000.00f, 10);
		System.out.println(myCart.addVehicle(myCar, 2) == true);
		System.out.println(myCart.Vehicles()[0].quantity() == 2);
		System.out.println(myCar.quantity() == 8);
		System.out.println(myCart.addVehicle(myCar, 4) == true);
		System.out.println(myCart.Vehicles()[1].quantity() == 4);
		System.out.println(myCart.balanceDue() == 6000.00f);
		
		System.out.println(myCart.addVehicle(myCar, 50) == false);
		System.out.println(myCar.quantity() == 4);

	}

}
