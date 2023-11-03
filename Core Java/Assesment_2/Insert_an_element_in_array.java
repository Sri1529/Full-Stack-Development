package Assesment_2;
import java.util.*;
public class Insert_an_element_in_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		int arr[]=new int[n];
		int aftr=n+1;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter the position where you want to insert the element:");
		int pos=sc.nextInt();
		System.out.println("enter the number to insert:");
		int ins=sc.nextInt();
		
		int arr1[]=new int[aftr];

		int j = 0;  
		  
		for(int i = 0; i<arr1.length; i++)
		{  
		  if(i==pos)
		  {  
		  arr1[i] = ins;  
		  }
		
		else   
		{  
		arr1[i] = arr[j];  
		j++;  
		}  
		}  
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
		  
}
}
