package Practise;
import java.util.*;
public class Fibnocis_series {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<n;i++)
		{
			c=a+b;
			
			System.out.print(c+" ");
			
			
			a=b;
			b=c;
			
			
			
		}
	}

}


//0 1 1 2 3 5 8 13