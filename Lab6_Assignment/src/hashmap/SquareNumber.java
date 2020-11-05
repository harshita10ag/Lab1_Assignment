package hashmap;

/**
 * an array of numbers and returns the numbers and their squares in Hashmap
 */
import java.util.*;

public class SquareNumber {
	public static void main(String[] args) {
		/**
		 * create an array and insert integer value
		 */
		int sqNum[] = { 5, 6, 8, 1, 4, 2 };
		/**
		 * creating a map variable and call the getSquares()n function and print the
		 * valuse with the key
		 */
		Map<Integer, Integer> squareNum = getSquares(sqNum);
		System.out.println(squareNum);

	}

	private static Map<Integer, Integer> getSquares(int[] sqNum) {
		/**
		 * creating a map variable with the hashmap object
		 */
		Map<Integer, Integer> squareMap = new HashMap<>();
		/**
		 * square the number and put the value in squareMap variable
		 */
		for (int square : sqNum) {
			squareMap.put(square, square * square);
		}
		return squareMap;
	}

}
