package Practice;
import java.util.*;
public class Insertion_deletion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The given elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the position you want to insert in the element:");
		int pos=sc.nextInt();
		System.out.println("Enter the number you want to insert in the element:");
		int nbr=sc.nextInt();
		
		int arr1[]=new int[n+1];
		int j=0;
		for(int i=0;i<n+1;i++)
		{
			if(i==pos)
			{
				arr1[i]=nbr;
			}
			else
			{
			   arr1[i]	=arr[j];
			   j++;
			}
		}
		System.out.println("After inserting:");
		for(int i=0;i<n+1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
			

	}

}
