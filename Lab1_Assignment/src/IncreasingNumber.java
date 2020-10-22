/**
 * 
 * @author HARSHITA AGARWAL
 * Date-21-10-2020
 * Desc--check if a number is an increasing number
 *
 */
import java.util.*;
public class IncreasingNumber {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		boolean result=checkNumber(number);
		if(result==true) {
			System.out.println(number+" is increasing number");
		}
		else {
			System.out.println(number+" is not increasing number");
		}
	}

	private static boolean checkNumber(int number) {
		// TODO Auto-generated method stub
		String str=Integer.toString(number);
		int flag=0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>str.charAt(i+1)) {
				flag=1;
				break;
			}
			
		}
		if(flag==1) {
			return false;
		}
		else {
			return true;
		}
	}
}
