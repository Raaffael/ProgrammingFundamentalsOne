
public class Palindrome {

	public static void main(String[] args) {
		System.out.println(takeWhitespace("Hello Hello").equals("HelloHello"));
		System.out.println(isPalindrome("racecar") == true);
		System.out.println(isPalindrome("Was it a car or a cat i saw") == true);
		System.out.println(isPalindrome("Java") == false);
	}

	private static boolean isPalindrome(String phrase) {
		String testPhrase = takeWhitespace(phrase).toLowerCase();
		for (int i= 0; i<testPhrase.length()/2; i++) {
			if (testPhrase.charAt(i) != testPhrase.charAt(testPhrase.length()-(i+1))) {
				return false;
			}
		}
		return true;
	}

	private static String takeWhitespace(String phrase) {
		String noWhiteSpacePhrase = "";
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) != ' ') {
				noWhiteSpacePhrase += phrase.charAt(i);
			}
		}
		return noWhiteSpacePhrase;
	}

}