package Operators;
import java.util.*;
public class task01 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the three number");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The biggest among 3 numbers is "+a);
		}
		
		else if(b>a && b>c)
		{
			System.out.println("The biggest among 3 numbers is "+b);
			
		}
		
		else {
			System.out.println("The biggest among 3 numbers is "+c);
		}
		
	}

}
