package Assesment_4;
import java.util.*;
class quicksort
{
	static int partition(int array[],int low,int high)
	{
		int pivot=array[high];
		int i=(low-1);
		for (int j=low;j<high;j++)
		{
			if (array[j]<=pivot)
			{
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		return(i+1);
	}
	static void quicksort(int arr[],int low,int high)
	{
		if (low <high)
		{
			int pi=partition(arr,low,high);
			quicksort(arr,low,pi-1);
			quicksort(arr,pi+1,high);
			
		}
	}
}

public class quick_sorting {
	

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
		
		System.out.println("before Sorting:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		int size=arr.length;
		quicksort.quicksort(arr,0,size-1);
		System.out.println("Sorted array in ascending oreder: ");
		System.out.println(Arrays.toString(arr));
		
		

	}

}