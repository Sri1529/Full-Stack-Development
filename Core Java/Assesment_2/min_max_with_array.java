package Assesment_2;
import java.util.*;
public class min_max_with_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		
		int min =arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		
		System.out.println("Maximim element:"+max);
		System.out.println("Minimum element:"+min);
		

	}

}
