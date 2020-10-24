/**
 * 
 * DESC--sort in alphabetical order. The elements in the left half should be completely in uppercase
 *  and the elements in the right half should be completely in lower case. Return the resulting array.
 *
 */
import java.util.*;

public class SortString {
	
		public static void main(String[] args) {
			String[] names = new String[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the names: ");
			for (int i=0;i<((names.length/2)+1 );i++ ) {
				names[i] = sc.next();
			}
			for(int i=((names.length/2)+1 );i<names.length;i++) {
				names[i]=sc.next();
		    }
			Arrays.sort(names);
			for (int i=0;i<names.length ;i++) {
				System.out.println("Name are " + names[i]);
			}
			if(names.length/2==0) {
				for(int i=0;i<names.length/2;i++) {
					
					System.out.println(names[i].toUpperCase());
				}
			}
		}
}