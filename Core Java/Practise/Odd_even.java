package Practise;
import java.util.*;
public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Given elements:");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("Even numbers:");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("");
		System.out.println("Odd numbers:");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		
		
		

	}

}
