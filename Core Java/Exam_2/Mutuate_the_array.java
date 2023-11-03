package Exam_2;
import java.util.*;
public class Mutuate_the_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of ther array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements one by one:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements in the arrays are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		int add=0;
//		int add1=0;
//		int add3=0;
		
		
	for(int i=0;i<n;i++)
	{
		if(i==0 && arr[0]==0)//i==0
		{
			arr[0]=arr[1];
		}
		else if(i==n-1&&arr[n-1]==0)//i==n-1
		{
			arr[n-1]=arr[n-1]+arr[n-2];
		}
		else if(arr[i]==0)
		{
			arr[i]=arr[i-1]+arr[i+1];
		}
	}
			
			
			
	
			
		
//		for(int i=1;i<n;i++)
//		{
//			
//			if(arr[i]==0)
//			{
//				add=arr[i-1]+arr[i]+arr[i+1];
//				arr[i]=add;
//			}
//			
//			
//		}
		System.out.println("after:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
