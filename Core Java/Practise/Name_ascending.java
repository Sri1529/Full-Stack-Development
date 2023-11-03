package Practise;
import java.util.*;
public class Name_ascending
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no.of names you need:");
		int name=sc.nextInt();
		
		String arr[]=new String[name];
		
		for(int i=0;i<name;i++)
		{
			arr[i]=sc.next();
		}
		
		String letter="a";
		System.out.println("The Given names are:");
		for(int i=0;i<name;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
		
		
	}

}
