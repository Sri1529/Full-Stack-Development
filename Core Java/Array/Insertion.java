package Array;
import java.util.*;
public class Insertion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the Elements one by one:");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the position of the element you want to insert:");
		int pos=sc.nextInt();
		System.out.println("Enter the number of the element you want to insert:");
		int ins=sc.nextInt();
		
		int arr1[]=new int[n+1];
		int count=0;
		for(int i=0;i<n+1;i++)
		{
			if(i+1==pos)
			{
				arr1[i]=ins;
			}
			else
			{
				arr1[i]=arr[count];
				count++;
			}
		}
		System.out.println("After insertion:");
		for(int i=0;i<n+1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		

	}

}
