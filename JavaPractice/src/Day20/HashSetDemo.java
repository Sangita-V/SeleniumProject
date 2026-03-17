package Day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {

		//Declaration
		HashSet set=new HashSet();
//		Set<Object> set = new LinkedHashSet<>();    //if we want to print and store the elements in the order which we given than we can use LinkedHashSet 
		//Set<Object> set = new TreeSet<Object>();    //TreeSet is used if want to store the elements in sorting order (ascending order)
		//Set set=new HashSet();
		//HashSet<String> set=new HashSet<String>();   //Only String type data stored
		
		//Adding data
		set.add(458);
		set.add("Welcome");
		set.add(null);
		set.add('A');
		set.add(100);
		set.add(true);
		set.add(null);
		set.add("Java");
		set.add(67.987);
		set.add(250);
		set.add(-56.24);
		
		System.out.println("set is :"+set);
		
		//size of HashSet
		System.out.println(set.size());
	
		//Removing element
		set.remove('A');
		System.out.println("After removing:"+set);
		
		//Convert HashSet to ArrayList as not possible to remove perticular element from HashSet using index
		ArrayList arr=new ArrayList(set);
		System.out.println("After converted to ArrayList:"+arr);
		System.out.println(arr.get(2));
		
		//Reading all the elements using for..each loop
		for(Object x:set)
		{
			System.out.println(x);
		}
		
		//Reading all the elements using iterator
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Clearing set
		set.clear();
		System.out.println(set.isEmpty());
	}

}
