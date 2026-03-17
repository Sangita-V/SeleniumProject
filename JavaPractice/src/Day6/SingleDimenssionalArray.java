package Day6;

public class SingleDimenssionalArray {

	public static void main(String[] args) {

		//declaring array

        //Approach 1 : Use when we know exactly how much elements need to added
        /*int a[] = new int[5];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;*/

        //Approach2 :  use when dont know the exact lenght of array
        int a[] = {100, 200, 300, 400, 500};
        
        //find length of array
        System.out.println(a.length);
        
        //reading single value from array
        System.out.println(a[4]);    //4 is index
        
        //Reading all the values from array using for loop
        for(int i=0; i<a.length; i++) 
        {
        	System.out.println(a[i]);
        }
   
        //Reading all the values from array using for...each loop
        for(int x:a)
        {
        	System.out.println(a[x]);
        }
      
    }
	
}
