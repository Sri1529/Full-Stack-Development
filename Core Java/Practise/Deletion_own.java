package Practise;
import java.util.*;
public class Deletion_own {

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
		
		System.out.println("Enter the position you want to delete:");
		int pos=sc.nextInt();
		System.out.println("The given elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"");
		}
		System.out.println("");
		
		arr[pos-1]=arr[n-1];
		
		System.out.println("After deletion :");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+"");
		}
		

	}

}
