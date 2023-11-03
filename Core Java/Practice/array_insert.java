package Practice;
import java.util.*;
public class array_insert 
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of the array:");
    	int n=sc.nextInt();
    	int size =n+1;
    	
    	System.out.println("Enter the array elements:");
    	
    	int arr[]=new int[n];
    	
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	
    	System.out.println("Enter the position to insert the number:");
    	int pos = sc.nextInt();
    	
    	System.out.println("Enter the number to insert:");
    	int nbr= sc.nextInt();
    	
    	
    	
    	int arr1[]=new int[size];
    	int j=0;
    	for(int i=0;i<arr1.length;i++)
    	{
    		if(i==pos)
    		{
    			arr1[i]=nbr;
    		}
    		else
    		{
    			arr1[i]=arr[j];
    			j++;
    		}
    	}
    	
    	for(int i=0;i<arr1.length;i++)
    	{
    		System.out.print(arr1[i]);
    	}
    	
    	
    	
    	
    }
}
