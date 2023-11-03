package Practice;
import java.util.*;
public class bubblesorting {

	public static void bubblesort(int arr[],int n)
	{
	  for(int i=0;i<n-1;i++)
	  {
		  for(int j=0;j<n-i-1;j++)
		  {
			  if(arr[j]>arr[j+1])
			  {
				  int temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
				  
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the elements one by one:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	      bubblesort(arr,n);
	      print(arr,n);
		

	}

}
