
public class Four {

	public static void main(String[] args) {
		 System.out.println(areaOfARectangle(4, 8) == 32);
		 System.out.println(average(23.0f, 45.0f, 90.0f) == 52.666667f);
		 System.out.println(charsAtTheEnd("This is a sentence", 6).equals("ntence"));
		 System.out.println(isPrimeNumber(7) == true);
		 System.out.println(isPrimeNumber(9) == false); 

	}
	public static int areaOfARectangle(int m, int j) {
		return m * j;
	}
	public static float average(float f, float g, float h) {
		return ((f + g + h)/3);
	}
	public static String charsAtTheEnd(String sente, int z) {
		return sente.substring(sente.length() - z);
	}
	public static boolean isPrimeNumber(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}