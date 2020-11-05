package hashmap;

/**
 * character array and count the number of times each character is present in the array.
 */
import java.util.*;

public class CountCharaterArray {
	public static void main(String[] args) {
		/**
		 * all character insert in character array call the countChars function and
		 * print the value
		 */
		char[] character = { 'd', 'e', 'a', 'r', 'w', 'a', 'd' };
		Map<Character, Integer> charOccurence = countChars(character);
		System.out.println(charOccurence);
	}

	private static Map<Character, Integer> countChars(char[] character) {
		/**
		 * creating a hashmap object
		 */
		Map<Character, Integer> countChar = new HashMap<Character, Integer>();
		/**
		 * check the character one by one is same or not if same then add +1 if not then
		 * add 1
		 */
		for (char ch : character) {
			if (countChar.containsKey(ch)) {
				countChar.put(ch, countChar.get(ch) + 1);
			} else {
				countChar.put(ch, 1);
			}
		}
		/**
		 * put all the character with the occurrence
		 */
		for (Map.Entry<Character, Integer> entry : countChar.entrySet()) {
			countChar.put(entry.getKey(), entry.getValue());
		}
		return countChar;
	}

}
