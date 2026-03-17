package Day9;

public class StringComparison {

	public static void main(String[] args) {

		//Case 1
		/*String s1="Welcom";
		String s2="Welcom";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));*/
		
		//Case 2
		/*
		String s1=new String("Welcom");
		String s2=new String("Welcom");
		
		System.out.println(s1==s2);    //True
		System.out.println(s1.equals(s2));    //True
		 */
		
		//Case 3
		/*
		String s1="Welcom";
		String s2=new String("Welcom");
		
		System.out.println(s1==s2);     //False -  == compares the objects  
		System.out.println(s1.equals(s2));    //True - .equals comapare the value of the objects
		*/
		
		//Case 4
		String s1="Welcom";
		String s2=new String("Welcom");
		String s3=s2;
		
		System.out.println(s1==s2);  //False
		System.out.println(s1.equals(s2));    //True
		
		System.out.println(s1==s3);   //False
		System.out.println(s1.equals(s3));   //True
		
		System.out.println(s2==s3);  //True
		System.out.println(s2.equals(s3));   //True
	}

}
