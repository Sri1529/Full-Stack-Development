package Task;
import java.util.*;
public class Count_the_no_of_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,count=0;
		String x="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal number:");
		n=sc.nextInt();
		
		while(n>0)
		{
			int a=n%2;
			x=a+x;
			n=n/2;
		}
		
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)=='1')
			{
				count++;
			}
		}
System.out.println("No of 1's are: "+count);
	

	}

}
