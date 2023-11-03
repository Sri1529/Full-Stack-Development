package Practise;
import java.util.*;
public class Upper_trianle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int r=sc.nextInt();
		System.out.println("Enter the no of columns:");
		int c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		System.out.println("Enter the elements ine by one:");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int flag=0;
		for(int i=1;i<r;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i][j]==0)
				{
					flag++;
				}
			}
		}
		if(flag>=3)
		{
			System.out.println("Upper Triangle");
		}
		else
		{
			System.out.println("No");
		}

	}

}
