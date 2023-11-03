package Logical_practise;
import java.util.*;

public class Second_larges_and_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size:");
		
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>=arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
			System.out.println("Second Largest: "+arr[n-2]);
			System.out.println("Smallest: "+arr[0]);
			for(int a:arr)
			{
				System.out.print(a+" ");
			}
			int i=0;
		for( i=n-1;i>0;i--)
		{
			if(arr[i]!=arr[i-1])
			{
				break;
			}
		}
		System.out.println("what "+arr[i-1]);
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
