package Assesment_3;
import java.util.*;
public class Move_all_zero_to_front {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int b=n;
		int temp=0,zero=0;;
		int arr[]=new int [n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The given elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				zero++;
			}
		}
		int c=0;
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			
			if(arr[i]==0)
			{
			  
				arr1[c]=arr[i];
				c++;
				
				
				
			}
			else
			{
				arr1[zero]=arr[i];
				zero++;
			}
			}
		
		System.out.println("After moving the zeros to front:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
			

	}

}
