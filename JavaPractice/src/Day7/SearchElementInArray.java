package Day7;

public class SearchElementInArray {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50,60};
		int search_element=400;
		
		boolean status=false;
		/*
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false) {
		System.out.println("Element not found");
		}
	*/

	//For each
		
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.println("Element Found");
			}
		}
		if(status==false)
		{
			System.out.println("Element not found");
		}
	}
}
