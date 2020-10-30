/**
 * Author-- Harshita Agarwal
 * Date-23-10-2020
 * Desc-- Two dimension array for storing salutation and name
 *
 */
public class SalutationName {
	public static void main(String ar[]) {
		String arr[][]=new String[2][];
		arr[0]=new String[] {"mr","ms","mrs"}; //salutation
		arr[1]=new String[] {"Praveen","Nisha","Neha","Aishwarya","Kartik","Dinesh"}; // person name
		for(int i=0;i<arr[1].length;i++) {
			if(arr[1][i]=="Praveen"|| arr[1][i]=="Kartik" || arr[1][i]=="Dinesh") {
				System.out.println(arr[0][0]+" "+ arr[1][i]); //mr with person name
			}
			else if(arr[1][i]=="Aishwarya") {
				System.out.println(arr[0][2]+" "+arr[1][i]); //mrs with person name
			}
			else {
				System.out.println(arr[0][1]+" "+arr[1][i]); // ms with person name
			}
		}
	}

}
