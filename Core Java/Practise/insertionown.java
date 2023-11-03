package Practise;
import java.util.*;
public class insertionown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int [n+1];
		System.out.println("Enter the position you want to insert:");
		int pos=sc.nextInt();
		System.out.println("Enter the element you want to insert:");
		int nbr=sc.nextInt();
		int count=0;
		for(int i=0;i<n+1;i++)
		{
			if(i==pos)
			{
				arr1[i]=nbr;
				
			}
			else
			{
                  arr1[i]=arr[count];
                  count++;
			}
		}
		
		System.out.println("The elements before insertion:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("The elements after insertion:");
		for(int i=0;i<n+1;i++)
		{
			System.out.print(arr1[i]+" ");
		}

	}

}
