package Assesment_4;
import java.util.*;
public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the elements one by one:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Before sorting:");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=1;i<n;i++)
		{
			int key=i;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j]>arr[key])
				{
					int temp=arr[j];
					arr[j]=arr[key];
					arr[key]=temp;
					key--;
				}
			}
		}
		System.out.println("After sorting:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
