package Task;
import java.util.*;
public class Reverse_and_pallindrome {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to get reversed :");
		int num = sc.nextInt();
		int d1=num;
		int res=0,remainder;
		while(num!=0)
		{
			remainder =num%10;
			res = res*10+remainder;
			num=num/10;
		}
		System.out.println("The reversed number is :"+res);
		
		//palindrome
		
		if(res==d1)
		{
			System.out.print("Palindrome");
		}
		else
		{
			System.out.print("not a Palindrome");
		}
		
		
	}

}
