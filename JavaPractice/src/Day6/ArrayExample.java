package Day6;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int[] a = {22,14,15,67,87,88,55,56,28,30,50,65,68};
		
		System.out.print("Even Numbers : ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
			System.out.print(a[i]+",");
			}
		}
	}

}
