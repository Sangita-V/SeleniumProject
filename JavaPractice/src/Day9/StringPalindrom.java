package Day9;

public class StringPalindrom {
	public static void main(String[] args) {
		
		String s="madam";
		String p="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			p=p+s.charAt(i);
		}
		 if(s.equals(p)) 
		 { 
			 System.out.println("String is a palindrom");
		 } 
		 else 
		 {
		 System.out.println("String is not palindrom"); 
		 }
		//System.out.println(p);
	}

}
