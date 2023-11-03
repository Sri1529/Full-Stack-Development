package LinkedList;
import java.util.*;
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>arr =new LinkedList();
		
		arr.add("Sri");
		arr.add("Hari");
		arr.add("sakthi");
		arr.add("Noble");
		arr.add("nine");
		
		arr.addFirst("Hero");
		arr.addLast("Zero");
		
		arr.add(0,"index");
		
		System.out.println(arr);
		
		for(String str:arr)
		{
			System.out.println(str);
		}
		
//________________________________________________________________________________________________________________________________		
		Iterator<String> iterator=arr.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
//__________________________________________________________________________________________________________________________________		

		arr.removeFirst();
		System.out.println(arr);
		arr.removeLast();
		System.out.println(arr);
		
		arr.remove(0);
		System.out.println(arr);
		
		
		
	}

}
