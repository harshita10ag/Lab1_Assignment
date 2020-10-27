/**
 * 
 * @author HARSHITA AGARWAL	
 * Date-24-10-2020
 * Desc-create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .
 *
 */
import java.util.*;
import java.lang.*;
public class MirrorImageString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("Enter a string");
		str=sc.next(); //input a string
		String result=getImage(str);
		System.out.println("Mirror Image is\n "+str+" | "+result);
		
	}

	private static String getImage(String str) {
		// TODO Auto-generated method stub
		StringBuffer result= new StringBuffer(str);
		result.reverse();	//string reversing
		String reverse=result.toString();	//convert to string
		return reverse;
	}
}
