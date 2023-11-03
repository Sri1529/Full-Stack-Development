package Hashmap;
import java.util.*;
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>m1 = new HashMap<String,Integer>();
		m1.put("Zara", 8);//key ,value....
		m1.put("Mahnaz", 5);//key ,value....
		m1.put("Domar", 9);//key ,value....
		m1.put("Katz", 4);//key ,value....
		m1.put("Katz", 8);//duplicate will removed
		
		
		System.out.println();
		System.out.println("Map elements");
		System.out.println("\t"+m1);
		System.out.print(m1.get("Katz"));

	}

}
