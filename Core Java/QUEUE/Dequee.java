package QUEUE;
import java.util.*;
public class Dequee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//DEQUE is used to add in front and last where as in queue can only do FIFO.....
		Deque<String>dq=new LinkedList<String>();
		dq.add("Sri");
		dq.add("Hari");
		dq.add("Sakthi");
		dq.add("Katz");
		dq.add("Noble");
		System.out.println("Elements in the deque: "+dq);
		System.out.println("Removed element: "+dq.removeLast());
		System.out.println("Elements in the deque: "+dq);
		System.out.println("Removed element: "+dq.removeFirst());
		System.out.println("Elements in the deque: "+dq);
		dq.addFirst("NO:1");
		System.out.println("Elements in the deque: "+dq);
		System.out.println("Head: "+dq.element());
		System.out.println("poll: "+dq.pollLast());
		System.out.println("Peek: "+dq.peek());
		System.out.println("Elements in the deque: "+dq);
		System.out.println("Elements is empty: "+dq.isEmpty());//checking whether it is empty or not.....
		
		

	}

}
