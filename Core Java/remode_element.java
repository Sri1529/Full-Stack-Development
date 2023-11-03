import java.util.*;
public class remode_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size:");
		int n= sc.nextInt();
		int temp;
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Befre deleting:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int count=0;
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					System.out.println("Check =="+arr[j]);
				}
			}
		}
	
		//1 2 2 3 4 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				
				if(arr[i]==arr[j])
				{
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
					
					
					
					
					
				}
				
			}
		}
	
		System.out.println("count:"+count);
		System.out.println("After deleting:");
		for(int i=0;i<n-count;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
