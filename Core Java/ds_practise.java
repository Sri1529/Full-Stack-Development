import java.util.*;
public class ds_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int n=sc.nextInt();
		System.out.println("Enter the size of array 2");
		int n1=sc.nextInt();
		
		int arr[]=new int[n];
		int arr1[]=new int[n1];
		System.out.println("Enter the elements for array 2:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elements for array 2:");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.print("Intersection:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
		int index=0;
		int inter[]=new int[index];
		System.out.println();
		
		Set<Integer>obj=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			obj.add(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			obj.add(arr1[i]);
		}
		System.out.println("Union:");
		for(Integer i:obj)
		{
			System.out.print(i+" ");
		}
		
		

	}

}
