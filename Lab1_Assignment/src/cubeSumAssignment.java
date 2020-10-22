/**
 Author--Harshita Agarwal 
 Date--21-10-2020
 Desc-- Sum of cube 
 **/
import java.util.*;
public class cubeSumAssignment {
	public static void main(String[] ar) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt(); 
		int result=cubeSum(n); //method called
		System.out.println("Sum of cube number is = "+result);
	}

	private static int cubeSum(int n) {
		// TODO Auto-generated method stub
		int a,cube,cubes=0;
		int number=n;
		do {
			a=number%10;
			cube=a*a*a;
			cubes+=cube;
			number=number/10;
		}while(number!=0);
		return cubes;
	}
}
