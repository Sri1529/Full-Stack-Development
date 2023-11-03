package Practise;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        System.out.println("Given elements are:");
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        
      int temp;  
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        System.out.println("");
        System.out.println("After sorting:");
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        
        System.out.println("");
        System.out.println("Largest number:"+arr[n-1]);
        
	}

}
