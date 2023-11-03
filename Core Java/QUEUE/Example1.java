package QUEUE;
import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String>q=new LinkedList<String>(); 
		
		q.add("Sri");
		q.add("Hari");
		q.add("Sakthi");
		q.add("Katz");
		q.add("Noble");
		
//___________________________________________________________________________________________________________________________	
		System.out.println("Elements in queue: "+q);
		
		
		
//__________________________________________________________________________________________________________________________	
		System.out.println("Remove element: "+q.remove());
		//removes the first element because FIFO QUEUE:First in first out
		
//____________________________________________________________________________________________________________________________	
		System.out.println("Head: "+q.element());
		//prints first element.......
		
		
//___________________________________________________________________________________________________________________________________		
		System.out.println("Poll: "+q.poll());
		//removes the element as like remove...
		/** 
		 When the queue is empty
		          remove() -- will throws an exception
		          poll() -- prints null
		   
		 **/
		
//___________________________________________________________________________________________________________________________________				
		System.out.println("Peek: "+q.peek());
		//prints first element.......as the cursor points.......
		
		
//___________________________________________________________________________________________________________________________________				
		System.out.println("Elements in queue: "+q);
		
		
		

	}

}
