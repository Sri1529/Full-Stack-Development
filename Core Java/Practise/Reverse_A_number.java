package Practise;
import java.util.*;
public class Reverse_A_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int split=0;
		String x="";
		while(n>0)
		{
			 split=n%10;
			 x=x+split;
			 n=n/10;
			
		}
		
		System.out.println(x);

	}

}
