package Sorting;
import java.util.*;
public class Bubble_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int temp=0;
        
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        
        System.out.println("Before sorting:");
        for(int i=0;i<n;i++)
        {
        	System.out.print(a[i]+" ");
        }
        
       for(int i=0;i<n;i++)
       {
    	   for(int j=i+1;j<n;j++)
    	   {
    		   if(a[i]>a[j])
    		   {
    			   temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    			   
    		   }
    	   }
       }
       // 8 5 7 2 1 
        System.out.println("");
        
        System.out.println("After sorting:");
        for(int i=0;i<n;i++)
        {
        	System.out.print(a[i]+" ");
        }
        
        
	}

}
