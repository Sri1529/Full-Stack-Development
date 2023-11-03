package Practise;
import java.util.*;
public class next_greates_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the size of the array:");
		int n=sc.nextInt(),flag=0;
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
				
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					
					System.out.println(arr[i]+"->"+arr[j]);
					break;
					
				}
				else
				{
					System.out.println(arr[i]+"->1");
					break;
				}
				
				
				
			}
			
			
		}
		
//		for(int i=0;i<n;i++)
//		{
//			if(arr[i]==arr[n-1])
//			{
//				System.out.println(arr[i]+"->1");
//				flag=1;
//			}
//			
//			for(int j=i+1;j<n;j++)
//			{
//				if(arr[i]<arr[j])
//				{
//					System.out.println(arr[i]+"->"+arr[j]);
//					flag=1;
//					break;
//				}
//			}
//			if(flag==0)
//			{
//				System.out.println(arr[i]+"->1");
//				flag=0;
//			}
//		}
		

	}

}
