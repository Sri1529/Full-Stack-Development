package Array;
import java.util.*;
public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("Enter the position to update the element:");
		int pos=sc.nextInt();
		
		System.out.println("Enter the number to update in the array list:");
		int nbr=sc.nextInt();
		
		arr[pos-1]=nbr;
		
		System.out.println("After update:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
