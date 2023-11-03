package Array;
import java.util.*;
public class Duplicate_removal {

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
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					if(j!=-1)
					{
						arr[j]=arr[j+1];
					}
					n=n-1;
					j--;
				}
				
			}
		}
		
		System.out.println("Array elements: ");
		for(int i=0;i<n+1;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
