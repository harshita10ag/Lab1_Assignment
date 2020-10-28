/**
 * 
 * @author HARSHITA AGARWAL
 * DESC-modifies it such that the each of the digit in the newly formed number
 * is equal to the difference between two consecutive digits in the original number.
 *
 */

public class DifferenceConsecutive {
	public static void main(String[] args) {
		System.out.println(modifyNumber(685471)); //call the method

	}

	public static int modifyNumber(int number) { // method to modify each of the digit in the newly formed number.
		String numberString = Integer.toString(number); // converting integer to string
		StringBuffer sb = new StringBuffer("");
		sb.append(numberString.charAt(numberString.length() - 1));
		for (int i = numberString.length() - 2; i >= 0; i--) {
			int newDigit = Math.abs(Integer.parseInt(Character.toString(numberString.charAt(i)))
					- Integer.parseInt(Character.toString(numberString.charAt(i + 1))));
			sb.append(Integer.toString(newDigit));
		}
		return Integer.parseInt(sb.reverse().toString());
	}
}
