/**
 * 
 * @author HARSHITA AGARWAL
 * Date-24-10-2020
 * Desc-reads a line of integers and then displays each integer and the sum of all integers. 
 * (Use String Tokenizer class)?
 *
 */
import java.util.*;
public class Tokenizers {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer");
		String str=sc.next(); //input string separate by +
		String num[]=str.split(",");
		int sum1=0;
		for(String i:num) {
			sum1+=Integer.parseInt(i);
		}
		System.out.println("The sum of string "+sum1);
	}
}
