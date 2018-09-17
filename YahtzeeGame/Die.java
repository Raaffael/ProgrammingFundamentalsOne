
public class Die {

	final int sideUp;
	
	public Die() {
		this.sideUp = random(1,6);
	}
	public Die(int i) {
		this.sideUp = i;
	}
	private static int random(int lower, int upper) {
		return (int) (Math.random() * ((upper-lower) + 1)) + lower;
	}

}
