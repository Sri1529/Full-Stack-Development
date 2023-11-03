package Collection_practise;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr=new ArrayList<String>();
		
		arr.add("Sri");
		arr.add("Hari");
		arr.add("Raina");
		arr.add("Dhoni");
		arr.add("Kohli");
		System.out.println("The elements in the arraylist are:"+arr);
		
		arr.add(3,"three+1");//3 points the index value
		System.out.println("The elements in the arraylist are:"+arr);
		
		arr.set(0, "Hero");//updates the value
		System.out.println("The elements in the arraylist are:"+arr);
		
		arr.remove(5);//removes the element with index value
		System.out.println("The elements in the arraylist are:"+arr);
		
		
		System.out.println("The elements in the arraylist are:");
		for(String str:arr)
		{
			System.out.print(str+" ");
		}//helps to print the elements one by one
		System.out.println();
		
		
		System.out.println("The size of the elements in the array list is:"+arr.size());
		
		Collections.sort(arr);//sorts the arrays........
		for(String str:arr)
		{
			System.out.print(str+" ");
		}
		
		int pos=arr.indexOf("Raina");
		System.out.println("Index:"+pos);
		
		String el=arr.get(3);
		System.out.println("Element:"+el);
		
		boolean result=arr.contains("Raina");
		System.out.println(result);
		
		arr.clear();
		System.out.println(arr);
		
		
		
		
		
		
		
		

	}

}
