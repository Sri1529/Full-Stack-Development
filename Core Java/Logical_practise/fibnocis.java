package Logical_practise;
// 0 1,1, 2,3 5 8 13
import java.util.*;
public class fibnocis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		int sum=0;
		System.out.print(a+" "+b+" ");
		
		for(int i=0;i<n-2;i++)
		{
			sum=0;
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
		
		

	}

}
