
public class ShoppingCartTester {

	public static void main(String[] args) {
		ShoppingCart myCart = new ShoppingCart();
		System.out.println(myCart.Products().length == 20);
		Product myProduct = new Product("1001", "Tamales", 10.00f, 20);
		System.out.println(myCart.addProduct(myProduct, 2) == true);
		System.out.println(myCart.Products()[0].quantity() == 2);
		System.out.println(myProduct.quantity() == 18);
		System.out.println(myCart.addProduct(myProduct, 4) == true);
		System.out.println(myCart.Products()[1].quantity() == 4);
		System.out.println(myCart.balanceDue() == 60.00f);
		
		
	}

}
