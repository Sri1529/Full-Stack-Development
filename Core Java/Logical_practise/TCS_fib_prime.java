package Logical_practise;
import java.util.*;
public class TCS_fib_prime {
	public int  flag;
	public  void fib(int n)
	{
		
		int a=0,b=1,c;
		System.out.print("Fib:");
		for(int i=0;i<n;i++)
		{
			c=a+b;
			System.out.print(c+ " ");
			b=a;
			a=c;
			
			flag=0;
			
			
		}
		System.out.println();
	}
	
	public void prime(int n)
	{
		int count=0,i=1,j=1,it=0;
		System.out.print("Prime:");
		while(it<n)
		{
			j=1;
			count=0;
			while(j<=i)
			{
				if(i%j==0)
				{
					count++;
				}
				j++;
			}
			if(count==2)
			{
				System.out.print(i+" ");
				it++;
				flag=1;
			}
			i++;
		}
		
	}
	public  void mixed(int n)
	{
		if(flag==1)
		{
			fib(n);
		}
		else if(flag==0)
		{
			prime(n);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		TCS_fib_prime s = new TCS_fib_prime();
		s.fib(n);
		s.prime(n);
		s.mixed(n);
		
		//1 1 2 3 5 8
		
		
		
		
		

	}

}
