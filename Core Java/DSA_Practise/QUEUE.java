package DSA_Practise;
import java.util.*;
public class QUEUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>s= new LinkedList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s);
		s.remove();
		System.out.println(s);
		boolean result=s.isEmpty();
		System.out.println(result);
	}

}
