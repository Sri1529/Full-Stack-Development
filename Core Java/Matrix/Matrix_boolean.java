package Matrix;
import java.util.*;
public class Matrix_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the row:");
		int r=sc.nextInt();
		System.out.println("Enter the size of the Column:");
		int c=sc.nextInt();
		System.out.println("Enter the elements one by one:");
		int mat[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The given matrix is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
			
			
		}
		int R[]=new int [r];
		int C[]=new int [c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				R[i]=0;
				C[j]=0;
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(mat[i][j]==1)
				{
					R[i]=1;
					C[j]=1;
				}
			}
		}
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(R[i]==1 || C[j]==1)
				{
					mat[i][j]=1;
					
				}
			}
		}
		
		System.out.println("The Output matrix is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
			
			
		}

	}

}
