/**
 * 
 * @author HARSHITA AGARWAL
 * DATE -- 21-10-2020
 * DESC--Simulates a traffic light
 *
 */
import java.util.*;
public class TrafficLight {
	
	public static void main(String ar[]) {
		System.out.println("Seletc the traffic Light\n 1. Red\n 2. Yellow\n 3. Green");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		String light=TrafficLightChoose(ch);
		System.out.println(light);
	}

	private static String TrafficLightChoose(int ch) {
		// TODO Auto-generated method stub
		String light = null;
		switch(ch) {
		case 1:
				light ="Stop";
				break;
		case 2: 
				light ="Ready";
				break;
		case 3:	
				light ="Start";
				break;
		default:
				light="No message";
		}
		return light;
	}

}
