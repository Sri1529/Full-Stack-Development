package Sorting;
import java.util.*;
public class selection_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=s.nextInt(); 
		int ar[]=new int[num];
		System.out.println("Enter the values: ");
		for (int i=0;i<num;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.print("Before sorting: ");
		for (int i=0;i<num;i++)
		{
			System.out.print(ar[i]+" ");
		}
		for (int step=0;step<num-1;step++)
		{
			int min_i=step;
			for (int i=step+1;i<num;i++)
			{
				if (ar[min_i]>ar[i])
				{
					min_i=i;
				}
			}
			temp=ar[step];
			ar[step]=ar[min_i];
			ar[min_i]=temp;
			
		}
		//9 8 0 4 5 7
		System.out.println();
		System.out.print("After sorting:  ");
		for (int i=0;i<num;i++)
		{
			System.out.print(ar[i]+" ");
		}
				
		
		

	}

}