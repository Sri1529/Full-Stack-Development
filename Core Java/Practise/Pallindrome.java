package Practise;
import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String small=str.toUpperCase();
		StringBuffer sb=new StringBuffer(small);
		sb.reverse();
		
		String compare =sb.toString();
		
		if(small.equals(compare))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
		
		
		
		
		

	}

}
