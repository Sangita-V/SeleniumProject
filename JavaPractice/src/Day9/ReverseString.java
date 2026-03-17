package Day9;

public class ReverseString {

	public static void main(String[] args) {

//		//Approach 1
//		String name="Sangita";
//		String rev="";
//		
//		for(int i=name.length()-1; i>=0; i--)
//		{
//			rev=rev+name.charAt(i);
//		}
//		System.out.println(rev);

		//Approach 2  - Without using string method
		
//		String name="Sangita";
//		String rev="";
//		
//		char a[]=name.toCharArray();
//		
//		for(int i=a.length-1; i>=0; i--)
//			{
//				rev=rev+a[i];
//			}
//			System.out.println(rev);

		
		//Approach 3   - Using StringBuffer class
		
		StringBuffer str=new StringBuffer("Welcome");
		System.out.println(str.reverse());
		
		//Approach 4  -  Using StringBuilder class
		
		StringBuilder s=new StringBuilder("Sangita");
		System.out.println(s.reverse());
		

	}
}
