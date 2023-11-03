package Set;
import java.util.*;
public class Set_Operations {
	public static void main(String args[])
	{
		Integer[]a= {22,45,33,66,55,34,77};
		Integer []b= {33,2,83,45,3,12,55};
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(a));
		
		Set<Integer>set2 =new HashSet<Integer>();
		set2.addAll(Arrays.asList(b));
		
		
		//Finding union of set 1 and set2	
		Set<Integer>union_Set=new HashSet<Integer>(set1);
		union_Set.addAll(set2);
		System.out.println("Union of set1 and set2");
		System.out.println(union_Set);
		
		//Finding Intersection of set1 and set 2
		Set<Integer>Intersection_set = new HashSet<Integer>(set1);
		Intersection_set.retainAll(set2);
		System.out.println("Intersection of set1 and set2:");
		System.out.println(Intersection_set);
		
		//Finding difference of set1 and set2
        Set<Integer>difference_data=new HashSet<Integer>(set1);	
        difference_data.removeAll(set2);
        System.out.println("Difference of set1 and set2:");
		System.out.println(difference_data);
        
		
	}

	
}
