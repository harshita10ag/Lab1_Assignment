/**
 * 
 * @author HARSHITA AGARWAL
 * Date--22-10-2020
 * Desc--both recursive and non-recursive functions to print the nth value of the Fibonacci sequence
 *
 */
import java.util.*;
public class FibonacciSeries {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int Withoutresult=withoutFib(n);
		System.out.println("Without recursive " +Withoutresult);
		System.out.println("With Recursive "+withFib(n));
	}
	static int withoutFib(int n)
	{
		int a = 0, b = 1, c=0;
		if(n == 1)
		return 0;
		else if(n == 2)
		return 1;
		else
		{
			for(int i = 2; i < n; i++)
			{
				c = a+b;
				a = b;
				b = c;
			}
			return c;
		}
	}
	static int withFib(int n)
	{
		if(n == 1)
		return 0;
		else if(n == 2)
		return 1;
		else
		{
			return withFib(n-1)+withFib(n-2);
		}
	}
	
	

}
