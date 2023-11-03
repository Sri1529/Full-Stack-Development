package Matrix;
import java.util.*;
public class Non_repeated_characters_at_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the size oif the array:");
		int n=sc.nextInt();
		System.out.println("ENter the elements one by one:");
		
		int arr[]= new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("The elements in the array are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Non repeating elements:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j]&&i!=j)
				{
					//System.out.println("Non repeating elements:"+arr[j]);
					flag=1;
					
					
				}
				
			}
			
			if(flag==0)
			{
				System.out.print(arr[i]+" ");
			}
			
			flag=0;
		}
		
		
		

	}

}
