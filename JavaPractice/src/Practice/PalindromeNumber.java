package Practice;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num=52325;
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int a=num%10;
			rev=(rev*10)+a;
			num=num/10;
		} 
		System.out.println(num +"=="+ rev);
		
		if(rev==temp)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
		
		
//		for(int i=0; i<=num; i++)
//		{
//			int a=num%10;
//			rev=(rev*10)+a;
//			num=num/10;	
//		}
//		System.out.println(rev);
	}

}
