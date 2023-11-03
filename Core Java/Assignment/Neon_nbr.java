package Assignment;
import java.util.*;
public class Neon_nbr {
	public static void main(String args[])
	{
		int nb,nb1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int nbr=sc.nextInt();
		int temp=nbr;
		int sqr=(int) Math.pow(nbr, 2);
		//System.out.println(sqr);
		
		int neon=sqr;
		String str=Integer.toString(neon);
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			nb=neon%10;
			neon=neon/10;
			sum=nb+sum;
			
		}
		
		//System.out.println(sum);
		if(sum==temp)
		{
			System.out.println("It is a neon number :");
		}
		else
		{
			System.out.println("It is not a neon number");
		}
		
	}

}
