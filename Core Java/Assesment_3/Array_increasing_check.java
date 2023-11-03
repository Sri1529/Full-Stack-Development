package Assesment_3;
import java.util.*;
public class Array_increasing_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
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
		int flag=0;
		for(int i=0;i<n;i++)
		{ 
			if(i==n-1)
			{
				break;
			}
			if(arr[i]<arr[i+1])
			{
				flag=1;
				
			}
			else
			{
				flag=2;
				break;
			}
				
			}
	
		if(flag==1)
		{
			System.out.println("Strictly increasing");
		}
		if(flag==2)
		{
			System.out.println("Not increasing");
		}

	}

}
