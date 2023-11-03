package Logical_practise;
import java.util.*;
public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to find occurance:");
		int occ=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==occ)
			{
				count++;
			}
		}
		System.out.println("Total no of occurance:"+count);

	}

}
