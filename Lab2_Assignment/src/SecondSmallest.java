/**
 * 
 * desc-- second smallest element in the array
 *
 */
import java.util.*;
public class SecondSmallest {
	public static void main(String ar[]) {
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //size of array
		int arr[]=new int[n]; //Instantiation
		System.out.println("Enter element of an array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt(); //Inserting element in an array
		}
		int result =getSecondSmallest(arr);
		System.out.println("Second Smallest element is ="+result); //displaying second smallest element
		
	}

	private static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		int temp; //use for swapping the value
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr[1]; //second smallest element
	}

	

}
