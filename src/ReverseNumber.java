
/**
 * 
 * DESC-- reverse the numbers in the array and returns the resulting array in sorted order
 *
 */
import java.util.*;

public class ReverseNumber {
	public static void main(String ar[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); //assign a value
		}
		sc.close();
		getSorted(arr);
	}

	static void getSorted(int arr[]) {
		int size = arr.length;
		int temp;
		/**
		 * Reversed array
		 */
		for (int i = 0; i < size / 2; i++) {
			temp = arr[i];
			arr[i] = arr[size - i - 1];
			arr[size - i - 1] = temp;
		}

		/* print the reversed array */
		System.out.println("Reversed Array: \n" + Arrays.toString(arr));

	}
}
