
public class FunctionTester {

	public static void main(String[] args) {
		System.out.println(DealerUI.rightPad("12345", 12).equals("12345       "));
		//System.out.println(DealerUI.rightPad("12345", 12).equals("12345       "));
		System.out.println(DealerUI.rightPad("12345", 3).equals("123"));
		System.out.println(DealerUI.rightPad(12, 5).equals("12   "));
		//System.out.println(DealerUI.rightPad("",  5, "-").equals("-----"));
		//System.out.println(DealerUI.rightPad("abc",  5, "*").equals("abc"));


	}

}
