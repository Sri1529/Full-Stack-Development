package Logical_practise;
import java.util.*;
public class Local_maxima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		// 3 2 21 4 5 -1
		int j=0,count=0;;
		for(int i=0;i<n;i++)
		{
			if(arr[0]>arr[n-1]&&arr[0]>arr[1])
			{
				System.out.println(arr[0]);
				break;
			}
			for( j=i+1;j<n-1;j++)
			{
				if(arr[i]<=arr[j])
				{
					if(arr[j+1]<arr[j])
					{
						System.out.println(arr[j]);
						count++;
						//break;
						
					}
				}
				
			}
			//System.out.println("Count:"+count);
			if(count==2)
			{
				break;
			}
		}

	}

}
