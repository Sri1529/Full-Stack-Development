package Assesment_3;
import java.util.*;
public class Find_the_number_with_helpofposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
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
		
		System.out.println("Enter the position of the number:");
		int pos=sc.nextInt();
		
		int find=0;
		for(int i=0;i<n;i++)
		{
			if(i==pos)
			{ 
				
				find=arr[i-1];
			}
		}
		System.out.println("Number "+find);

	}

}
