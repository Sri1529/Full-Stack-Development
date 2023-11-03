package Assesment_3;
import java.util.*;
public class Count_the_occurance_of_an_array {

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
		System.out.println("Enter the number you want to check the occurance:");
		int src=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==src)
			{
				count++;
			}
		}
		
		System.out.println("The number of occurance:"+count);
		

	}

}
