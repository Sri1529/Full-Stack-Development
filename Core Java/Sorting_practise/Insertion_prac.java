package Sorting_practise;
import java.util.*;
public class Insertion_prac {
// 9  5 4 6 10 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter thre size of the array");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=1;i<n;i++)
		{
			int key=i;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j]>arr[key])
				{
					temp=arr[j];
					arr[j]=arr[key];
					arr[key]=temp;
					key--;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
