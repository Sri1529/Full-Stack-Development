package Leet_cde;
import java.util.*;
public class Sorted_array_median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the size for arr1:");
	        int n=sc.nextInt();
	        System.out.println("Enter the size for the arr2:");
	        int m=sc.nextInt();
	        int arr1[]=new int[n];
	        int arr2[]=new int[m];
	        int size=n+m;
	        int sorted[]=new int[n+m]; 
	        int temp;
	        System.out.println("Enter the elements one by ine for arr1:");
	        for(int i=0;i<n;i++)
	        {
	        	arr1[i]=sc.nextInt();
	    }
	        System.out.println("Enter the elements one by ine for arr2:");
	        for(int i=0;i<m;i++)
	        {
	        	arr2[i]=sc.nextInt();
	    }
	        //3 4 5 6 2 //1 8 9 4 5 
	       
	        int index=0;
	       for(int i=0;i<n;i++)
	       {
	    	  sorted[index++]=arr1[i];
	       }
	       for(int i=0;i<m;i++)
	       {
	    	  sorted[index++]=arr2[i];
	       }
	       
	       
	        //7 6 4 3 8 4 7 9 
	        for(int i=0;i<size;i++)
	        {
	        	for(int j=i+1;j<size;j++)
	        	{
	        		if(sorted[i]>sorted[j])
	        		{
	        			temp=sorted[j];
	        			sorted[j]=sorted[i];
	        			sorted[i]=temp;
	        			
	        			
	        		}
	        		
	        	}
	        }
	        double med[]= new double[2];
	        int midind=size/2-1;
	        int midind2=size/2;
	        
//	        for(int i=0;i<size;i++)
//	        {
//	        	System.out.print(sorted[i]+" ");
//	        }
	        if(sorted.length%2==1)
	        {
	        	med[0]=sorted[((size+1)/2)-1];
	        }
	        else
	        {
	        	med[0]=(sorted[midind]+sorted[midind2])/2;
	        	med[1]=med[0]+1;
	        }
	       System.out.println("Median ");
	        for(double a:med)
	        {
	        	System.out.print(a+" ");
	        }

	}

}
