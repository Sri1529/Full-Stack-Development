package Sorting;
import java.util.*;

public class Bubble_sorting_inclass_and_objects {

	static void bubblesort(int a[],int n)
	{
		for(int step=0;step<n-1;step++)
		{
			for(int i=0;i<n-step-1;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	}
	static void print(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size of the array:");
          n=sc.nextInt();
          int a[]=new int[n];
          System.out.println("Enter the elements one by one:");
          for(int i=0;i<n;i++)
          {
        	  a[i]=sc.nextInt();
          }
          
          bubblesort(a,n);
          System.out.println("After bubblesorting:");
          print(a,n);
          sc.close();
          
	}

}
