package Leet_cde;
import java.util.*;
public class target_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(6%10);
		System.out.println(6/10);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
	    System.out.println("Enter the elements one by one");
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the tagret");
		int target=sc.nextInt();
		
		
		for(int j=0;j<n;j++)
		{
			for(int i=1;i<n;i++)
			{
				if(arr[j]+arr[i]==target)
				{
					System.out.println(j+" "+i);
					break;
					
				}
			}
		}
		
		
		
		

	}
// 1 2 3 
	//5
}
