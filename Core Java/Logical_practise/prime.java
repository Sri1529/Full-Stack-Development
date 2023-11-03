package Logical_practise;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		int i=1,j,count=0,it=0;
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
				System.out.println(i);
				it++;
			}
			i++;
		}

	}

}
