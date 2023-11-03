package Sorting;
import java.util.*;

public class heapsorting {

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
		
		//8 4 6 2 1 
		for (int step=num-1;step>=0;step--)
		{
			int max_i=step;
			for (int i=step-1;i>=0;i--)
			{
				if (ar[max_i]<ar[i])
				{
					max_i=i;
				}
			}
			temp=ar[step];
			ar[step]=ar[max_i];
			ar[max_i]=temp;
			
			
		}
		// 4 3 2 7 9 8
		System.out.println();
		System.out.print("After sorting:  ");
		for (int i=0;i<num;i++)
		{
			System.out.print(ar[i]+" ");
		}
				
		
		

	}

}