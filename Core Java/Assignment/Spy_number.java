package Assignment;
import java.util.*;
public class Spy_number {
	public static void main(String args[]) {
		int sum=0,mult=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int nbr=sc.nextInt();
		String str=Integer.toString(nbr);
		int len=str.length();
		int temp=nbr;
		for(int i=0;i<len;i++)
		{
			int nb=nbr%10;
			nbr=nbr/10;
			//
			sum=nb+sum;
			mult=nb*mult;
			
		}		
//		System.out.println(sum);
//		System.out.println(mult);
		if(sum==mult)
		{
			System.out.println(temp+" is a spy number");
		}
		else
		{
			System.out.println(temp+" is not a spy number");
		}
	}

}
