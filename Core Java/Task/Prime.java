package Task;
import java.util.*;
public class Prime {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int a = sc.nextInt();
		
		if(a==1)
		{
			System.out.println("prime nbr");
		}
		
		for(int i=2;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println("not prime number");
				break;}
				
				else
				{
					System.out.println("prime nbr");
					break;
				}
		}
		
		
		}
			
		
		
	}


