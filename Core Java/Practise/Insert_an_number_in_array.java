package Practise;
import java.util.*;
public class Insert_an_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
       System.out.println("Given numbers are listed below:");
       for(int i=0;i<n;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
       System.out.println("");
       System.out.println("Enter the position you want to insert the element:");
       int pos=sc.nextInt();
       System.out.println("Enter the element you want to insert the element:");
       int ins=sc.nextInt();
       int temp;
       int arr1[]=new int[n+1];
       
       int j=0;
       for(int i=0;i<n+1;i++)
       {
    	   if(i==pos)
    	   {
    		   
    		   arr1[i]=ins;
    		
    	   }
    	   else
    	   {
    		   arr1[i]=arr[j];
    		   j++;
    	   }
       }
       for(int i=0;i<n+1;i++)
       {
    	   System.out.print(arr1[i]+" ");
       }
       
       
	}

}
