package Array;
import java.util.*;
public class Array_input_from_user {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the number to get stored in aarray:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The numbers are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
