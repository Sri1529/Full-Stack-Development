package Practise;
import java.util.*;
public class Lower_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int r =sc.nextInt();
		System.out.println("Enter the no of columns:");
		int c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int flag=0;
		for(int i=0;i<c;i++)
		{
			
			for(int j=i+1;j<r;j++)
			{
				
				if(arr[i][j]==0)
				{
					flag++;
				}
			}
			
		}
		
		if(flag>=3)
		{
			System.out.println("Yes");
			
		}
		else
		{
		
			System.out.println("No");

	}

	}
}
