package Task;
import java.util.*;
public class Factorial {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find factorial:");
		int a=sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=a;i++)
		{
			fact =fact*i;
		}
		
		System.out.printf("Factorial is %d",fact);
	}

}
