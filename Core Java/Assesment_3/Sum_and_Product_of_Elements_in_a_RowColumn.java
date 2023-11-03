package Assesment_3;
import java.util.*;
public class Sum_and_Product_of_Elements_in_a_RowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,product=1,sum1=0,product1=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int r=sc.nextInt();
		System.out.println("Enter the no of columns:");
		int c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		System.out.println("Enter the elements one by one:");
		
		for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
		{
			arr[i][j]=sc.nextInt();
		}
		}
		
		System.out.println("The given matrix is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum product:");
	int f=0,h=0;
	System.out.println("Sum  Product");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum=arr[i][j]+sum;
				f=i+1;
				
			}
			
			System.out.println("Row "+f+":"+sum);
		}
		for(int i=0;i<r;i++)
		{
			product=1;
			for(int j=0;j<c;j++)
			{
				
				product=arr[i][j]*product;
				h=i+1;
				
			}
			
			
			System.out.println("row "+h+":"+product);
		}
		int f1=0,h1=0;
		for(int j=0;j<r;j++)
		{
			for(int i=0;i<c;i++)
			{
				sum1=arr[i][j]+sum1;
				f1=i+1;
			}
			System.out.println("Column "+f1+":"+sum1);
		}
		for(int j=0;j<r;j++)
		{
			product1=1;
			for(int i=0;i<c;i++)
			{
				
				product1=arr[i][j]*product1;
				h1=i+1;
				
			}
			
			
			System.out.println("Columnn "+h1+":"+product1);
		}
		
			
		
		
		

	}

}
