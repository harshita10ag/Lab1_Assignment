/**
 * 
 * Desc-- removes all the duplicates in the array. Return the resulting array in descending order
 */
import java.util.*;
public class DuplicateArray {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		System.out.println("Enter the element of an array");
		int arr[]=new int[n];
		/**
		 * Assign a value
		 */
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		n=modifyArray(arr);
		System.out.println("After Duplicate Element");
		for (int i=0; i<n; i++) 
			System.out.print(arr[i]+" "); 
	}

	private static int modifyArray(int[] arr) {
		
		int n=arr.length; //size of an array
		if (n==0 || n==1){  //array is empty or contain 1 element
            return n;  
        }  
        int[] temp = new int[n]; 
        Arrays.sort(arr); //sorting array
        int j = 0;  
        /**
         * check duplicate element
         */
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Remove Duplicate array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
}
