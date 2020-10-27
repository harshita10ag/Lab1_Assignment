/**
 * 
 * @author HARSHITA AGARWAL
 * Date-24-10-2020
 * Desc--. A string is considered a positive string, 
 * if on moving from left to right each character in the String
 *  comes after the previous characters in the Alphabetical order
 *
 */
import java.util.*;
public class AlphabeticalOrder {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String"); //input
		String str=sc.next();
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
		}
		Arrays.sort(ch);
		for(int i=0;i<str.length();i++) 
			if(ch[i]!=str.charAt(i))  //check character one by one is alphabetic order 
				System.out.println(str +" is not Positive String");
			
		System.out.println(str+" is Positive String");
			
		
	}

}
