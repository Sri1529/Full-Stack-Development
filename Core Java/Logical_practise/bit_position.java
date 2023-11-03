package Logical_practise;
import java.util.*;
public class bit_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String nb="";
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int div,index=0;
		int arr[]=new int[n];
		while(n!=0)
		{
			div=n%2;
			nb=div+nb;
			n=n/2;
			
			arr[index++]=div;
			
			
			
			
			
			
		}
		System.out.println(nb);
		
//		for(int i=index-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+" ");
//		}
		System.out.println("Enter the position you want to check");
		int ch=sc.nextInt();
		if(nb.charAt(ch-1)==1)
		{
			System.out.println("1 is present at the given position");
		}
		else
		{
			System.out.println("0 is present at the given position");
		}
		
		
		
		

	}

}
