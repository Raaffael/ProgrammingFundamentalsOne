public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int area() {
		return this.length * this.width;
	}

	public int perimeter() {
		return (this.length *2) + (this.width *2);
	}

	public float diagonal() {
		return (float)(Math.hypot(this.width, this.length));
	}

	public boolean isSquare() {
		return this.length == this.width;
	}

}
