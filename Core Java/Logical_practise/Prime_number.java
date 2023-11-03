package Logical_practise;
import java.util.*;
public class Prime_number {
// 2 3 5 7
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int it=0;int i=1;int j=0;int count=0;
		
		while(it<n)
		{
			j=1;
			count=0;
			while(i>=j)
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
