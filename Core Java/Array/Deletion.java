package Array;
import java.util.*;
public class Deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the elements one by one:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the position to delete from the array:");
		int pos=sc.nextInt();
		
		System.out.println("Before deletion:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
         System.out.println();
         int j=pos;
         while(j<n)
         {
        	 arr[j-1]=arr[j];
        	 j++;
         }
         n=n-1;
         System.out.println("After deletion:");
         for(int i=0;i<n;i++)
         {
        	 System.out.print(arr[i]+" ");
         }
         
	}

}
