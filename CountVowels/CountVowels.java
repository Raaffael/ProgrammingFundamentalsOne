
public class CountVowels {
	
	public static void main(String[] args) {
		System.out.println(isVowel('a') == true);
		System.out.println(isVowel('B') == false);
		System.out.println(countVowels("Alphabet") == 3);
		System.out.println(countVowels("aeiOU") == 5);
		System.out.println(countVowels("The quick brown fox jumps over the lazy dog") == 11);
	}

	private static boolean isVowel(char c) {
		//if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') ||
		//(c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')){
		return ("AEIOUaeiou".contains(Character.toString(c)));
			//return true;
		//}
		//return false;
	}

	private static int countVowels(String phrase) {
		int vowels = 0;
		for (int i = 0; i <= phrase.length()-1; i++) {
		    if (isVowel(phrase.charAt(i))) {
			vowels++;
		    }
		}
		return vowels;
	}

}
