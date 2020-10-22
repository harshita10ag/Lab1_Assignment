/**
 * 
 * @author HARSHITA AGARWAL
 * DATE 21-10-2020
 * DESC--calculate the sum of first n natural numbers which are divisible by 3 or 5.
 *
 */
import java.util.*;
public class sumNaturalNumber {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int result=calculateSum(num);
		System.out.println(result);
	}

	private static int calculateSum(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=n;i++) {
			if((i%3==0) || (i%5==0)) {
				sum+=i;
//				System.out.println(sum);
			}
		}
		return sum;
	}

}
