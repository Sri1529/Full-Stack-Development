package Collection_practise;
import java.util.*;
public class Linkedlist 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>ll=new LinkedList<String>();
		
		ll.add("sri");
		ll.add("hari");
		ll.add("sakthi");
		ll.add("noble");
		System.out.println("The elements in the Linkedlist are: "+ll);
		
		
		System.out.println("The elements in the Linkedlist are :");
		for(String str:ll)
		{
			System.out.print(str+" ");
		}
		
		ll.addFirst("First");
		ll.addLast("Last");
		System.out.println("The elements in the Linkedlist are :");
		for(String str:ll)
		{
			System.out.print(str+" ");
		}
		System.out.println();
		ll.remove(3);
		System.out.println("The elements in the Linkedlist are: "+ll);
		
		ll.set(4, "Four");
		System.out.println("The elements in the Linkedlist are: "+ll);
		
		System.out.println("The elements in the Linkedlist are: "+ll.size());
		
		ll.removeFirst();
		System.out.println("The elements in the Linkedlist are: "+ll);
		
		ll.removeLast();
		System.out.println("The elements in the Linkedlist are: "+ll);
		
		boolean result=ll.contains("noble");
		System.out.println(result);
		
		Collections.sort(ll);
		System.out.println("The elements in the Linkedlist are: "+ll);
		
//		ll.clear();
//		System.out.println(ll);
		

	}

}
