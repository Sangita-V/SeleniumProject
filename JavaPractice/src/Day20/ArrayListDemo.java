package Day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		//Declaration
		ArrayList list = new ArrayList();    //Store heterogeneous data
		//List list=new ArrayList();		//Store heterogeneous data
		//ArrayList<Integer> list new ArrayList<Integer>();    //Only Integer type data stored 
		
		//Adding data to the Arraylist
		list.add(100);
		list.add(23.98);
		list.add("Welcome");
		list.add(null);
		list.add(null);
		list.add("Welcome");
		list.add('G');
		list.add(true);
		list.add(-56.78);
		
		//Print arraylist
		System.out.println("Print ArrayList: "+list);
		
		//Size of ArrayList
		System.out.println("Size of the ArrayList is: "+list.size());
	
		//Remove element from ArrayList
		list.remove(5);      //5 is index
		System.out.println("After removing: "+list);
		
		//Insert element in arraylist
		list.add(3, "Java");		 //3 is index
		System.out.println("After insertion: "+list);
		
		//Modify/replace/change element
		list.set(3, "Python");
		System.out.println("after modification: "+list);
		
		//Access specific element 
		System.out.println("After accesing: "+list.get(2));
		
		//Reading all the elements from arraylist
		
		//Using normal for loop
		/*
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		*/
		
		//Using for each loop
		/*
		for(Object x:list)
		{
			System.out.println(x);
		}
		*/
		
		//Using iterator
		
		Iterator it=list.iterator();
		while(it.hasNext())      //check the element is present or not in the list and go to next element  //access its elements one by one
		{
			System.out.println(it.next());   //capture the element
		}
		
		//Checking arraylist is empty or not
		System.out.println(list.isEmpty());
		
		//remove multiple elements  -  need to create new arraylist for elements which we want to remove 
		ArrayList arr=new ArrayList();
		arr.add(null);
		arr.add('G');
		
		list.removeAll(arr);
		System.out.println("After removing 2 elements:"+list);
		
		//Remove all the elments
		list.clear();
		System.out.println(list.isEmpty());
	}

}
