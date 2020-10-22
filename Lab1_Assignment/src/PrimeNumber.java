/**
 * 
 * @author HARSHITA AGARWAL 
 * DATE 21-10-2020
 * DESC-PRIME NUMBER
 *
 */
import java.util.*;
public class PrimeNumber {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		primeNumber(num);
	}

	private static int primeNumber(int num) {
		// TODO Auto-generated method stub
	
		for (int i = 2; i <= num; i++) {
		    int isPrime = 1;
		    for (int j = 2; j < i; j++) {
		      if (i % j == 0) {
		        isPrime = 0;
		        break;
		      }
		    }
		    if (isPrime == 1) {
		        System.out.print(i+" "); //result print
		    }
		  }
		  return 0;
		
	}

}
