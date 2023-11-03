package Collections;
import java.util.*;
public class inputsfromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of the array:");
		int n=sc.nextInt();
		
		ArrayList<String>arr=new ArrayList<String>();
		System.out.println("Enter the elemets one by one:");
		for(int i=0;i<n;i++)
		{
			arr.add(sc.next());
		}
		
		Collections.sort(arr);
		for(String str:arr)
		{
			System.out.println(str);
			
		}
		arr.add("thd");
	//	arr.remove(4);
		System.out.println(arr.contains("SSr"));
		
		arr.clear();
		System.out.println(arr);
			

	}
	

}
