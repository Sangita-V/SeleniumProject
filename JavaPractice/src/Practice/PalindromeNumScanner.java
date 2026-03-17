package Practice;

import java.util.Scanner;

public class PalindromeNumScanner {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
	
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		
		while(num>0)
		{
			int a=num%10;
			rev=(rev*10)+a;
			num=num/10;
		}
		
		System.out.println("Reverse of number is:"+rev);
		
		if(temp==rev)
		{
			System.out.println("Number is a palindrome");
		}
		else
		{
			System.out.println("Number is not a Palindrome");
		}
		
	}

}
