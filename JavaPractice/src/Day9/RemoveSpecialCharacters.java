package Day9;

import java.util.Arrays;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {

		String s="s#a_ng%it$a12";
		
		/*char[] charArray = s.toCharArray();
				
		StringBuilder result =new StringBuilder();
		for(int i=0; i<charArray.length; i++)
		{
			if(Character.isLetterOrDigit(charArray[i])) {
				result.append(charArray[i]);
			}
		}
		System.out.println(result);
		*/
		
		StringBuilder result=new StringBuilder();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9')
			{
				result.append(ch);
			}
			
		}
		System.out.println(result);
	}

}

//int double long char -> preitive variables 
//Integer Double Long Character  -> wrapper class