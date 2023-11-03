package Vector;
import java.util.*;
public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> vec=new Vector <String> (2);
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Grapes");
		vec.addElement("Mango");
		vec.addElement("Mango");
		
		
		
		System.out.println("Size is:"+vec.size());
		System.out.println("Default capacity increment is:"+vec.capacity());
		
		vec.addElement("Fruit1");
		vec.addElement("Fruit2");
		vec.addElement("Fruit3");
		vec.addElement("Fruit3");
		
		
		System.out.println("Size after addition:"+vec.size());
		System.out.println("Capacity after increment is:"+vec.capacity());

		vec.addElement("Fruit1");
		vec.addElement("Fruit2");
		vec.addElement("Fruit3");
		vec.addElement("Fruit3");

		vec.addElement("Fruit1");
		vec.addElement("Fruit2");
		vec.addElement("Fruit3");
		vec.addElement("Fruit3");
		System.out.println("Capacity after increment is 2222:"+vec.capacity());
		System.out.println(vec);
		for(String str:vec)
		{
			System.out.println(str);
		}
		
//_________________________________________________________________________________________________________________________________
		Enumeration en=vec.elements();
		System.out.println(" Elements are:");
		while(en.hasMoreElements())
			System.out.print(en.nextElement()+" ");
//_______________________________________________________________________________________________________________________________		

	}

}
