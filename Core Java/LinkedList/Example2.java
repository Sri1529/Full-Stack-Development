package LinkedList;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>arr= new LinkedList<String>();
		
		arr.add("Item 1");
		arr.add("Item 2");
		arr.add("Item 3");
		arr.add("Item 4");
		arr.add("Item 5");
		
		System.out.println(arr);
		arr.addFirst("Item 0");
		arr.addLast("Item last");
		System.out.println(arr);
		
		Object frstval=arr.get(0);
		System.out.println("First val:"+frstval);
		
		arr.set(0, "Zeroo");
		Object scndval=arr.get(3);
		System.out.println("Index "+scndval);
		
		arr.removeFirst();
		arr.removeLast();
		
		System.out.println("After removing 1st and last: "+arr);
		
		Object str1=arr.clone();
		System.out.println("CLone :"+str1);
		
		arr.poll();//poll is used to remove the element as same as the removemethod()
		System.out.println(arr);
		arr.pollFirst();
		System.out.println("1st element removed"+arr);
		arr.pollLast();
		System.out.println("Last element removeed"+arr);
		
		
		arr.addLast("Item 1");
		arr.removeFirstOccurrence("Item 1");
		System.out.println(arr);
		arr.removeLastOccurrence("Item 1");
		System.out.println(arr);
		
		

	}

}
