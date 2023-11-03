package Sorting;
import java.util.*;

public class Insertion_sorting {
	// 9 5 3 2 4 0
	//4 0 2 3 5 9
	static void insertionsort(int a[], int n)
	{
		for(int j=1;j<n;j++)
		{
			int key=j;
			for(int i=j-1;i>=0;i--)
			{
				if(a[i]>a[key])
				{
					int temp=a[i];
					a[i]=a[key];
					a[key]=temp;
					key--;
				}
			}
		}
	}
	
	static void print(int a[],int n)
	{
		System.out.println("After Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the elements one by one:");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		insertionsort(a,n);
		print(a,n);
		
		

	}

}
