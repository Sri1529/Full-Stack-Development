package Set;
import java.util.*;
public class Example_1_tree_set {

	public static void main(String[] args) {
		int count[]= {34,22,10,60,30,22};
		Set<Integer>set =new HashSet<Integer>();//set is used to remove the duplicate elements..
		                                        //hash set is used to make a tree structure to find duplicate elements
		for(int i=0;i<count.length;i++)
		{
			set.add(count[i]);
		}
		System.out.println(set);
//_______________________________________________________________________________________________________________________		
		TreeSet<Integer>sortedSet = new TreeSet<Integer>(set);//tree set is used to sort the elements
		System.out.println("The sorted list is:");
		System.out.println(sortedSet);
//__________________________________________________________________________________________________________________________		
		System.out.println
		("The First element of the set is:"+sortedSet.first());
		System.out.println
		("The last element of the set is:"+sortedSet.last());
		
		
		

	}

}
