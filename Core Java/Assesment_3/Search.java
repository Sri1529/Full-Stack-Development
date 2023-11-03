package Assesment_3;
import java.util.*;
public class Search {

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
		int flag=0;
		int pos=0;
		System.out.println("Enter the element you want to find:");
		int nbr=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==nbr)
			{
				flag=1;
				pos=i+1;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Elements found at position:"+pos);
		}
		else
		{
			System.out.println("Not present");
		}
		

	}

}
