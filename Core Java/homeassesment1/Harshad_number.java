package homeassesment1;
import java.util.*;
public class Harshad_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int n1=n;
		
		int split=0,sum=0;
		
		while(n>0)
		{
			split =n%10;
			sum=sum+split;
			n=n/10;
			
		}
		int divide=n1%sum;
		
		if(divide==0)
		{
			System.out.println("Harshad number");
		}
		else
		{
			System.out.println("Not Harshad number");
		}

	}

}
