package Array;
import java.util.*;
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements one by one:");
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		//int flag=1;
		System.out.println("Enter the number to search:");
		int search=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(search==arr[i])
			{
				System.out.println("The element "+search+" is available at"+(i+1)+" position");
			}
			
		}
//		if(flag==1)
//		{
//			System.out.println("The element "+search+" is available ");
//		}
//		else
//		{
//			System.out.println("Not available");
//		}

	}

}
