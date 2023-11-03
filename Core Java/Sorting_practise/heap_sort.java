package Sorting_practise;
import java.util.*;
public class heap_sort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		int arr1[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		} 
		System.out.println("Before Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr1[i]);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			int max=i;
			for(int j=i-1;j>=0;j--)
			{
				if(arr1[j]>arr1[max])
				{
					max=j;
				}
			}
			temp=arr1[i];
			arr1[i]=arr1[max];
			arr1[max]=temp;
		}
		System.out.println("After Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr1[i]);
		}
		//4 0 2 3 5 9
	}

}
