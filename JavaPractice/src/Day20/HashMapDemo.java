package Day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		//Declaration
		HashMap map=new HashMap();
		//Map m=new HashMap();
		//HashMap<Integer,String> m=new HashMap<Integer,String>();   //for specific data
		
		//adding pairs
		map.put(101, "Joe");
		map.put(101, "Pheb");
		map.put("joe", 30);
		map.put(102, "Mon");
		map.put(103, "Ross");
		map.put(104, "Rech");
		map.put("Gender", 'F');
		
		System.out.println(map);
		
		//size of hashmap
		System.out.println("Size of the HashMap:"+map.size());
		
		//Remove pair
		map.remove(103);
		System.out.println("After removing"+map);
		
		//Accessing value of the key
		System.out.println(map.get(104));
		
		//Retrieve all the keys
		System.out.println(map.keySet());
		
		//Retrieve all the values
		System.out.println(map.values());
		
		//Retrieve keys-values
		System.out.println(map.entrySet());
		
		//Reading data using for...each
		
		for(Object k:map.keySet())
		{
			System.out.println(k+"  "+map.get(k));
		}
		
		//Reading data using iterator
		Iterator<Entry<Object,Object>>it=map.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println("Map data:"+it.next());
		}
		
		//Clearing all 
		map.clear();
		System.out.println(map.isEmpty());
	}

}
