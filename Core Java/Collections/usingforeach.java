package Collections;
import java.util.*;
public class usingforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr=new ArrayList<String>();
		

		arr.add("Steve");
		arr.add("rde");
		arr.add("fdvds");
		arr.add("rggv");
		arr.add("rgrfg");
		arr.add("wfg");
		arr.add("hari");
		arr.add("stark");
		
		System.out.println("Array list ");
		System.out.println(arr);
		
		
		System.out.println("Array list using for each:");
		for(String str1:arr)
		{
			System.out.println(str1);
		}

	}

}
