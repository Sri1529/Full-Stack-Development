package Assesment_4;
import java.util.*;
public class Heap_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int temp;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Before Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		for (int j=n-1;j>=0;j--)
		{
			int max_i=j;
			for (int i=j-1;i>=0;i--)
			{
				if (arr[max_i]<arr[i])
				{
					max_i=i;
				}
			}
			temp=arr[j];
			arr[j]=arr[max_i];
			arr[max_i]=temp;
			
			
		}
		System.out.println("After Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
