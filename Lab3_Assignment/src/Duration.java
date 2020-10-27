/**
 * 
 * @author HARSHITA AGARWAL
 * date-24-10-2020
 * Desc--Create a method to accept date and print the duration
 *  in days, months and years with regards to current system date.
 *
 */
import java.util.*;
import java.text.*;
public class Duration {
	public static void main(String args[]) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String str=formatter.format(date);
		String ch[]=str.split("/");
		System.out.println("Date="+ch[0]);
		System.out.println("Month="+ch[1]);
		System.out.println("Year="+ch[2]);
	}
}
