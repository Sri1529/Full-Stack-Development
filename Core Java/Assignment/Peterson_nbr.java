package Assignment;
import java.util.*;
public class Peterson_nbr {

	public static void main(String[] args) {
		
		int fact=1,nb=0,flag=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int nbr=sc.nextInt();
		int temp=nbr;
		String str=Integer.toString(nbr);
		int len=str.length();
			
		for(int i=1;i<=len;i++)
		{
			
              nb=nbr%10;
              nbr=nbr/10;

			for(int j=1;j<=nb;j++)
			{
				fact=fact*j;
			}
			//System.out.println(fact);
			count=fact+count;
			
			
			fact=1;
			
			
		}
//System.out.println(count);
		
		if(temp==count)
		{
			System.out.println(temp+" is a peterson number");
		}
		else
		{
			System.out.println(temp+" is not a peterson number");
		}
		
		
		

		

	}

}
