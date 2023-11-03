package Practise;
import java.util.*;
public class LArgest_and_second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int max1=0;
		int arr[]=new int[n];
		
		System.out.println("Enter the elements one by one:");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Given numbers:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
 
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(max>arr[i])
			{
				max=max;
			}
			else
			{
				max=arr[i];
			}
		}
		System.out.println("");
System.out.println("Largest number:"+max);
int temp;

               for (int i = 0; i < n; i++)
                   {
                    for (int j = i + 1; j < n; j++)
                     {
                      if (arr[i] > arr[j])
                           {
                                 temp = arr[i];
                                 arr[i] = arr[j];
                                 arr[j] = temp;
                                }
                           }
                         }
               System.out.println("Second Largest:"+arr[n-2]);
               System.out.println("Largest:"+arr[n-1]);


	}

}
