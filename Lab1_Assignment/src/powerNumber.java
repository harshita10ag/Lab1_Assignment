/**
 * 
 * @author HARSHITA AGARWAL	
 * Date--21-10-2020
 * Desc-- check if a number is a power of two or not
 *
 */
import java.util.*;
public class powerNumber {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean result=checkNumber(num);
		if(result==true) {
			System.out.println(num+" is power of 2");
		}
		else {
			System.out.println(num+" is not power of 2");
		}
	}

	private static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		return false;
		while(n!=1) {
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}
}
