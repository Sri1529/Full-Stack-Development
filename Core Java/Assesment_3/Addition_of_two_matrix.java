package Assesment_3;
import java.util.*;
public class Addition_of_two_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,product=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows for 1st matrix:");
		int r1=sc.nextInt();
		System.out.println("Enter the no of columns for 1st matrix:");
		int c1=sc.nextInt();
		System.out.println("Enter the no of rows for 2nd matrix:");
		int r2=sc.nextInt();
		System.out.println("Enter the no of columns for 2nd matrix:");
		int c2=sc.nextInt();
		System.out.println("Enter the elements one by one for 1st matrix:");
		
		int arr[][]=new int [r1][c1];
		int arr1[][]=new int [r2][c2];
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements one by one for 2nd matrix:");
		
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("The given matrix of 1st is:");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
			
		

	}
		System.out.println("The given matrix of 2nd is:");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int add[][]=new int[r1][c1];
		int mult[][]=new int[r1][c1];
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				sum=arr[i][j]+arr1[i][j];
				add[i][j]=sum;
				
			}
		}
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				product=arr[i][j]*arr1[i][j];
				mult[i][j]=product;
				
			}
		}
		System.out.println("Addition of two matrix is:");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Product of two matrix is:");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(mult[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
