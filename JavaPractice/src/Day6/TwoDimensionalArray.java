package Day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		//Declaring array
		
		//Approch 1
		/*int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;	
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		//Approch 2
		int a[][]= {    {100,200},
						{300,400},
						{500,600}    };
		
		//Find size of an array
		System.out.println(a.length);
		System.out.println(a[2].length);   //length of 2nd row
		
		//Read single value from array
		System.out.println(a[2][1]);  
		
		//Read all the values using normal for loop
		for(int r=0; r<a.length; r++) 
		{
			for(int c=0; c<a[r].length; c++)
			{
				System.out.print(a[r][c]+"  ");
			}
			System.out.println();
		}
		
		//Read all the values using for...each loop  /enhanced for loop
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
	}
}
