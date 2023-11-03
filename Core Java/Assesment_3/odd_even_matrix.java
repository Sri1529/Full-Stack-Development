package Assesment_3;
import java.util.*;
public class odd_even_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int r=sc.nextInt();
		System.out.println("Enter the no of columns:");
		int c=sc.nextInt();
		
		int arr[][]=new int [r][c];
		
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
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]%2==0)
				{
					even++;
				}
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]%2!=0)
				{
					odd++;
				}
			}
		}
		System.out.println("Even number frequency:"+even);
		System.out.println("Odd number frequency:"+odd);
		

}
}
