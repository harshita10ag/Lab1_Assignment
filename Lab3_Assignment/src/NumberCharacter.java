/**
 * 
 * @author HARSHITA AGARWAL	
 * Date-24-10-2020
 * Desc--displays the number of characters, lines and words in a text
 *
 */
public class NumberCharacter {
	public static void main(String args[]) {
		String str="displays the number of characters, lines and words in a text";
		int words=1,character=0,line=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				words++; //Total words
			}
			if(str.charAt(i)=='\n')
			{
				line++; //total Line
			}
	        character++; //total character
		}

		System.out.println("characters = "+ character+" \nwords = "+words+"\nLines = "+line);
	}
}  
		
	

