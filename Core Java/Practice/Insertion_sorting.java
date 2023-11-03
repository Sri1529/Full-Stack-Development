package Practice;
import java.util.*;
public class Insertion_sorting {
	
	public static void insertionsort(int arr[],int n)
	{
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
		
	}
	public static void print(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		int arr[]=new int [n];
		System.out.println("enter the elements one by one:");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		insertionsort(arr,n);
		print(arr,n);

	}

}
