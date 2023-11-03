package Hashmap;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		HashMap<Integer,String>hmap = new HashMap<Integer,String>();
		
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(4, "Noble");
		hmap.put(9, "Noblerahul");
		hmap.put(3, "Anuj");
		
		Set set= hmap.entrySet();
//___________________________________________________________________________________________________________________________________		
		Iterator  iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry mentry=(Map.Entry)iterator.next();
			System.out.println("Key is:"+mentry.getValue());
			
		}
//____________________________________________________________________________________________________________________________________		
		//Get values based on key//

		String var=hmap.get(2);
		System.out.println("Value at key 2 is:"+var);
		
		// Remove value based on keys
		hmap.remove(3);
		System.out.println("Map key and values after removal");
		Set set2 = hmap.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext())
		{
			Map.Entry mentry2=(Map.Entry)iterator2.next();
			System.out.print("Key is"+mentry2.getKey()+"& value is" );
			System.out.println(mentry2.getValue());
		}
		

	}

}
