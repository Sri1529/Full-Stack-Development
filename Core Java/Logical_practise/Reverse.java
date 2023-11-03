package Logical_practise;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String rev=sc.next();
		String r="";
		
		int len=rev.length();
		System.out.println(len);
		for(int i=len-1;i>=0;i--)
		{
			r=r+rev.charAt(i);
		}
		System.out.println("rev ="+rev);
		System.out.println("r ="+r);
		if(r.equals(rev))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not a pallindrome");
		}

	}

}
