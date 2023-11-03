package Practise;
import java.util.*;
public class Upper_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int r=sc.nextInt();
		
		System.out.println("Enter the no of Columns:");
		int c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++)
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
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	

	}

}
