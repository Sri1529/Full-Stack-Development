package Array;
import java.util.*;
public class Array_min_max {

	public static void main(String[] args) {
		
		int min,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the number to get stored in aarray:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The numbers are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		min =arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("Maximum element"+max);
		System.out.println("Minimum element"+min);
		

	}

}
