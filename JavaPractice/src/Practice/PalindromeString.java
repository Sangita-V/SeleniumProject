package Practice;

public class PalindromeString {

	public static void main(String[] args) {

		String str="nitin";
		//Using charAt method
		
		char[] ch=new char[str.length()];
		for(int i=str.length()-1,j=0; i>=0; i--)
		{
			ch[j++]=str.charAt(i);
		}
		
		String temp = new String(ch);
		
		if(temp.equals(str)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}
		//Using toCharArray() method
/*		char[] charArray = str.toCharArray();
		char[] rev= new char[str.length()];
		int j=0;
		for(int i=str.length()-1; i>=0; i--)
		{
			rev[j++]=charArray[i];
		}
		
		String v = new String(rev);
		if(str.equals(v)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	*/	
		
	
	}
}
