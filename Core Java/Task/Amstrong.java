package Task;
import java.util.*;
public class Amstrong {
	public static void main(String args[])
	{
		int digit=0,rem,res=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nbr :");
		int a1 =sc.nextInt();
		
		temp=a1;
		
		while(a1!=0)
		{
			digit++;
			a1=a1/10;
			
		}
		
		a1=temp;
		while(a1!=0)
		{
			rem=a1%10;
			res=(int) (res +Math.pow(rem, digit));
			a1=a1/10;
		}
		
		if(temp==res)
		{
			System.out.println("amstrong nbr");
		}
		
		else
		{
			System.out.println("not amstrong nbr");
		}
		sc.close();
		
	}

}
